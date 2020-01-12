package assistPack;

import java.util.ArrayList;

/**
 * @Author: balabala
 * @Date: 2019/12/15 10:07 PM
 */

public class ListNode {
    public static ListNode sample = new ListNode(-1);

    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }


    public static ListNode getInstance(ListNode sample, int len) {
        ListNode head = sample;
        for (int i = 0; i < len; i++){
            ListNode newNode = new ListNode(i);
            head.next = newNode;
            head = newNode;
        }
        return sample;
    }

    public static ListNode structList(ListNode sample) {
        ListNode head = sample;
        for (int i = 0; i < 3; i++){
            ListNode newNode = new ListNode(i);
            head.next = newNode;
            head = newNode;
        }
        return sample;
    }

    public static ListNode getListNode(){
        ListNode newHead = structList(sample);
        return newHead;
    }

    public static void main(String[] args) {
//        ListNode instance = getInstance(sample, 3);
//        System.out.println(instance);
//        while (instance != null){
//            System.out.println(instance.val);
//            instance = instance.next;
//        }
        ListNode newHead = getListNode();
        while (newHead != null){
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }
}
