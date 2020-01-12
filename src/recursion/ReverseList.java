package recursion;

import assistPack.ListNode;

/**
 * @Author: balabala
 * @Date: 2019/12/29 5:22 PM
 * 反转链表的关键就是每一步都要明确 前驱节点、当前要反转的节点、以及后续节点
 */

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode preNode = null;
        ListNode nextNode;
        while (head != null) {
            nextNode = head.next;
            head.next = preNode;
            preNode = head;
            head = nextNode;
        }
        return preNode;
    }
}
