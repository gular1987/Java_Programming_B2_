package day06_b_unary_operators;

public class IncrementExample3 {
    public static void main(String[] args) {
        int i=5;
        int z=i++;

        System.out.println(z);
        System.out.println(i);


        int a=10;
        int b=a+10;
        System.out.println(a);
        System.out.println(b);

        int c=++a;
        System.out.println(c);
        System.out.println(a);

        int d=a++;
        System.out.println(d);
        System.out.println(a);
    }

}
