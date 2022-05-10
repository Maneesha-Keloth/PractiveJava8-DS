package com.training.samples.linkedlist;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        addPrecedingZeros(l1, l2);
        ListNode result = new ListNode(0);
        sumNodes(l1,l2,result);
        return reverseList(result.next);
    }

    ListNode reverseList(ListNode l){
        if(l == null || l.next == null)
            return l;
        ListNode t = reverseList(l.next);
        l.next.next = l;
        l.next = null;
        return t;
    }

    int sumNodes(ListNode l1, ListNode l2, ListNode result){
        if(l1 == null)
            return 0;
        int num = sumNodes(l1.next,l2.next,result)+l1.val + l2.val ;
        ListNode n = new ListNode(num%10);
        n.next = result.next;
        result.next = n;
        return num/10;

    }


    void addPrecedingZeros(ListNode node1, ListNode node2){
        ListNode next1 = node1.next;
        ListNode next2 = node2.next;
        while(next1 !=null && next2 != null){
            next1=next1.next;
            next2=next2.next;
        }
        if(next1 == null && next2 != null){
            while(next2 != null){
                ListNode tmp1 = new ListNode(0);
                tmp1.next = next1.next;
                next1.next = tmp1;
                next2 = next2.next;
            }
        }
        if(next1 != null && next2 == null){
            while(next1 != null){
                ListNode tmp2 = new ListNode(0);
                tmp2.next = next2.next;
                next2.next = tmp2;
                next1 = next1.next;

            }
        }

    }
}
