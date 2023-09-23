package day08_scanner_logical_operators;

public class LogicalOperators2 {
    public static void main(String[] args) {
         /*
    create and assign these variables:

        name
        are they citizen
        do have criminal background
        age

        sample inputs:
            "James Bond"
            true
            false
            49

    determine if they are eligible to vote, they can only vote if they are a citizen, have no criminal background and are about age 18

    print : $name is eligible to vote: $boolean

 */


            String name = "Tom Jerry";
            boolean isCitizen = true;
            boolean isNotCriminal = true;
            int age = 12;

            //                    true         true          false
            boolean isEligible = isCitizen && isNotCriminal || age >= 18;
            System.out.println(name + " is eligible to vote: " + isEligible);









        }
}
