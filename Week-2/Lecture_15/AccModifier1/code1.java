package accmodifier1;
public class code1 {
    int x = 10; // default
    private int y = 20;
    public int z = 30;
    protected int w = 40;

    public static void main(String[] args) {
        code1 obj = new code1();
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
        System.out.println(obj.w);
    }
}