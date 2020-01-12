package recursion;

import assistPack.ListNode;

/**
 * @Author: balabala
 * @Date: 2019/12/15 10:06 PM
 */
class LinkedListSwap {
    private ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode sec = head.next;
        // 将头两个节点之后的节点看成一个整体X，那么12交换之后，1应该指向的是X
        head.next = swapPairs(sec.next);
        // 然后2指向1
        sec.next = head;
        return sec;
    }
}
