package String;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {

        //use scanner to
        //get name and DOB yrar of user
        //calculate user's age
        //print "You are <age> years old.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");
        String Name = scanner.nextLine();
        System.out.println("please enter your date of birth");
        int birthday = scanner.nextInt();

        int age = 2021 - birthday;
        System.out.println(Name + " you are " + age + " years old");

       int currentYear = LocalDateTime.now().getYear();
       System.out.println(currentYear);



    }
}
