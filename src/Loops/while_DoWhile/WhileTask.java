package Loops.while_DoWhile;

import java.util.Scanner;

public class WhileTask {
    public static void main(String[] args) {
        // ask user to enter an integer value and find the divisors of the given integer

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an whole number");
        int number = input.nextInt();
        int divisor = 1;
        while (divisor <=number){
            if (number % divisor ==0){
                System.out.println(divisor + " is divisor of " + number);
            }
            divisor++;
        }
    }
}
