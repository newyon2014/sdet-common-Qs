package _LinkedList;

import java.util.List;

public class MergeTwoSortedLinkedList {
    private ListNode top;
    private int length;

    private class ListNode {
        private int data; // Can be a generic type
        private ListNode next; // Reference to next ListNode in list

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // OPTION I
    public ListNode merge(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a == null)
            tail.next = b;
        else
            tail.next = a;

        return dummy.next;
    }

    // OPTION II
    public ListNode mergeII(ListNode a, ListNode b) {
        //ListNode dummy = new ListNode(0);
        ListNode head = null;
        if (a.data <= b.data) {
            head = a;
            a = a.next;
        } else {
            head = b;
            b = b.next;
        }
        ListNode tail = head;
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a == null)
            tail.next = b;
        else
            tail.next = a;
        return head;
    }
}
