import java.util.*;

class Arrayinput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("The elements of array are: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}