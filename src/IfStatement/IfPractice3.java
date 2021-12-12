package IfStatement;

import java.util.Scanner;

public class IfPractice3 {
    public static void main(String[] args) {
        /*
        ask user to enter a dingle word if the word's first letter is :
        M--> there is a dau starts with M--> Monday
        T--> there is a dau starts with M--> Tuesday/Thursday
        W--> there is a dau starts with M--> Wednesday
        F-> there is a dau starts with M--> Friday
        S--> there is a dau starts with M--> Saturday/Sunday

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a single word");
        String word = scanner.nextLine().toUpperCase();
        if (word.startsWith("M") || word.startsWith("a") )
            System.out.println("Monday");
        if (word.startsWith("T") || word.startsWith("t") )
            System.out.println("Tuesday/Thursday");
        if (word.startsWith("W") || word.startsWith("s"));
            System.out.println(word.startsWith("Wednedsay"));
        if (word.startsWith("F") || word.startsWith("f") )
            System.out.println("Friday");
        if (word.startsWith("S") || word.startsWith("s") )
            System.out.println("Saturday / Sunday");

        if (!word.startsWith("M") && !word.startsWith("T") &&
                !word.startsWith("W") && !word.startsWith("T") &&
                !word.startsWith("F") && !word.startsWith("S"))
        System.out.println(" Invalid data");

    }
}
