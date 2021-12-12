package String;

import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

public class ScannerPractce7 {
    public static void main(String[] args) {
        //We will ask user to their first name
        //We will ask user to their last name
        //We will print firstName in lower case
        //We will print lastName in the same line

        //.toLowerCase(); == makes the all letters lower case
        //.toUpperCase(); == makes the all letters upper case

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = scanner.next();
        System.out.println("Please enter your last Name");
        String lastName= scanner.next();
        System.out.println(firstName.toLowerCase() + " " + lastName.toUpperCase());





        //If i print like this will i changed values or
        //non changed
        // I fI apply method in print out parentheses it will
        //print the values with method applied.



    }
}
