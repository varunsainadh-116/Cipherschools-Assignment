public  package Lecture_30;
import java.util.*;
class stringclass3 {
    Scanner sc = new Scanner(System.in);
    String str = "CipherSchools"; // create using string literal - stored in string pool
    String str1 = new String("CipherSchools"); // create using new keyword - stored in heap memory

    // create a new string from charachter array
    char[] ch = {'C', 'i', 'p', 'h', 'e', 'r', 'S', 'c', 'h', 'o', 'o', 'l', 's'};
    // partial string from charachter array
    String str2 = new String(ch, 1, 4);
    System.out.println(str2); // iphe
    // changing case of the string
    System.out.println(str2.toLowerCase()); // cipherschools
    System.out.println(str2.toUpperCase()); // CIPHERSCHOOLS
    // splitting the string
    String str3 = "Cipher Schools is the best";
    String[] str4 = str3.split(" "); // " " denotes the delimiter
    // str4 = ["Cipher", "Schools", "is", "the", "best"] size is 5
    for(String s: str4){
        System.out.println(s);
    }
    String doText = sc.nextLine();
    String[] words = doText.split("[.]"); // a dot is a meta chat in regex so we need to escape it
    for(String word: words){
        System.out.println(word);
    }
}
