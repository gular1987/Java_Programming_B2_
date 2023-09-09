package day06_a_arithmetic_operators;

public class CastingExample {
    public static void main(String[] args) {
       short numOne=40;
       float numTwo=numOne;//short smaller,float bigger ,so implicit(widening) casting happens;
        System.out.println(numOne);
        System.out.println(numTwo);

        float num3=100.5F;
        short num4=(short) num3;//float bigger data/t but short smaller data/t so this is explicitly(narrowing)casting

        char letter='A';
        int letterInt;
    }
}
