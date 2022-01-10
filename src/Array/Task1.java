package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        /*
        -ask user, how many names that s/he wants to store in array
        -store those names by getting it from user in to array that is called 'names'
         -print them out by using ->Arrays.toString(); method
         */

        System.out.println("How many guests are you expecting?");
        int value = scanner.nextInt();
        String[] names = new String[value];
        scanner = new Scanner(System.in);

        for (int i = 0; i < value; i++ ){
            System.out.println("enter " + (i+1) + ". names");
            names[i] =scanner.nextLine();

        }
        System.out.println(Arrays.toString(names));

    }
}
