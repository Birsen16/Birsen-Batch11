package Homework;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
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
        /*
        System.out.println("SumOfSeries");
        System.out.println("Enter the number of term");
        Scanner scanner = new Scanner(System.in);
        int term = scanner.nextInt();
        int number=0;
        int sum=0;

        for (int i=0;i<term;term--){
            number=(number*10)+1;
            sum+=number;
            // System.out.println(number);
        }
        System.out.println(sum);

         */

        System.out.println("HighestCommonFactor");
        /*
        Write a java program to find HCF (Highest Common Factor) of two numbers.
        Test Data :
        Input 1: 24
        Input 2: 28
        Expected Output : 4  -> Because HCF of 24 and 28 is 4
        Input 1: 75
        Input 2: 45
        Expected Output : 15  -> Because HCF of 75 and 45 is 15

       NOTE : Highest Common Factor means biggest common divident of two number.

         */
        /*

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1 = scanner.nextInt();

        System.out.println("Enter the number 2");
        int num2 = scanner.nextInt();

        int HCF =1;

        for (int i = 1; i<=num2;i++){
            if (num1 %i==0 && num2 % i ==0){
                HCF=i;

            }
        }
        System.out.println(HCF);

         */
        System.out.println("Least Common Multiple");
        /*
        Please find the LCM(least common multiple) of two given integers.

        NOTE:  The LCM of two integers is the smallest positive integer
        that is perfectly divisible by both the numbers (without a remainder).
        Please look at example carefully.
        EXAMPLES:
        Input 1: 72
        Input 2: 120
        Output : 360

        Input 1: 24
        Input 2: 60
        Output : 120
         */
        //        Scanner scanner = new Scanner(System.in);
        //        System.out.println("Enter the number 1");
        //        int num1 = scanner.nextInt();
        //
        //        System.out.println("Enter the number 2");
        //        int num2 = scanner.nextInt();
        //
        //        int LCM =1;
        //
        //        for (int i = 1; i<=num2;i++){
        //            if (num1 %i==0 && num2 % i ==0){
        //                LCM=num1*num2/i;
        //
        //            }
        //        }
        //        System.out.println(LCM);


//       System.out.println("This is shorter version of the lowest common multiplier practice");
//       Scanner scanner = new Scanner(System.in);
//       System.out.println("Enter the number 1");
//       int num1 = scanner.nextInt();
//
//       System.out.println("Enter the number 2");
//       int num2 = scanner.nextInt();
//
//       int min = num1 < num2 ? num1 : num2;
//
//       int LCM;//lowest common multiplier
//       int HCF=1;//Highest common divisor
//
//       for (int i = min; i>0; i--){
//           if (num1 %i==0 && num2 % i ==0){
//               HCF = i;
//               break;
//           }
//       }
//       LCM = num1 * num2 / HCF;
//        System.out.println(LCM);

        // System.out.println("Mirror Edges ");
        /*
        Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
        In other words, zero or more characters at the very begining of the given string,
        and at the very end of the string in reverse order (possibly overlapping).

        For example,
        the string "abXYZba" has the mirror end "ab". -> Because ab is in the begining also at the end.

        Examples:

       Input : abca
       Output: a

       Input : aba
       Output: aba

       Input : eerqwertyree
       Output: eer

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scanner.nextLine();
        String mirror = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                mirror = mirror + str.charAt(i);
            }
        }
        System.out.println(mirror);
    }
}


//        String  reverse="";
//        for (int i =str.length()-1; i>=0; i--){
//            reverse+=str.charAt(i);
//            //System.out.println(reverse);
//
//        }
//        for (int i =0; i< str.length(); i++){
//            if (str.charAt(0)==reverse.charAt(0)){
//                mirror+=reverse.charAt(i);
//
//            }
//        }
//        System.out.println(mirror);
//
//
//
//    }
//}
