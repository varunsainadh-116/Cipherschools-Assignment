import java.util.*;

class Rotation {
    public static boolean isRoatation(String str1 , String str2){
        if(str1.length() != str2.length()) return false;
        for(int i =0; i<str1.length(); i++){
            str1 = str1.substring(1) + str1.substring(0,1);
            if(str2.equals(str1)) return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // pplease enter the string 2 in rotation of string 1
        System.out.print("Enter the str1 : ");
        String str1 = sc.nextLine();
        System.out.print("Enter the str2 : ");
        String str2 = sc.nextLine();
        int result = isRoatation(str1 , str2) ? 1 : 0;
        System.out.println(result);
    }
}