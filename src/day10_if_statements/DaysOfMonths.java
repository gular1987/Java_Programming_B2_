package day10_if_statements;

public class DaysOfMonths {
    public static void main(String[] args) {


        int month = 1;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 10 || month == 12) {

            System.out.println( "This month has 31 days" );
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println( "This month has 30 days" );

        }
        if (month == 28) {
            System.out.println( "This month has  28 days" );
        }
        System.out.println( "-------------------------------------------" );
        int month2 = 6;

        boolean is31 = month2 == 1 || month2 == 3 || month2 == 5 || month2 == 7 || month2 == 10 || month2 == 1;
        boolean is30 = month2 == 4 || month2 == 6 || month2 == 9 || month2 == 11;
        boolean is28 = month2 == 28;
        if (is31) {
            System.out.println( "This month has 30 days" );
        } else if (is30) {
            System.out.println( "This month has 31 days" );

        } else if (is28) {
            System.out.println( "This month has 28 days" );

        }
        System.out.println( "------------------------------------" );

        char letter = 'a';
        if (letter == 'a') {
            System.out.println( "hello" );
        }

        if (letter == 'a') {
            System.out.println( "Bye" );
        }
        System.out.println( "------------------------------" );

        if (letter == 'a') {
            System.out.println( "Hello2" );
        } else if (letter == 'a') {
            System.out.println( "Bye" );
        }


        System.out.println( "*********************************" );
        int num = 0;

        // The if conditions will be checked until the first true if statement is found, and the rest will skipped if there is any
        if (num > 3) {
            System.out.println( "Bigger than 1" );
        } else if (num > 2) {
            System.out.println( "Bigger than 2" );
        } else if (num > 1) {
            System.out.println( "Bigger than 3" );
        }


    }

    }




