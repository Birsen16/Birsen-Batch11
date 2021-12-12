package Homework;


import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
                /*
        Using scanner ask user to enter grade letter and print the number value matching with this grade.
Example:
Input :
A
Output:
4.0
Input:
A-
Output:
3.7
NOTE:
The University uses a 4 point scale
for grades; these “quality” grades are as follows
4.0 = A,
3.7 = A-,
3.3 = B+,
3.0 = B,
2.7 = B-,
2.3 = C+,
2.0 = C,
1.7 = C-,
1.3 = D+,
 1.0 = D,
         */
//        System.out.println("Please enter your grade in letter.");
//
//        Scanner input = new Scanner(System.in);
//
//        String gradeLetter = input.nextLine();
//
//        if (gradeLetter.equalsIgnoreCase("A")){
//            System.out.println("4.0");
//        }else if (gradeLetter.equalsIgnoreCase("A-")){
//            System.out.println("3.7");
//
//        }else if (gradeLetter.equalsIgnoreCase("B+")){
//            System.out.println("3.3");
//
//        }else if (gradeLetter.equalsIgnoreCase("B")){
//            System.out.println("3.0");
//
//        }else if (gradeLetter.equalsIgnoreCase("B-")){
//            System.out.println("2.7");
//
//        }else if (gradeLetter.equalsIgnoreCase("C+")){
//            System.out.println("2.3");
//
//        }else if (gradeLetter.equalsIgnoreCase("C")){
//            System.out.println("2.0");
//
//        }else if (gradeLetter.equalsIgnoreCase("C-")){
//            System.out.println("1.7");
//
//        }else if (gradeLetter.equalsIgnoreCase("D+")){
//            System.out.println("1.3");
//
//        }else if (gradeLetter.equalsIgnoreCase("D")){
//            System.out.println("1.0");
//
//        }else if(gradeLetter.equalsIgnoreCase("F")){
//            System.out.println("0.0");
//        }
        //**************Second question********************
        /*
        Using scanner ask user to enter one string value.
        If this string length is odd number print middle 3 string from given value.
        If the string length is even number print string without first letter.
        (You need to use if statement for this task)
        Example 1:
        Please enter the String value:
         test
         The output is:
         est

        Example 2:
        Please enter the String value: Chicago
        The output is:
        ica
         */
//        System.out.println("Please enter a string value.");
//        Scanner input = new Scanner(System.in);
//        String word = input.nextLine();
//        int lenght = word.length();
//        int remainder = lenght % 2;
//        int middle = word.length()/2;
//
//        if ( remainder== 0){
//            System.out.println(word.substring(1));
//
//
//        }else if (remainder == 1){
//
//
//            System.out.println(word.substring(middle -1, middle+2));
//        }
        /*
        Create two integer variables using scanner for cats, and people.

        If the number of cat is bigger than number of people
        print "Too many cats!  The world is meowed!",
        if the number of cats are smaller than number of people
        print "Not many cats!  The world is saved!".
        Lastly if they equal to each other print "Wow! There is a cat for every person."
        Note: Please use if else statement for this question.
         */
//        System.out.println("Please enter the number of cats");
//        Scanner input = new Scanner(System.in);
//        int cats = input.nextInt();
//        System.out.println("Please enter the number of people");
//        int people =input.nextInt();
//        if (cats > people){
//            System.out.println("Too many cats!  The world is meowed!");
//        }else if (cats < people){
//            System.out.println("Not many cats!  The world is saved!");
//        }else if (cats == people){
//            System.out.println("Wow! There is a cat for every person.");
//
//        }
        /*
        Write a Java program to get an integer number from the user and
        print whether it is positive or negative.

       Example
       Input number:
       35
       Output:
       positive
       Input number:
       -35
       Output:
       negative
         */
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter an integer number");
//        int number = input.nextInt();
//        if (number >=0){
//            System.out.println("positive");
//
//        }else if (number < 0) {
//            System.out.println("negative");
//        }
            /*
            Using scanner ask user to enter one String value.
            If string length is bigger than or equals to 3 print the
            string without first and last char. If the length is smaller
            than 3 print print as it is. (For this task you need to use if statement).
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

//            Scanner input = new Scanner(System.in);
//            System.out.println("Please enter a string value");
//            String word =input.nextLine();
//            int length = word.length();
//            String wordUpdated = word.substring(1,word.length()-1);
//
//            if (length >= 3){
//                System.out.println(wordUpdated);
//            }else{
//                System.out.println(word);
//            }
        /*
        Ask user to enter a password

1 - > If the string doesn't have any upper case
      letter or any lower case letter print
      "Your password is not acceptable"

2 - > If the first character of the password is upper case letter and
      last character of the password is not letter print
      "Your password is strong".
      password.indexof(0) && password.indexof(

3 - > If first character of the password is lower case letter and
      last character of the string is upper case print
      "Your password should be improved"

4 - > For all other conditions print
      "Your password is not valid"

For this task you should use if else statement.

This is the hardest task in this week's homework and
I will send solution for this task on Monday.
*/
        }

        }
