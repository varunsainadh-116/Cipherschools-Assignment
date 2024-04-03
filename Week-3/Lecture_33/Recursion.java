import java.util.*;

class Recursion {
    public static void printDecreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n - 1);
    }
    public static void main(String[] args) {
        // recursion function to print decreasing numbers
        printDecreasing(5);
        System.out.println();
    }
}