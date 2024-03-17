package accmodifier2;
import accmodifier1.*;

class code3 extends code1{
    public static void main(String[] args) {
        code1 obj = new code1();
        code3 obj2 = new code3();
        // System.out.println(obj.x); defuat not accessible outside of package
        // System.out.println(obj.y); // private not accessible outside of class
        System.out.println(obj.z);
        System.out.println(obj2.w);
    }
}