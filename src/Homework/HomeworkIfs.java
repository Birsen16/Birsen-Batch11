package Homework;

import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class HomeworkIfs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /*
       Using the scanner ask the user to enter any String value. If this
      String has a color like red or blue with lower case print the red or
      blue. Other wise do not print anything.
      EXAMPLE-1:
      Input: "xxredyy"
      Output: red
      EXAMPLE-2:
      Input: "xbxltue"
      Output: blue
        */
//        System.out.println("Please enter a string value");
//        String value = scanner.nextLine().toLowerCase();
//        if (value.contains("r") && value.contains("e") && value.contains("d")){
//            System.out.println("red");
//        }else if (value.contains("b") && value.contains("l") && value.contains("u") && value.contains("e")){
//            System.out.println("blue");
//        }
        /*

        Using the scanner ask the user to enter a String value and if both string length
        is same concatenated together then print the result. If both String
        length is not same then omit last chars from the longer string so it is the same
        length as the shorter string. After making both strings the same length then
        concatenate them and print the result.
        NOTE:!!!!! Please use scanner next() method and do not use nextLine() for this task.!!!!!!!!!!!!
        EXAMPLE-1:
        String 1: "Cell"
        String 2: "Phone"
        Output: "CellPhon"
        EXAMPLE-2:
        String 1: "Cable"
        String 2: "Mic"
        Output: "CabMic"
         */
//        System.out.println("Enter string 1");
//        String string1=scanner.next();
//
//        System.out.println("Enter string 2");
//        String string2=scanner.next();
//        int lenght1 = string1.length();
//        int lenght2 = string2.length();
//        if (string1.length() == string2.length()){
//            System.out.println(string1.concat(string2));
//        }else if (string1.length()!=string2.length()){
//            if(lenght1 > lenght2){
//                System.out.println(string1.substring(0,lenght2).concat(string2));
//            } else if (lenght2 > lenght1) {
//                System.out.println(string1 + string2.substring(0,lenght1));
//            }
//            }
        /*
        Using the scanner ask the user to enter one String value. If the string length
        is bigger than or equals to 3 print the string without first and last char. If the
        length is not bigger than 3 print as it is. (for this task you need to use if
        statement).
        Example 1:
        Please enter the String value:
        test
        The output is:
        es
        Example 2:
        Please enter the String value:
        Hello
        The output is:
        ell
         */
//        System.out.println("Enter a string");
//       String string = scanner.nextLine();
//       int lenght = string.length();
//       if (lenght >= 3){
//           System.out.println(string.substring(1,string.length()-1));
//       }else if (lenght < 3){
//           System.out.println(string);
//       }

        /*
        Given a string, if one or both of the first 2 chars is 'x', print the
        string without those 'x' chars, and otherwise print the string
        unchanged.
        Examples:

        "xHi" → "Hi"
        "Hxi" → "Hi"
        "Tesxt" → "Testxt"
         */
//        System.out.println("Enter a string value");
//        String string = scanner.nextLine().toLowerCase();
//
//        String firstTwo=string.substring(0,2);
//        String rest= string.substring(2);
//
//        if(firstTwo.contains("x")){
//            firstTwo.replaceAll("x", "");
//            System.out.println(firstTwo + rest +"" );
//        }else {
//            System.out.println(string);
//        }

//        System.out.println("Enter a string value");
//        String str = scanner.nextLine();
//        String firstTwoChars = str.substring(0,2);
//        String str2 = str.substring(2);
//        if (firstTwoChars.contains("x")){
//            firstTwoChars = firstTwoChars.replaceAll("x", "");
//            System.out.println(firstTwoChars + str2+"");
//        }else{
//            System.out.println(str);
//        }
        /*
        Using scanner ask user to provide the string value. Print "dad"
        if the given string contains the "dad", but where the middle
       'a' char can be any char otherwise please do not print anything.
        Please look carefully examples below.
        Example:
        Input the year: testdadtest
        Output :dad
        Input the year: testd7dtest
        Output :dad
        Input the year: testdodtest
        Output :dad
        Input the year: testDudtest
        Output :dad


        /*
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string value");
        String str = scanner.nextLine().toLowerCase();

        for (int index =0; index < str.length();index++){
            if (str.charAt(index)=='d' && str.charAt(index+2)=='d'){
                System.out.println("dad");
            }
        }
        */
        /*
        Using Scanner ask user to provide any int number
         and print multiplication table of given number
         Please make sure your output exactly look like given example below.
         EXAMPLE:

        Input number: 5
        Output :
        5 * 1 = 5
        5 * 2 = 10
        5 * 3 = 15
        5 * 4 = 20
        5 * 5 = 25
        5 * 6 = 30
        5 * 7 = 35
        5 * 8 = 40
        5 * 9 = 45
        5 * 10 = 50
         */
//                 System.out.println("Enter a string value");
//                 int number = scanner.nextInt();
//                 int i =1;
//
//                 while (i<=10){
//                     int result = number * i;
//                     System.out.println(number + " * " + i+ " = "+ result);
//                     i++;
//                 }

                    /*
                    Using a scanner ask the user to provide starting and ending numbers.
                    Print the numbers divisible by 3 and 5 between given number AND ONLY print count
                    of those numbers which is divisible by 3 and 5.
                    EXAMPLE:
                    First number: 5
                    Second number: 65
                    Output: 4
                        //-> Because between 65 and 5 there is only 4 number divisible by 3 and 5 which
                        //-> are 15 30 45 and 60 but in this task please do not print anything else just the
                       // count of number which are divisible by 3 and 5.
                     */

//        System.out.println("Enter a starting number");
//        int num1 = scanner.nextInt();
//        System.out.println("Enter an ending number");
//        int num2 = scanner.nextInt();
//        int count =0;
//        int sum=0;
//        //if (num1 % 3==0 && num1 % 5 ==0  && num2 % 5 == 0 && num2 % 3 ==0){
//        for (int i = num1; i <= num2;i++){
//
//            if ((i %3 ==0) && (i %5==0)){
//               count++;
//               sum +=i;
//            }
//       }
//        System.out.println(count);

        /*
        Using the scanner ask the user to provide String value.
        Then replace all the char of the String with 'a' using loop and PRINT IN EVERY STEP.
        Look at example below carefully
						For example:
        Input: Success
        Output:
        "auccess"
        "aaccess"
        “aaacess”
        "aaaaess"
        "aaaaass"
        "aaaaaas"
        "aaaaaaa"
        “aaaaaaa”
         */


//
//                System.out.println("Enter a string value");
//                String str = scanner.nextLine();
//                int index = 1;
//                String a = "a";
//                while (index <= str.length()) {
//                    str = str.substring(index);
//                    str = a+str;
//                    index++;
//                    a +="a";
//                   System.out.println(str);
//                }
//            }
//        }

        /*
        The user using a scanner enters the current speed and target speed .
        In every 1-sec car's speed will increase 10mil. Please find the total number of sec
        to reach your target speed using a while loop.
        Example:
        CurrentSpeed: 6
        Target Speed: 20
        Output: 2. -> Because in two seconds user can reach the target speed.
         */
//
//        System.out.println("Enter current speed");
//        int current = scanner.nextInt();
//
//        System.out.println("Enter target speed");
//        int target = scanner.nextInt();
//
//        int second =0;
//        while (current< target){
//        current+=10;
//            second++;
//        }
//
//        System.out.println(second);








    }
}



















