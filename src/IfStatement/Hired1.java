package IfStatement;

import java.util.Scanner;

public class Hired1 {
    public static void main(String[] args) {
        daysOfTheWeek(0);
        daysOfTheWeek(1);
        daysOfTheWeek(2);
        daysOfTheWeek(3);
        daysOfTheWeek(4);
        daysOfTheWeek(5);
        daysOfTheWeek(6);
        daysOfTheWeek(9);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welcome");
//        System.out.println("Do you know Java ? yes / no");
//        String java = scanner.nextLine();
//        if (java.equalsIgnoreCase("yes")){
//            System.out.println("Do you know Selenium? yes / or/ learn");
//            String selenium = scanner.nextLine();
//            if (selenium.equalsIgnoreCase("yes" )){
//                System.out.println("Do you know API?");
//                String api = scanner.nextLine();
//                if (api.equalsIgnoreCase("yes")){
//                    System.out.println("Do you know SQL");
//                    String sql =scanner.nextLine();
//                    if (sql.equalsIgnoreCase("yes")){
//                        System.out.println("Congrats!! You are hired");
//                    } else {
//                        System.out.println("We need someone with SQL knowledge");
//                    }
//                } else {
//                    System.out.println("We need someone who knows API");
//                }
//            }else if (selenium.equalsIgnoreCase("learn")){//else if kismini selenium biliyormusun sorusunu sordugu curly
//                     //bracketin bittigi yerden itibaren ekliyor.
//                System.out.println("Do you know API?");//burasi copy paste in bittigi yer
//                String api = scanner.nextLine();//those are brand new veritable because it is created in this block so it is not same
//                if (api.equalsIgnoreCase("yes")){ //with above one. this is called local variable
//                    System.out.println("Do you know SQL");
//                    String sql =scanner.nextLine();
//                    if (sql.equalsIgnoreCase("yes")){
//                        System.out.println("Congrats!! You are hired");
//                    } else {
//                        System.out.println("We need someone with SQL knowledge");
//                    }
//                } else {
//                    System.out.println("We need someone who knows API");
//                }//burasi copy paste in bittigi yer.
//            }else {
//                System.out.println("We need someone who know Selenium");
//
//            }
//        }else {
//            System.out.println("We need someone who knows Java");
//        }
        //create a new switch statement using char instead of int
        //create a new char value
        //create switch statement for testing for
        //A, B, C, D or E
        //display a message if any of those are found then break
        //add a default message saying not found.

//        char newChar = 'D';
//        switch (newChar){
//            case 'A':
//                System.out.println("The value was A");
//                break;
//            case 'B' :
//                System.out.println("The value was B");
//                break;
//            case 'C':    // case 'C': case 'D' : case 'E':
//                        // System.out.println(charValue + "C , D , E was found");
//                System.out.println("The value was C");
//                break;
//            case 'D':
//                System.out.println("The value was D");
//                break;
//            default:
//                System.out.println("char value A,B,C or D  is not found");
//                break;
//
//        }

    }
    private static void daysOfTheWeek (int day){
//        switch (day){
//            case 0:
//                System.out.println("Sunday");
//                break;
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("None of those days");
//                break;
//
//        }

        if (day == 0){
            System.out.println("Sunday");
        }else if (day == 1){
            System.out.println("Monday");
        }else if (day == 2){
            System.out.println("Tuesday");
        }else if (day == 3){
            System.out.println("Wednesday");
        }else if (day == 4){
            System.out.println("Thursday");
        }else if (day == 5){
            System.out.println("Friday");
        }else if (day == 6){
            System.out.println("Saturday");
        }else{
            System.out.println("Invalid value");
        }
    }
}
