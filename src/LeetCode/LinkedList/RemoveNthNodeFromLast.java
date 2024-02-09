package LeetCode.LinkedList;

public class RemoveNthNodeFromLast {
    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        for(int i=1; i <=n+1; i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
    public static void main(String[] args) {
        RemoveNthNodeFromLast solution = new RemoveNthNodeFromLast();
//
//        // Example 1
//        ListNode head1 = new ListNode(1);
//        head1.next = new ListNode(2);
//        head1.next.next = new ListNode(3);
//        head1.next.next.next = new ListNode(4);
//        head1.next.next.next.next = new ListNode(5);
//        int n1 = 2;
//        System.out.println("Input: ");
//        printList(head1);
//        ListNode result1 = solution.removeNthFromEnd(head1, n1);
//        System.out.println("Output: ");
//        printList(result1);
//
//        // Example 2
//        ListNode head2 = new ListNode(1);
//        int n2 = 1;
//        System.out.println("Input: ");
//        printList(head2);
//        ListNode result2 = solution.removeNthFromEnd(head2, n2);
//        System.out.println("Output: ");
//        printList(result2);

        // Example 3
        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        int n3 = 1;
        System.out.println("Input: ");
        printList(head3);
        ListNode result3 = solution.removeNthFromEnd(head3, n3);
        System.out.println("Output: ");
        printList(result3);
    }
}
