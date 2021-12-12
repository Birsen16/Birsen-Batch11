package Loops.while_DoWhile;

import java.util.Scanner;

public class WhileTask1 {
    public static void main(String[] args) {
        //ask user to provede a whole integer number
        // create a multiplication table from 1 to 10 from the given number
        //input 4 --> 4
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an whole number"); // if you enter negative number still doesn't matter because it
        //still ganna print 10 times.
        int number = input.nextInt();
        int multiplier = 1;

        while (multiplier <= 10) {
            int total = number * multiplier;
            System.out.println(number + " * " + multiplier + " = " + total);
            multiplier++;
        }


    }
}
