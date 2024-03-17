import java.util.*;

public class ArrayPassing{
    public static void addone(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i]++;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        addone(arr);
        System.out.print("The elements of the array after adding 1 to each element are: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}