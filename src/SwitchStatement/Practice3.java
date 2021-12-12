package SwitchStatement;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        /*
        ask user for name of geometrical shape
        based on the name of the shape
        calculate the AREA of that shape
        get length and width and height of those shapes from user to use them in calculations
        print out name of the shape and area of that shape
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("What geometrical shape? triage/rectangle");
        String shape = scanner.nextLine().toLowerCase();

        switch (shape){
            case "rectangle":
                System.out.println("Please enter lenght of the rectangle?");
                double length = scanner.nextDouble();
                System.out.println("Please enter width of the rectangle");
                double width = scanner.nextDouble();
                System.out.println("Area of the rectangle is " + (length * width));
                break;
            case "triangle":

                System.out.println("Please enter height of the triangle?");
                double height = scanner.nextDouble();
                System.out.println("Please enter base of the triangle");
                double base = scanner.nextDouble();
                System.out.println("Area of the rectangle is " + (height * base)/2);
                break;
            default:
                System.out.println("Your shape selection is not an option on our list.");
                break;

        }

    }
}
