package Day_4;

// Increment and Decrement Problems are Most Important
public class IncDec {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        a = ++a;
        b = ++b + ++a;
        System.out.println(a);
        System.out.println(b);
    }
}
