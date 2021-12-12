package IfStatement;

import java.util.Scanner;

public class IfPractice1 {
    public static void main(String[] args) {
        //get a numver netwee  1 to 7 from user
        //print the name of the day for that given numver from user
        //1--->Monday
        //2 -->Tues

        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        double num = input.nextInt();
        int number =(int) num;

        if (number == 1){
            System.out.println("Monday");
        }
        if (number==2){
            System.out.println("Tuesday");
        }
        if (number ==3){
            System.out.println("Wednesday");

        }
        if (number==4){
            System.out.println("Thursday");
        }
        if (number==5){
            System.out.println("Friday");
        }
        if (number==6){
            System.out.println("Saturday");
        }
        if (number==7){
            System.out.println("Sunday");
        }
        //if the user enters out of range number
        //print your number id out of range
        if (number < 1 || number >7){
            System.out.println("This number is out of range");
        }

    }
}
