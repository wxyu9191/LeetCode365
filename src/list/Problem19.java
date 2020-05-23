package list;

import assistPack.ListNode;

/**
 * @Author: balabala
 * @Date: 2020/4/23 11:32 PM
 * rm -n node
 */

public class Problem19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode start = pre, end = pre;
        while (n != 0) {
            start = start.next;
            n--;
        }

        while (start.next != null){
            start = start.next;
            end = end.next;
        }
        end.next = end.next.next;
        return pre.next;
    }
}
