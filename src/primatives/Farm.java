package primatives;

public class Farm {
    public static void main(String[] args) {
        // in a farm there 12 caws and 23 chicken
        //find the total legs of the animals in the farm and print out
        //if each cow costs $ 2345 and each chicken costs $ 23.99
        //find the total worth of these animals and print out

        int cows = 12;
        int chicken = 23;
        final int cowLeg = 4;
        final int chickenLeg = 2;
        int cowPrice = 2345;
        double chickenPrice= 23.99;

        int totalLegs = (cows * cowLeg) + (chicken * chickenLeg);
        double total$ = (cows * cowPrice) + (chicken * chickenPrice);
        System.out.println(totalLegs);
        System.out.println(total$);

    }
}
