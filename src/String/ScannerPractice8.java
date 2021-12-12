package String;

import java.util.Scanner;

public class ScannerPractice8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type something");
        String str = scanner.nextLine();
        //I can provide as many word as I want to when I use .nextLine.
        System.out.println( "This value of first string "+ str);
        String str1 = scanner.next();
        //For this I cannot provide more than one word when I use .next.
        System.out.println("This is value of second string " + str1);
        System.out.println(str + " " + str1);
    }
}
