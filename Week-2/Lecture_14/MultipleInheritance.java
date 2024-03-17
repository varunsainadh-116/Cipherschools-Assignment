package Lecture_14;
// Interface 1
interface Interface1 {
    void method1();
}

// Interface 2
interface Interface2 {
    void method2();
}

// Class implementing Interface1 and Interface2
class Multiple implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Method 1 implementation");
    }

    public void method2() {
        System.out.println("Method 2 implementation");
    }
}

// Main class to test
public class MultipleInheritance {
    public static void main(String[] args) {
        Multiple obj = new Multiple();
        obj.method1();
        obj.method2();
    }
}
