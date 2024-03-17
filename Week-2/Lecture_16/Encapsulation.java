import java.util.*;

class Details{
    private String name , address;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void display(){
        System.out.println("Details: ");
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age);
    }
}

class Encapsulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Details d = new Details();
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the address: ");
        String address = sc.nextLine();
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        d.setName(name);
        d.setAddress(address);
        d.setAge(age);
        d.display();
        sc.close();
    }
}