package day07_relational_operators;

public class Pizza {
    public static void main(String[] args) {

        String typeOfPizza="Cheese";
        int numOfSlice=10;
        int numOfPeople=4;
        int slicePerPerson=numOfSlice / numOfPeople;
        int slicesLeftOver=numOfSlice % numOfPeople;
        String report="We ordered "+typeOfPizza+" pizza with "+numOfSlice+" slices , "+numOfPeople+" people ate "
                +slicePerPerson+" slices each . There were " + slicesLeftOver+ " slices left";
        System.out.println(report);

    }
}
