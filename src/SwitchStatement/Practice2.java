package SwitchStatement;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
         /*
    Ask user for his/her favorite fruit
   -you have: mango, banana, kiwi, orange, apple, grape
   if you have user's favorite fruit, --> We have your favorite fruit in our store
   -orher wise: Sorry, we don't have your favorite fruit :( :
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your favorite fruit");
        String fruit = scanner.nextLine().toLowerCase(); //bunu switch parantezinin icinede yazabilirsin
        switch (fruit.toLowerCase()) { // buraya string de yazabilirsin switch(scanner){
                                      //parantezin icine toLower case to uppercase falan yazabilirsin fakat return type boolean
                                      //olanlari yazamazsin yada bunu
            case "mango":
                System.out.println("We have your favorite fruit in our store");
                break;
            case "banana":
                System.out.println("We have your favorite fruit in our store");
                break;
            case "kiwi":
                System.out.println("We have your favorite fruit in our store");
                break;
            case "orange":
                System.out.println("We have your favorite fruit in our store");
                break;
            case "apple":
                System.out.println("We have your favorite fruit in our store");
                break;
            case "grape":
                System.out.println("We have your favorite fruit in our store");
                break;
            default:
                System.out.println("Sorry, we don't have your favorite fruit :(" );
                break;

        }
    }
}