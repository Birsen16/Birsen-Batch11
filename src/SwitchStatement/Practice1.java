package SwitchStatement;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        /* get a number between 1 to 4 from a user
        print out name of a season as :
        1- winter
        2- spring
        3- summer
        4-fall



         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a number between 1-4 to select a season \n1-winter \n2-spring \n3-summer \n4-fall");
        int a = scanner.nextInt();
        switch (a){
            case 1:
                System.out.println("winter");
                break;
            case 2:
                System.out.println("spring");
                break;
            case 3:
                System.out.println("summer");
                break;
            case 4:
                System.out.println("fall");
                break;
            default:
                System.out.println("There is no such a season. Please enter valid for your selection.");
                break;
        }

    }
}
