import java.util.*;
public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();
        System.out.print("Your name is " + name + ", you are " + age + " years old, and you earn " + salary + " dollars.");
    }
}
```