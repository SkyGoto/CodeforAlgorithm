package com.code;

/**
 * Topic position:   Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */

class ListNode {
    int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

public class MergeTwoSortedLists {
    ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode l3,l4,lm,ls;
        if (l1.val > l2.val) {
            ls = l3 =l4 = l2;
            l4 = l3.next;
            lm = l1;
        }else {
            ls = l3 = l1;
            l4 = l3.next;
            lm = l2;
        }
        while (lm!= null && l4 != null) {
            if (lm.val < l4.val) {
                l3.next = lm;
                lm = lm.next;
                l3.next.next = l4;
                l3 = l3.next;
            }else {
                l3=l4;
                l4 = l4.next;
            }
        }
        if (lm != null) {
            l3.next = lm;
        }
        return ls;

    }
}


/* 使用递归可以有效的减少复杂度:

public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
}


 */
