import java.util.Scanner;

class Middle{
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public static Node deleteNode(Node head, int x){
        if(head == null){
            return null;
        }
        if(head.data == x){
            return head.next;
        }
        Node curr = head;
        while(curr.next != null && curr.next.data != x){
            curr = curr.next;
        }
        if(curr.next != null){
            curr.next = curr.next.next;
        }
        return head;
    }
    public static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    public static void main(String[] args){
        System.out.println("Enter the size of the linked list");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        Node tail = null;
        System.out.println("Enter the elements of the linked list");
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            if(head == null){
                head = new Node(x);
                tail = head;
            }else{
                tail.next = new Node(x);
                tail = tail.next;
            }
        }
        System.out.println("Enter the element to find the middle of the linked list");
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle element is: " + slow.data);
        System.out.println("Enter the element to be deleted");
        int x = sc.nextInt();
        head = deleteNode(head, x);
        printList(head);
        sc.close();
    }
}