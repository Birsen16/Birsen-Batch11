package String;

import java.util.Scanner;

public class ScannerPractice4 {
    public static void main(String[] args) {
         /*
         To be able to graduate from school
         student needs
         ==%85 attendance
         ==80 or higher grade
         ==%70 of homework
         create a program for teacher will enter all these variables and
         if student passes uou will print true for teacher
         if student fails uou will print false for teacher

         */
        Scanner input= new Scanner(System.in);
        System.out.println(" enter attendance ");
        int attendance = input.nextInt();
        System.out.println(" enter grade");
        int grade = input.nextInt();
        System.out.println("enter homework ");
        int homework = input.nextInt();

        // how can I print them all
        boolean isGrade = grade >= 70;
        boolean isAttendancy = attendance >= 85;
        boolean isHomework = homework >= 70;
        boolean canPass = isGrade && isHomework && isAttendancy;
        boolean isPass = attendance >= 85 && grade >= 80 && homework >= 70;

        System.out.println(canPass);


    }
}
