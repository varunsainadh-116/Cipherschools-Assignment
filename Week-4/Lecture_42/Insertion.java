import java.util.*;
class Insertion{
    static class  Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node insertAtPosition(Node head, int element, int position){
        Node newNode = new Node(element);
        if(position == 1){
            newNode.next = head;
            head = newNode;
        }else{
            Node temp = head;
            for(int i=1;i<position-1;i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return head;
    }
    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number of elements in the linked list");
        int n = sc.nextInt();
        Node head = null;
        Node tail = null;
        for(int i=0;i<n;i++){
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        System.out.println("Enter the element to be inserted");
        int element = sc.nextInt();
        System.out.println("Enter the position to be inserted");
        int position = sc.nextInt();
        head = insertAtPosition(head,element,position);
        printList(head);
    }
}