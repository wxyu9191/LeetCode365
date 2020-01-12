package list;

import assistPack.ListNode;

/**
 * @Author: balabala
 * @Date: 2019/12/30 10:41 PM
 */

public class MergeList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = new ListNode(-1);
        ListNode head = p;
        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                head.next = l1;
                l1 = l1.next;
                head = head.next;
            }else {
                head.next = l2;
                l2 = l2.next;
                head = head.next;
            }
        }
        if (l1 == null){
            head.next = l2;
        }
        else {
            head.next = l1;
        }
        return p.next;
    }
}
