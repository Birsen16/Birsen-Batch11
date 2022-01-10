package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
         /*
        -ask user, how many names that s/he wants to store in array
        -store those names by getting it from user in to array that is called 'names'
        -if the name has 5 or more letters store it in longnames array
        -if the name has less than 5 letters store it in shortnames array

         */

        System.out.println("How many guests are you expecting?");
        int value = scanner.nextInt();
        String[] longNames = new String[value];
        String[] shortNames = new String[value];

        scanner = new Scanner(System.in);

        for (int i =0; i<value;i++){
            System.out.println("enter " + (i+1) + ". name");
             String name=scanner.nextLine();
            if ( name.length()>= 5){
                longNames[i]=name;
            }else{
                shortNames[i] = name;
            }
        }
        System.out.println(Arrays.toString(shortNames));
        System.out.println(Arrays.toString(longNames));









    }
}
