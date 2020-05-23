package list;

import java.util.HashMap;
import java.util.LinkedList;

class LRUCache {
    private int capacity;
    private HashMap<Integer,Integer> map;
    private LinkedList<Integer> list;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        list=new LinkedList<>();
    }

    public int get(int key) {
        if(map.containsKey(key)){
            list.remove((Integer)key);
            list.addLast(key);
            return map.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            list.remove((Integer)key);
            list.addLast(key);
            map.put(key,value);
            return;
        }
        if(list.size()==capacity){
            map.remove(list.removeFirst());
            map.put(key,value);
            list.addLast(key);
        }
        else{
            map.put(key,value);
            list.addLast(key);
        }
    }

    public static void main(String[] args) {
        LRUCache lru = new LRUCache(2);
        lru.put(1,1);
        lru.put(2,2);
        lru.get(1);
        lru.put(3,3);
        lru.get(2);
        lru.put(4,4);
        lru.get(1);
        lru.get(3);
        lru.get(4);

    }
}
