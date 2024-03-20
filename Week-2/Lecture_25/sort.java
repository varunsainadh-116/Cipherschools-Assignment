import java.util.*;
import java.util.Arrays;
public class sort{
    private int[] arr;
    sort(int [] arr){
        this.arr = arr;
    }
    public void display(){
        Arrays.sort(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sort obj = new sort(arr);
        obj.display();
        sc.close();
    }
}