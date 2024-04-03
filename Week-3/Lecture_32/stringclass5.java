public  package Lecture_32;
import java.util.*;
class stringclass3 {
    // Extract substring from a string
    String str  = "CipherSchools";
    System.out.println(str.substring(6)); // Schools
    System.out.println(str.substring(0, 6)); // Cipher
    // find the character at a particular index
    System.out.println(str.charAt(6)); // S
    // replace a character
    System.out.println(str.replace('S', 's')); // Cipher schools
    // replace a substring
    System.out.println(str.replace("Schools", "schools")); // Cipher schools
    // chech if string is empty
    String str2 = "";
    System.out.println(str2.isEmpty()); // true
    System.out.println(str.isEmpty()); // false
    System.out.println(str.equals(str2)); // false
    System.out.println(str2.Blank()); // true
    // compare two strings
    String str3 = "CipherSchools";
    System.out.println(str.compareTo(str3)); // 0
    System.out.println(str.compareTo(str2)); // 12