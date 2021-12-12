package String;

import java.util.Scanner;

public class MethodsTask {
    public static void main(String[] args) {
        /*
        Task: get string from user
        	print first, last, middle, second matching 'c', length, index of x
        	-Create scanner object to get input from user
        	-let user what to do
        	-store incoming value
        	-implement different methods to achieve your goal.
          */

//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter a string value");
//        String str = input.nextLine();
//        System.out.println(str.charAt(0));
//        System.out.println(str.charAt(str.length()-1));
//        System.out.println(str.charAt(str.length()/2));
//        System.out.println(str.charAt(str.indexOf("a", str.indexOf("a")+1)));
//        System.out.println(str.length());
//        System.out.println(str.indexOf("d"));


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string value");

        String str = input.nextLine();
        System.out.println(" First letter of word is " + str.charAt(0));
        System.out.println(" Last letter of word is " + str.charAt(str.length()-1));
        System.out.println(" Middle letter of word is " + str.charAt(str.length() /2));
        System.out.println("Second matching c's index number is " + str.indexOf("c",str.indexOf("c") +1));
        System.out.println("the index of 'x' is " + str.indexOf("x") );
        System.out.println();
    }
}
