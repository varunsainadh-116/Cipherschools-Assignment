package Lecture_14;
// Parent Class 1
class Parent1 {
    void method1() {
        System.out.println("Method 1 from Parent1");
    }
}

// Parent Class 2
class Parent2 {
    void method2() {
        System.out.println("Method 2 from Parent2");
    }
}

// Class inheriting from Parent1 and Parent2
class MultipleInheritance extends Parent1 {
        // Since we can't inherit from two classes directly, we'll use composition.
    private Parent2 parent2 = new Parent2();
    void method2() {
        parent2.method2(); // Delegate the method call to Parent2
    }
}

// Main class to test
public class Multipleinheritance2 {
    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.method1(); // Inherits from Parent1
        obj.method2(); // Overrides method2 from Parent2
    }
}

