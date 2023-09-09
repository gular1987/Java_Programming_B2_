package day06_b_unary_operators;

public class Store {
    public static void main(String[] args) {
        String store="Target";
        int numbOfTv=100;
        System.out.println("Person come to the store and they bought a Tv");
        System.out.println("Number of Tv now:"+ --numbOfTv);
        System.out.println("Another person came and bought 1 more Tv");
        System.out.println("Number of TV now:"+ --numbOfTv);
        System.out.println("In report,it shows that we have total"+numbOfTv);
        System.out.println("First ha returned a TV ");
        System.out.println("Number of TV now"+ ++numbOfTv);

    }
}
