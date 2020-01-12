package stackAndQueue;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: balabala
 * @Date: 2020/1/5 11:39 PM
 */

public class MovingWindowAvg {
    int size;
    List queue = new ArrayList<>();
    //滑动窗口大小
    public MovingWindowAvg(int size){
        this.size = size;
    }

    public double next(int val){
        queue.add(val);
        int windowSum = 0;
        for (int i = Math.max(0, queue.size() - size); i < queue.size(); i++){
            windowSum += (int)queue.get(i);
        }
        System.out.println(windowSum);
        System.out.println(queue);
        return windowSum;
    }

    public static void main(String[] args) {
        MovingWindowAvg mv = new MovingWindowAvg(3);
        mv.next(1);
        mv.next(2);
        mv.next(3);
        mv.next(4);
    }
}
