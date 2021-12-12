package IfStatement;

public class IfPractice {
    public static void main(String[] args) {
        int appelNumber = 5;
        int orangeNumber = 10;
        //==, > , < ,!= , <=, >=
        System.out.println("I am about to create a If block.");

        if (appelNumber == orangeNumber){
            System.out.println("I am so lucky today");
        }
        if (appelNumber != orangeNumber){
            System.out.println("I am so HAPPY today.");
        }
        if (appelNumber <= orangeNumber) {

            int sum = appelNumber + orangeNumber;
            System.out.println("You have " + sum + " fruits");
        }

        System.out.println("So far so good!");

        if (orangeNumber < appelNumber){
            System.out.println(orangeNumber * appelNumber + " is in the false conditional if block. That is why it will not show on the console");
        }



    }
}
