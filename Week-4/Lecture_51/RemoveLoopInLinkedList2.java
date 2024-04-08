package Lecture_51;


import java.util.HashSet;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class RemoveLoopInLinkedList2 {
    public void removeLoopUsingHashing(ListNode head) {
        if (head == null || head.next == null)
            return; // No loop if there are 0 or 1 nodes

        HashSet<ListNode> visited = new HashSet<>();
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            if (visited.contains(current)) {
                prev.next = null; // Break the loop
                return;
            }
            visited.add(current);
            prev = current;
            current = current.next;
        }
    }

}
