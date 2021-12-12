package IfStatement;

import java.util.Scanner;

public class NestedIfPractice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which city do you live  ?");
        String city = scanner.nextLine();
        if (city.equalsIgnoreCase("Chicago")){
            System.out.println("What course are you at?");
            String course = scanner.nextLine();
            if (course.equalsIgnoreCase("techtorial")){
                System.out.println("What batch are you?");
                String batch = scanner.nextLine();
                if (batch.equalsIgnoreCase("11")){
                    System.out.println("It is getting easier");
                }else if(!batch.equalsIgnoreCase("11")){//last else  batch 11
                    System.out.println("Congrats!! Did you find a job?");
                    String job = scanner.nextLine();
                    if (job.equalsIgnoreCase("yes")){
                        System.out.println("Congrats!!! How much is your salary?");
                        String salary = scanner.nextLine();
                        if (salary.equalsIgnoreCase("None of your business")){
                            System.out.println("Ay havalu iyiki bir is bulmusun. Hasbam yuruuuuuu anca gidersin");
                        }
                    }else{
                        System.out.println("Keep trying");
                    }
                }
            }else{//second else techtorial
                System.out.println("Please visit us, we are in Des Plains");
            }
        }else{//first else  chicago
            System.out.println("Please come to Chicago. You would like it in the Summer.");
        }
    }
}
