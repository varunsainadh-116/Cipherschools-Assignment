import java.util.*;

class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        // apporach 1 is best for reverse string than approach 2
        int n = str.length();
        char ch[] = new char[n];
        for(int i=0; i<n; i++){
            ch[i] = str.charAt(n-i-1);
        }
        String revs = new String(ch);
        System.out.println("Reverse String: "+revs);
        //approach 2
        String rev = "";
        for(int i=n-1; i>=0; i--){
            rev += str.charAt(i);
        }
        System.out.println("Reverse String: "+rev);
        // even we can use StringBuffer class to reverse the string means that new object is created and the string is reversed
        // approach 3 two pointer approach
        int i=0, j=n-1;
        char c[] = new char[n];
        while(i<=j){
            c[i] = str.charAt(j);
            c[j] = str.charAt(i);
            i++;
            j--;
        }
        String revstr = new String(c);
        System.out.println("Reverse String: "+revstr);
        
    }
}