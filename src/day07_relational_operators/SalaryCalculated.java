package day07_relational_operators;

public class



SalaryCalculated {
    public static void
    main(String[] args) {
        double salary=100.000;
        double StateTaxRate=0.06;
        double federalTaxRate=0.22;
        double stateTax,federalTax,totalTax,salaryAfterTax;

        stateTax=salary*federalTaxRate;

        federalTax=stateTax*federalTaxRate;
        totalTax=stateTax+federalTax;
        salaryAfterTax=salary-totalTax;
        System.out.println();
        String taxReport="State tax rate : "+ stateTax+", Federal tax rage: "+federalTax+ " , Base Salary $"+ salary
                +"\nTax amount: $" +stateTax + " for state tax and  $"+ federalTax+ " Federal Tax, in total it is: $"+
                totalTax + "\nAfter tax our salar is : "+salaryAfterTax;
        System.out.println(taxReport);




    }

    public static class OperatorPractice4 {
        public static void main(String[] args) {
            int t=100;

            int p=- ++t * -t-- / t++ + --t; //=-101 * -101 / 100 +100 =10201/100+100=202
            System.out.println(t);
            System.out.println(p);

        }
    }
}
