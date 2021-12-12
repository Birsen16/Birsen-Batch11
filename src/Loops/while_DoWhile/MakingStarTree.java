package Loops.while_DoWhile;

import java.util.Scanner;

public class MakingStarTree {
    public static void main(String[] args) {
        /*
        -Ask user to provide a number between 3 to 10
  - make a star tree for that many line
  (Use Do-While Loop to implement solution)
    ex: input --> 4
                  *
                  **
                  ***
                  ****
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide an integer number ?");
        int number = scanner.nextInt();
        int x= 0;//what line you start the tree and user entry is how many lines you put. user input.
        String star = "*";
        do {
            System.out.println(star);//you want to print star
            star+= "*"; //add one star every time
            x++;//increase the number of lines


        }while(x < number);




    }
}
