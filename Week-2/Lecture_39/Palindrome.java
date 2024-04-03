import java.util.*;

class Palindrome{
    public static void isPalindrome(String str){
        int n = str.length();
        boolean flag = true;
        int i = 0 , j = n-1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag){
            System.out.println("The string is a palindrome");
        }
        else{
            System.out.println("The string is not a palindrome");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        isPalindrome(str);
    }
}