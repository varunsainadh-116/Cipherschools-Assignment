import java.util.*;
public class Sele{
    public static void slection(int[] arr){
        // Time complexity: O(n^2)
        int  n = arr.length;
        for(int i = 0; i<n-1; i++){
            int min = i;
            for(int j = i+1; j<n; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        slection(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}