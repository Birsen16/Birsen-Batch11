package Loops.while_DoWhile;

import java.util.Random;
import java.util.Scanner;

public class HeadTailGame {
    public static void main(String[] args) {
        /*
        HAED-TAIL Game:
          /*
        I want to create a head/tail game (flipping coin) with java codes;
        -At the beginning print "Game is started, MAKE a GUESS! HEAD/TAIL "
          So, let user know that the game started.
            - get user's guess as HEAD/TAIL
            - compare user's guess with your random number 0/1 --> random.nextInt(2) <--
                - if guess is correct, print       ---> "You are lucky, it is your day today."
                - if the guess isn't correct, print  -> "Sorry, that was not the correct choice!"
            - at the end, ask user "Do you want to play again? Y/N "
                - if the answer is Y --> keep playing (this is your while condition!!!)
                - if the answer is N --> print --> "Its Ok, SEE you NEXT time!"

         */
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
       String answer;

        do {
            System.out.println("Game is started, MAKE a GUESS! HEAD/TAIL ");
            String guess = scanner.nextLine().toLowerCase();
            int number = random.nextInt(2);
            String result = number ==0? "head" : "tail";
            if (guess.equalsIgnoreCase(result)){
                System.out.println("You are luck, it is your day today");

            }else if (!guess.equalsIgnoreCase(result)){
                System.out.println("Sorry, that was not the correct choice!");
            }
            System.out.println("Do you want to play again?");
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("no")){
                System.out.println("Its Ok, SEE you NEXT time!");
            }
        } while (answer.equalsIgnoreCase("yes"));

    }
}
