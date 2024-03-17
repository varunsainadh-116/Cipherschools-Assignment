package accmodifier2;
import accmodifier1.*;
class code4 {
    public static void main(String[] args) {
        code1 obj = new code1();
        // System.out.println(obj.x); defuat not accessible outside of package
        // System.out.println(obj.y); // private not accessible outside of class
        System.out.println(obj.z); // public accessible everywhere
        // System.out.println(obj.w); // protected not accessible outside of package
    }
}