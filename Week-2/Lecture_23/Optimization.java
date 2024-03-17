import java.util.*;

class Optimization{
    public static boolean isPrime1(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime2(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        long timestrat1 = System.currentTimeMillis();
        System.out.println(isPrime1(n));
        long timestop1 = System.currentTimeMillis();
        System.out.println("Time taken by isPrime1: " + (timestop1 - timestrat1) + "ms");
        long timestrat2 = System.currentTimeMillis();
        System.out.println(isPrime2(n));
        long timestop2 = System.currentTimeMillis();
        System.out.println("Time taken by isPrime2: " + (timestop2 - timestrat2) + "ms");
        sc.close();
    }

}