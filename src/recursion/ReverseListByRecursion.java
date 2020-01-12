package recursion;

import assistPack.ListNode;

/**
 * @Author: balabala
 * @Date: 2019/12/29 7:47 PM
 */

public class ReverseListByRecursion {
    private ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    private void test() {
        ListNode head = ListNode.getListNode();
        ListNode newHead = reverseList(head);
        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }

    public static void main(String[] args) {
        ReverseListByRecursion test = new ReverseListByRecursion();
        test.test();
    }
}
