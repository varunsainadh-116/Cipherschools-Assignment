import java.util.Scanner;

class Intersection {
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
        Node head1 = null;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            head1 = insert1(head1, x);
        }
        int m = sc.nextInt();
        Node head2 = null;
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            head2 = insert2(head2, x);
        }
        Node head = intersection(head1, head2);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        sc.close();
    }

    static Node insert1(Node head, int x) {
        Node temp = new Node(x);
        if (head == null)
            return temp;
        Node temp1 = head;
        while (temp1.next != null)
            temp1 = temp1.next;
        temp1.next = temp;
        return head;
    }
    static Node insert2(Node head, int x) {
        Node temp = new Node(x);
        if (head == null)
            return temp;
        Node temp1 = head;
        while (temp1.next != null)
            temp1 = temp1.next;
        temp1.next = temp;
        return head;
    }
    static Node intersection(Node head1, Node head2){
        Node head = new Node(0);
        Node temp = head;
        while(head1!=null && head2!=null){
            if(head1.data == head2.data){
                temp.next = new Node(head1.data);
                temp = temp.next;
                head1 = head1.next;
                head2 = head2.next;
            }
            else if(head1.data < head2.data){
                head1 = head1.next;
            }
            else{
                head2 = head2.next;
            }
        }
        return head.next;
    }
}