package ProjectTasks;

import java.util.Scanner;

public class Project5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //        TASK ONE

        /*
        Reverse a given String and return it, if they have space in the
        beginning and at the end then remove it.
        Example:  " Job" -> "boJ"
        * " Happy " -> "yppaH"
        * "Sun " -> "nuS"
        * " Dream Job!" -> "!boJ maerD"
         */

//        System.out.println("Please enter a string");
//        String str = scanner.nextLine().trim();
//
//        String reverse = "";
//        char ch[] = str.toCharArray();
//        for (int i = ch.length-1;i>=0;i-- ){
//            reverse+=ch[i];
//        }
//        System.out.println("The reverse of " + str + " is " + reverse);

        //       TASK TWO
        /*
        Using the scanner asks the user to input the min and max
        number. Write a java code that will calculate the sum of
        numbers between the range of min and max and those that
        can only be divided by 2 and 7.
        (min and max numbers are included)
        Example:
         0, 50 -> 14 + 28 + 42 = 84
         */
//        System.out.println("Please enter min number");
//        int min = scanner.nextInt();
//        System.out.println("Please enter max number");
//        int max = scanner.nextInt();
//        int count=0;
//        int sum=0;
//        for (int i = min; i<= max;i++){
//            if (i % 2 ==0 && i % 7 ==0){
//                sum+=i;
//                System.out.println(i);
//            }
//        }
//        System.out.println(sum);


//                  TASK THREE
        /*
        Using a scanner ask a user to provide one int number. if the
        number is a prime number then print "Prime Number"
        otherwise print it is not a prime number.
        NOTE:
        A prime number is a whole number greater than 1 whose only
        factors are 1 and itself. A factor is a whole number that can
        be divided evenly into another number. The first few prime
        numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23, and 29.
         */



         System.out.println("Please enter a number ");
        int a = scanner.nextInt();
        int b = 0;
       for (int i = 2; i > a; i++) {
           if (a % i == 0) {
               b++;
                break;
            }
        }

       if (b == 0)
           System.out.println(a + " is a prime number");
       else
           System.out.println(a + " is not a prime number ");




        /*
                   TASK FOUR
        Ask the user to enter one number between 1 to 10 then, Write the
        program to print the string in the following format:
        Example:
        Input: 5
        Output:
        1
        22
        333
        4444
        55555
         */
//        System.out.println("Please enter one number between 1 to 10. ");
//        int number = scanner.nextInt();
//      for (int y =1; y<=number;y++){
//          for (int i = 1; i<=y;i++){
//              System.out.print(y);
//          }
//          System.out.println();
//      }

        /*         TASK FIVE
        Ask the user to enter one in number between 1 to 10 then, Write the
        program to print the string in the following format:
        Example:
        Input: 6
        Output:
        666666
        55555
        4444
        333
        22
        1
         */

//        System.out.println("Please enter one number between 1 to 10. ");
//
//        int num = scanner.nextInt();
//        for (int i = 1; i <= num; num--) {
//            for (int y = 1; y <= num; y++) {
//                System.out.print(num + " ");
//
//            }
//            System.out.println();
//        }


//        for (int i = 1; num >= i; num--) {
//
//            for (int b = 0; b < num; b++) {
//                System.out.print(num);
//
//            }
//            System.out.println();
//            }


    }
}

