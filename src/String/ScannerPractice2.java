package String;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        //BMI calculation BMI= weight(kg) / (height a8 height(meter)
        //18-24 good, less
        // Your BMI result is

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight in kg ");
        double weight = scanner.nextDouble();
        System.out.println("Please enter your height in meters");
        double height =scanner.nextDouble();
        double BMI = weight / (height * height);
        System.out.println( "Your BMI is " + BMI);







    }
}
