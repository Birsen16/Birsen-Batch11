package primatives;

public class ComparisonPractice2  {
    public static void main(String[] args) {

        //There is an event for kids if a child's height is  48" and higher or more they can attand this event
        //print out the result if this kid attend the event or not

        double requiredHeight = 48;
        double childHeight = 50;

        boolean canAttend = childHeight >= requiredHeight;

        System.out.println("Can this child attend the event? " + canAttend);

    }
}
