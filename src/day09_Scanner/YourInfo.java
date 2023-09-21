package day09_Scanner;

import java.util.Scanner;

public class YourInfo {
     /*
        Ask the user to enter their age (byte),
        ask them to enter their favorite number (long),
        and ask them to enter their favorite book
        Print all the values from the inputs
     */

    public static void main(String[] args) {

        Scanner input=new Scanner( System.in );
        System.out.println("Enter your age: ");
        byte age= input.nextByte();
        System.out.println("Enter you favorite number: ");
        long favoriteNum= input.nextLong();

        System.out.println("Enter you favorite book: ");
        String book= input.nextLine();

        System.out.println();







    }
}
