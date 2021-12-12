package IfStatement;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.Scanner;

public class ElseIfPractice1 {
    public static void main(String[] args) {
        /*
        get theree test results from user and calculate the average of those three tests
        based on the averaage score
        print out letter grade for this student
        average  --> 100 -90-->your letter grade is A
        average  --> 89-80-->your letter grade is B
        average  --> 79 -60-->your letter grade is C
        average  --> less then 60 --> you should take the course again

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first test score");
        int score1 = input.nextInt();
        System.out.println("Please enter your second test score");
        int score2 = input.nextInt();
        System.out.println("Please enter your third test score");
        int score3 = input.nextInt();

        int avarage = (score1 + score2 + score3)/3;


        if (avarage >= 90 && avarage <= 100 ){
            System.out.println("your letter grade is A");
        }else if (avarage >= 80 && avarage <= 89){
            System.out.println("your letter grade is B");
        }else if (avarage >60 && avarage <= 79){
            System.out.println("your letter grade is C");
        }else {
            System.out.println("you should take the course again");

        }
    }
}
