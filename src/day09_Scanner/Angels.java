package day09_Scanner;

import java.util.Scanner;

public class Angels {

    public static void main(String[] args) {
        Scanner input=new Scanner( System.in );
        System.out.println("Enter three angle degree/number" );
        double angleOne= input.nextDouble();
        double angleTwo= input.nextDouble();
        double angleThree= input.nextDouble();

        double total=angleOne+angleTwo+angleThree;
        boolean isTriangle=total==180;
        boolean isCircle=total==360;
        System.out.println("it is triangle: "+isTriangle);
        System.out.println("It is circle: "+isCircle);


    }
}
