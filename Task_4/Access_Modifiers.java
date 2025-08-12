package Task_4;

public class Access_Modifiers {
    private int a = 10;
    int b = 20;
    protected int c = 30;
    public int d = 40;

    public static void main(String[] args) {
        Access_Modifiers obj = new Access_Modifiers();
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}