import java.util.Scanner;

class Nthnode {
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            head = insert(head, x);
        }
        int k = sc.nextInt();
        System.out.println(nthNode(head, k));
        sc.close();
    }

    static Node insert(Node head, int x) {
        Node temp = new Node(x);
        if (head == null)
            return temp;
        Node temp1 = head;
        while (temp1.next != null)
            temp1 = temp1.next;
        temp1.next = temp;
        return head;
    }

    static int nthNode(Node head, int k) {
        Node temp = head;
        for (int i = 0; i < k - 1; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

}