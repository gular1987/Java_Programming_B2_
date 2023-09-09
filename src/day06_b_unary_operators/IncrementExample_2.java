package day06_b_unary_operators;

public class IncrementExample_2 {
    public static void main(String[] args) {

        int age=20;
        System.out.println(age);
        System.out.println(age++);
        System.out.println(age);

        System.out.println(age++ +2);
        System.out.println(age);

        System.out.println(++age +2);
        System.out.println(age);

        System.out.println(++age + ++age +2);
    }
}
