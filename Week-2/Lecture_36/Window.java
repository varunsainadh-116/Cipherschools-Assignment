import java.util.*;
public class Window{
    public static int maxSum(int[] arr, int n, int k){
        int sum =0;
        for(int i = 0; i<n; i++){
            sum += arr.get(i);
        }
        int max_sum = sum;
        for(int i = 0; i<n-k; i++){
            sum = sum - arr.get(i) + arr.get(i+k);
            if(sum>max_sum){
                max_sum = sum;
            }
        }
        return max_sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the size of window: ");
        int k = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int result = maxSum(arr, n, k);
        System.out.println("Maximum sum of window of size "+k+" is: "+result);
    }
}