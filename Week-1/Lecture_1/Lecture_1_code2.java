import java.util.Scanner;
// POP
public class code2 {
    public static void displayDetails(String color, String company, String model, String design, int topSpeed) {
        System.out.println("Color: " + color);
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Design: " + design);
        System.out.println("Top Speed: " + topSpeed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the color of the car: ");
        String color1 = sc.nextLine();  
        System.out.print("Enter the company of the car: ");
        String company1 = sc.nextLine();
        System.out.print("Enter the model of the car: ");
        String model1 = sc.nextLine();
        System.out.print("Enter the design of the car: ");
        String design1 = sc.nextLine();
        System.out.print("Enter the top speed of the car: ");
        int topSpeed1 = sc.nextInt();

        displayDetails(color1, company1, model1, design1, topSpeed1);
        sc.close();
    }
}
