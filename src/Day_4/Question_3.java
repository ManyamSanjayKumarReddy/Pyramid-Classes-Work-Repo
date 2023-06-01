package Day_4;

public class Question_3 {
    public static void main(String[] args){
        int a = 10;
        int b = 25;

        a = b + ++a;        // 25 + (11)
        b = ++b + ++a;      // (26) + (12)
        System.out.println(a);
        System.out.println(b);
    }
}
