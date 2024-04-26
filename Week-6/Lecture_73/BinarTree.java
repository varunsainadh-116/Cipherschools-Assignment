import java.util.*;

class BinaryTree {

    static class Node {
        int data;
        Node left;
        Node right;
    };

    static Node newNode(int data) {
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;

        return (node);
    }

    static boolean isSameStructure(Node a, Node b) {

        if (a == null && b == null)
            return true;

        if (a != null && b != null) {
            return (isSameStructure(a.left, b.left) &&
                    isSameStructure(a.right, b.right));
        }

        return false;
    }

    public static void main(String args[]) {
        Node root1 = newNode(10);
        Node root2 = newNode(100);
        root1.left = newNode(7);
        root1.right = newNode(15);
        root1.left.left = newNode(4);
        root1.left.right = newNode(9);
        root1.right.right = newNode(20);

        root2.left = newNode(70);
        root2.right = newNode(150);
        root2.left.left = newNode(40);
        root2.left.right = newNode(90);
        root2.right.right = newNode(200);

        if (isSameStructure(root1, root2))
            System.out.printf("Both trees have same structure");
        else
            System.out.printf("Trees do not have same structure");
    }
}
