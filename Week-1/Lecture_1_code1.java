import java.util.Scanner;
// By Opps
public class code1 {
    private String color;
    private String company;
    private String model;
    private String design;
    private int topSpeed;

    public code1(String color, String company, String model, String design, int topSpeed) {
        this.color = color;
        this.company = company;
        this.model = model;
        this.design = design;
        this.topSpeed = topSpeed;
    }

    public void displayDetails() {
        System.out.println();
        System.out.println("Car Details: ");
        System.out.println("Color: " + color);
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Design: " + design);
        System.out.println("Top Speed: " + topSpeed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the color of the car: ");
        String color = sc.nextLine();
        System.out.print("Enter the company of the car: ");
        String company = sc.nextLine();
        System.out.print("Enter the model of the car: ");
        String model = sc.nextLine();
        System.out.print("Enter the design of the car: ");
        String design = sc.nextLine();
        System.out.print("Enter the top speed of the car: ");
        int topSpeed = sc.nextInt();
        code1 car1 = new code1(color, company, model, design, topSpeed);
        car1.displayDetails();
        sc.close();
    }
}
