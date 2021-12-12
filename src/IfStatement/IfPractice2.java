package IfStatement;

import java.util.Scanner;

public class IfPractice2 {
    public static void main(String[] args) {
        //assume that user is using military style time 1-24
        //print out good morning or good afternoon
        //for the hours of morning or afternoon
        //Ask user to enter only hour for the time
        // if the hour is less than 12 print good morning
        //if the hour is more than 12 less 18 print good afternoon


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter time as military style");
        int time = input.nextInt();
        if (time < 12){
            System.out.println("Good Morning");
        }
        if (time >= 12 && time < 18) {
            System.out.println("Good Afternoon");
        }
        if (time > 18 && time <= 24) {
            System.out.println("Good Night");
        }
        if (time < 0 || time > 24){
            System.out.println("invalid value");
        }
//        int number = 1234; // number is not a condition so it will not compile
//        if (number){
//            System.out.println("Hello World ");
//
//        }
    }
}
