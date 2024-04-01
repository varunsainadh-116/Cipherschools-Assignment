
public  package Lecture_29;

class stringclass2 {
    String str = "CipherSchools"; // create using string literal - stored in string pool
    String str1 = new String("CipherSchools"); // create using new keyword - stored in heap memory

    System.out.println(str == str1); // false
    System.out.println(str.equals(str1)); // true equals method checks the value of the object
    // create a new string from charachter array
    char[] ch = {'C', 'i', 'p', 'h', 'e', 'r', 'S', 'c', 'h', 'o', 'o', 'l', 's'};
    String str2 = new String(ch);
    System.out.println(str2); // CipherSchools
    // this constructor overloaded to take byte array

}
