package accmodifier1;
class code2 {
    public static void main(String[] args) {
        code1 obj = new code1();
        System.out.println(obj.x);
        System.out.println(obj.w);
        System.out.println(obj.z);
        // System.out.println(obj.y); private not accessible outside of class
    }
}