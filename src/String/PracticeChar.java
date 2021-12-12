package String;

import java.util.Scanner;

public class PracticeChar {
    public static void main(String[] args) {
//
//        String device = "microphone";
//       char ch = device.charAt(0);
//        System.out.println(ch);
//        char ch1 = device.charAt(4);
//        System.out.println(ch1);
//        System.out.println(device.charAt(9));

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word ");
        String word = input.next();
        System.out.println(word.charAt(0));
        System.out.println("This is your first letter of the string >>> " + word);
        System.out.println("Please enter another word");
        System.out.println("!!!!!!! " + input.next().charAt(0)); // without storing incoming string value, taking a letter from it
                                                    // This doesn't require variable








//        ????????????DOUBLE CHECK THIS ONE. MENTOR WAS CONFUSED. THIS IS NOT SCANNER PRACTICE???????????
        // we will ask user to enter a char letter
        //a though to z
        //if the user enters char that is not an English letter
        //code should print false
        //If user enters English letter code should print true
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter Char letter ");
//        //If the value of the char between char a and char z
//        // it means this char is a letter
//        char ch = 'a';
//        boolean isLetter = ch >= 'a' && ch <='z' || ch >= 'A' && ch <='Z';
//        System.out.println(isLetter);


    }
}
