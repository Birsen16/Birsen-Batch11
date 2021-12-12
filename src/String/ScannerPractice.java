package String;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        String name = "David";
        System.out.println("My name is " + name);

        //creating Scanner object

        Scanner input = new Scanner(System.in); // option + shift + enter to bring || import java.util.Scanner.|| With dots below we can reach methods
        // and variables from scanner class from library
        System.out.println("Please enter your last name");
        String lastName = input.nextLine();
        System.out.println(lastName);


        // Task : Ask user to enter his/ her city name and
        // print as: "<name>
        System.out.println("Please enter your city name");
        String city = input.nextLine();
        System.out.println(name + " " + lastName + " you are living in " + city);

        lastName = "Smith";

        System.out.println("Please enter your age");
        int age = input.nextInt();
        System.out.println(name +  "you are youngster!!! This is ==> " + age);

        System.out.println("Give enter your height in feet and inches(i.e. 5.8)");
        double height = input.nextDouble();
        System.out.println("Your height is " + height);
        //
        System.out.println("Please enter you address");
       // input = new Scanner(System.in);//Bunu reassign yaptik cunku inputu nextln yaptik daha sonra nextint or double.
        // It gives little gap. in order to avoid it, reassign input. You can also make input.new();
        String address = input.nextLine();
        System.out.println("Is this correct address you provided? " + address) ;


    }
}
