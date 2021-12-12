package String;

import java.util.Scanner;

public class ScannerPractice5 {
    public static void main(String[] args) {

        //Ask user to enter two integer number
        //First integer number proved should be bigger than second one
        //if first number bigger than the second one
        //we will print out true
        //if second number bigger than second number
        //print false
        Scanner number = new Scanner(System.in);
        System.out.println("Enter your first integer number");
        int firstNumber = number.nextInt();
        System.out.println("Enter your second integer number");
        int secondNumber = number.nextInt();
        boolean isFirstBigger = firstNumber > secondNumber;
        System.out.println(isFirstBigger);



    }
}
