import java.util.*;

public class BinarySearch{
    public static void binary(int[] arr, int target){
        int left  = 0;
        int right  = arr.length-1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == target){
                System.out.println("The element present at index " + mid);
                return;
            }
            else if(target < arr[mid]){
                right = mid -1;
            }
            else{
                left = mid + 1;
            }
            System.out.println("Element not found");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the sorted array elements");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        binary(arr , target);
    }
}