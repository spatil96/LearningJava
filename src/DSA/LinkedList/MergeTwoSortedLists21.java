package DSA.LinkedList;
// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1); // dummy node
        ListNode cur = head;

        // Traverse both lists and merge
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }

        // Attach remaining nodes from list1 or list2
        if (list1 == null) {
            cur.next = list2;
        } else {
            cur.next = list1;
        }

        return head.next; // return the merged list (starting from head.next)
    }
}

public class MergeTwoSortedLists21 {
    // Helper method to create a linked list from an array
    public static ListNode createList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Helper method to print a linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create two sorted linked lists
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6, 8};

        ListNode list1 = createList(arr1);
        ListNode list2 = createList(arr2);

        // Print the original lists
        System.out.println("List 1:");
        printList(list1);

        System.out.println("List 2:");
        printList(list2);

        // Merge two lists using the Solution class
        Solution solution = new Solution();
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        // Print the merged list
        System.out.println("Merged List:");
        printList(mergedList);
    }
}
