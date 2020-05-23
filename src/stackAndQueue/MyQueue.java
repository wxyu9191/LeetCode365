package stackAndQueue;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: balabala
 * @Date: 2020/1/5 3:49 PM
 */

public class MyQueue {
    private List<Integer> data;
    private int p_start;
    public MyQueue(){
        data = new ArrayList<>();
        p_start = 0;
    }
    public boolean enQueue(int x){
        data.add(x);
        return true;
    }
    public boolean deQueue(){
        if (isEmpty()){
            return true;
        }
        p_start++;
        return true;
    }

    public int Front(){
        return data.get(p_start);
    }

    public boolean isEmpty(){
        return p_start >= data.size();
    }
}
