public  package Lecture_30;
import java.util.*;
class stringclass4 {
    String str = "CipherSchools"; // create using string literal - stored in string pool
    // Length of String
    System.out.println("Length of the string is: " + str.length());
    // finding index of a character
    System.out.println("Index of 'S' is: " + str.indexOf('S')); // S is first occuring at index 6
    // finding index of a character is not present
    System.out.println("Index of 'Z' is: " + str.indexOf('Z')); // Z is not present so it will return -1
    // for second or nth occurence of a character
    System.out.println("Index of 'S' after 2nd occurence is: " + str.indexOf('s', 7)); // S is second occuring at index 10
    // count of a character
    int index = 0;
    while(index != -1){
        index = str.indexOf('o' , index+1);
        if(index  == -1) break;
        System.out.println("Index of 'o' is: " + index);
    }
}
