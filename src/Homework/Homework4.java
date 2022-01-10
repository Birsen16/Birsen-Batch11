package Homework;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Write a Java program to check whether a given number is an armstrong number or not. 
        NOTE:
        An Armstrong number, also known as narcissistic number, is a number that is equal to the sum of the cubes of its own digits. For example, 370 is an Armstrong number since 370 = 3*3*3 + 7*7*7 + 0*0*0
        Look at example below carefully.

        Test Data :
        Input a number: 153
        Expected Output :153 is an Armstrong number

        Input a number: 230
        Expected Output : 230 is not an Armstrong number
         */
        //      ARMSTRONG NUMBER TASK
//        System.out.println("Enter a number");
//        int number = scanner.nextInt();
//        int digit=0;
//        int sum=0;
//        int temp=number;
//
//        while (number>0){
//            digit=number%10;
//            sum+=digit*digit*digit;
//            number/=10;
//        }
//        if(temp==sum){
//            System.out.println(sum + " is an Armstrong number");
//        }else{
//            System.out.println(sum + " is not an Armstrong number");
//        }

        //          REVERSING NUMBER HOMEWORK
        /*
        Write a program in Java to display any number in reverse order. 
        Please look examples below carefully.

        Test Data :
        Input : 12345 (it can be any number like 5 digits or 6 digits etc)
        Expected Output : 54321

        Input : 765432
        Expected Output : 234567

        Input : 23914
        Expected Output : 41932

         */
//        System.out.println("Enter a number");
//        int number = scanner.nextInt();
//        int reverse = 0;
//        int digit=0;
//        int sum=0;
//        while (number!=0){
//            digit=number%10;
//            reverse=reverse *10+digit;
//            number/=10;
//        }
//        System.out.println(reverse);

        //             PALINDROME HOMEWORK
        /*
  Write a program in Java to check whether a String is a palindrome or not.
If string is a palindrome print "palindrome" if not print "not palindrome"
NOTE:
NOTE: A string is said to be a palindrome if the string read from left to right is equal to the string read from right to left.
For example, ignoring the difference between uppercase and lowercase letters, the string "iTopiNonAvevanoNipoti" is a palindrome,
Test Data :
Input a number: Civic
Expected Output : palindrome

Input : Java
Expected Output: not palindrome

Input: Hannah
Expected Output : palindrome

Input : Try
Expected Output : not palindrome

         */
//        System.out.println("Enter a string");
//        String  word =scanner.nextLine().toLowerCase();
//        String reverse="";
//
//
//        for (int i = word.length()-1; i >=0;i--){
//            reverse = reverse + word.charAt(i);
//        }
//        if (reverse==word){
//            System.out.println("palindrome");
//        }else {
//            System.out.println("not palindrome");
//        }
                    ///!!!!!!!!!!!!WRONG!!!!!!!!!!!!
//        System.out.println("Enter the number of line");
//        int line = scanner.nextInt();
//         int count=1;
//        for (int i = 1; i <= line; i++) {
//            for (int j =1;j<=i;j++){
//                System.out.print(count + " ");
//                count++;
//            }
//             System.out.println(" ");
//        }
        /*
         Write a program in Java to find the sum of the series 1 +11 + 111 + 1111 + .. n terms. 
         Here the number n will come from user so if user gives number 3
         you should find sum of 1 + 11 + 111.
       Please look carefully example below.

         Test Data :
         Input the number of terms : 5
         Expected Output :
         12345  (Because the sum of 1 + 11 + 111 + 1111 + 11111= 12345)

         */
        System.out.println("enter this damn number");
        int round = scanner.nextInt();
        int number=0;
        int sum=0;

        for (int i=0;i<round;round--){
             number=(number*10)+1;
             sum+=number;
           // System.out.println(number);
        }
        System.out.println(sum);





      








    }
  }