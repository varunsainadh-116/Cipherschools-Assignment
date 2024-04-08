package Lecture_50;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class RemoveLoopInLinkedList1 {
    public void removeLoop(ListNode head) {
        if (head == null || head.next == null) {
            return; // No loop if there are 0 or 1 nodes
        }

        ListNode slow = head;
        ListNode fast = head;

        // Detect the loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break; // Loop detected
            }
        }

        // If there's no loop, return
        if (fast == null || fast.next == null) {
            return;
        }

        // Find the start of the loop
        slow = head;
        while (slow != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        // Break the loop
        fast.next = null;
    }

    // Other methods and main method for demonstration
}

