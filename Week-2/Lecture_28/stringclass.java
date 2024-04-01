public  package Lecture_28;

class stringclass {
    String str = "CipherSchools"; // create using string literal - stored in string pool
    String str1 = "CipherSchools";
    String str2 = new String("CipherSchools"); // create using new keyword - stored in heap memory
    String str3 = new String("CipherSchools");

    System.out.println(str == str1); // true == operator checks the reference of the object and value for premitive data types
    System.out.println(str2 == str3); // false
    System.out.println(str == str2); // false
    System.out.println(str2.equals(str3)); // true equals method checks the value of the object
    // concat method
    System.out.println(str.concat(" is the best")); // CipherSchools is the best
}