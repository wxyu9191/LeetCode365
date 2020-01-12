package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: balabala
 * @Date: 2020/1/5 10:02 PM
 */

public class JavaQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        System.out.println("The first element is: " + q.peek());

        q.offer(5);
        q.offer(13);
        q.offer(8);
        q.offer(6);

        q.poll();
        System.out.println("The first element is: " + q.peek());
        System.out.println(q.size());
    }
}
