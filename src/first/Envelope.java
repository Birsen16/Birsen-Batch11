package first;

import java.util.Scanner;

public class Envelope {
    public static void main(String[] args) {
//        System.out.println("+------------------------------------------------------------------------+");
//        System.out.println("|                                                                 #####  |");
//        System.out.println("|                                                                 #####  |");
//        System.out.println("|                                                                 #####  |");
//        System.out.println("|                                                                        |");
//        System.out.println("|                              Birsen Duman                              |");
//        System.out.println("|                              2021 West Fake Avenue \"Suite 1201\"      |");
//        System.out.println("|                              Chicago, IL-60018                         |");
//        System.out.println("|                                                                        |");
//        System.out.println("+------------------------------------------------------------------------+");
//
//        double num1 = 20.00;
//        double num2 = 80.00;
//        double total = (num2 + num2) * 100;
//        System.out.println("Total is " + total);
//        double remainder = total % 40;
//        System.out.println("Remainer is " + remainder);
//            boolean isNoRemainder = remainder == 0 ? true : false;
//        System.out.println("is noRemainder equals to " + isNoRemainder);
//        if (!isNoRemainder) {
//            System.out.println("You got some remainder!");


        //Ternary operators

//        int ageOfClient = 30;
//        boolean isEighteenOrOver = ageOfClient == 20 ? true : false;
//        System.out.println(isEighteenOrOver);
//        boolean isgameover =true;
//        int score = 10000;
//        int levelCompleted = 8;
//        int bonus =200;
//        int finalScore = score + (levelCompleted * bonus);
//        if (isgameover){
//            System.out.println("Your final score is " + finalScore);
//        }else {
//            System.out.println("Game is not over yet, enjoy the game");
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a word");

        String word = scanner.nextLine().toUpperCase().substring(0,5);

        if (word.startsWith("M")) {

            System.out.println("Monday");
        }

        if (word.startsWith("T")) {

            System.out.println("Tuesday/Thursday");
        }
        if (word.startsWith("W")) {

            System.out.println("Wednesday");
        }
        if (word.startsWith("F")) {

            System.out.println("Friday");
        }
        if (word.startsWith("S")) {

            System.out.println("Saturday/Sunday");
        }











        }

    }



