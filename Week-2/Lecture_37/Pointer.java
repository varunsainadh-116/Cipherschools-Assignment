import java.util.*;
import java.util.Arrays;

class Pointer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the sum to be found:");
        int sum = sc.nextInt();
        Arrays.sort(arr);
        int left = 0, right = n-1;
        boolean found = false;
        while(left < right){
            if(arr[left] + arr[right] == sum){
                found = true;
                break;
            }
            else if(arr[left] + arr[right] < sum){
                left++;
            }
            else{
                right--;
            }
            if(found){
                System.out.println("Pair found: "+arr[left]+" "+arr[right]);
            }
            else{
                System.out.println("Pair not found");
        }
        
    }
    sc.close();
}
}