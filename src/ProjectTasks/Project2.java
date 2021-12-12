package ProjectTasks;

import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {

                /*  TASKTWO
//        Write program will add up the value of a number of
//        quarters, dimes, nickels, and pennies.  The number of each
//        type of coin is input by the user.  The total value is printed in
//        dollars.
//        Example:
//        Quarters: 5
//        Dimes:   4
//        Nickels:  3
//        Pennies:  2
//        The total in dollars is $1.82
//        Description
//         */
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Please enter how many quarters you have?");
//        double quarter = scanner.nextInt();
//        System.out.println("Please enter how many dimes you have?");
//        double dimes = scanner.nextInt();
//        System.out.println("Please enter how many nickels you have?");
//        double nickels = scanner.nextInt();
//        System.out.println("Please enter how many quarters you have?");
//        double pennies = scanner.nextInt();
//
//        double quarterValue = 0.25d;
//        double dimeValue = 0.10d;
//        double nickelValue= 0.05d;
//        double pennyvalue= 0.01d;
//
//        double total = (quarter * quarterValue) + (dimes * dimeValue) + (nickels * nickelValue) + (pennies * pennyvalue);
//
//        System.out.println("The total in dollars is  " + total);


        //&&&&&&&&&&&&THIRD TASK&&&&&&&&&&
        /*I need to write a program that will take a given amount
         of money and return the number of dollars in quarters,
         dimes, nickels, and pennies that make up that given
         amount
         Example 1:
         Please enter your balance:
         2.36
        $2.36 will make 9 quarters 1 dime 0 nickels and 1
        pennies
        Description */
//
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Please enter your balance ");
//        double balance =scanner.nextDouble();
//
//        double remainder =(balance % 0.25); //2.36-->0,16  10%3=
//        double quarter = (balance - remainder) /0.25;// 2.36-16=2.25/
//
//        double dimeRemainder =remainder % 0.10;//0.16 % 0.10=0.06
//        double dime = (remainder -dimeRemainder)/ 0.10;//0.16-0.06=0.10
//        double nickelRemainder=dimeRemainder % 0.05;//0.16-0.10=0.06
//        double nickel =(dimeRemainder-nickelRemainder) /0.05;//0.06-0.05=0.01
//        double penny = balance-((quarter * 0.25) + (dime * 0.10) + (nickel * 0.05));
//        //penny = Math.round(penny*100)/100;
//        System.out.println("$" + balance +  " will make "
//                + quarter + " quarters " + dime + " dimes " + nickel+ " nickels and " + penny + " pennies");

        //&&&&&&&&&&&FOURTH TASK&&&&&&&&&&&&&&&&&&&&&&
        /*1. Write a program that will accept only 6 digit
        numbers like 578432 and find multiplication
                (5*7*8*4*3*2) of all digits and sum
                (5+7+8+4+3+2)of all digits.
                Example 1:
        578432
        Multiplication of all digits is 6720
        The Sum of all digits is 29
        Description */

//                Scanner scanner= new Scanner(System.in);
//                System.out.println("Please enter 6 digit number ");
//                int number =scanner.nextInt();
//               if (number < 10000 || number >999999) {
//                   System.out.println("Number must be 6 digit, please try again");
//               } else {
//
//                   int firstDigit =number % 10;
//                   number = number /10;
//                   int secondDigit =number % 10;
//                   number = number /10;
//                   int thirdDigit =number % 10;
//                   number = number /10;
//                   int fourthDigit =number % 10;
//                   number = number /10;
//                   int fifthDigit =number % 10;
//                   number = number /10;
//                   int sixthDigit =number % 10;
//                   number = number /10;
//                   System.out.println(firstDigit * secondDigit * thirdDigit * fourthDigit * fifthDigit * sixthDigit);
//                   System.out.println(firstDigit + secondDigit + thirdDigit + fourthDigit + fifthDigit + sixthDigit);
//               }

//              &&&&&&&&&&&&&&&&&FIFTHTASK&&&&&&&&&&&&&&&
      /*Write a program that will accept 5 digit number and
       will print reversed number at the end.
       Example-1:
       53876
       The output is 67835
       Example-2:
       97352
       The output is 25379
       Description*/


//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Please enter 5 digit number ");
//        int number =scanner.nextInt();
//        if (number < 10000 || number >99999) {
//            System.out.println("Number must be 5 digit, please try again");
//        } else {
//            //12345
//            int firstDigit =number % 10; // -->5
//            number = number /10;         // -->1234
//            int rev1 = firstDigit * 10;  // -->50
//
//            int secondDigit =number % 10;// -->4
//            number = number /10;        //  -->123
//            int rev2 =rev1 + secondDigit; //-->50 +4 =54
//
//            int thirdDigit =number % 10; // -->3
//            number = number /10;         // -->12
//            int rev3 = rev2 * 10 + thirdDigit;// -->54 * 10 =540  , 540 + 3 =543
//
//            int fourthDigit =number % 10;// -->2
//            number = number /10;         // -->10
//            int rev4 = rev3 * 10 +fourthDigit;// -->5432
//
//            int fifthDigit =number % 10; // -->`1
//            number = number / 10;       // -->  1
//            int rev5 = rev4 * 10 + fifthDigit;
//
//            System.out.println(rev5);
//
                   /*

                    1234
                    1234 % 10=4
                    1234 /10=123
                    reverse4 = 4 *10=40

                    123 % 10 =3
                    123 /10 =12
                    rev3 =rev4 + second digit =43

                    12 % 10 =2
                    12/10 = 1
                    rev2 = rev3 * 10 =430 + third digit=432

                    1 % 10 =1
                    1/10 = 1
                    */

        //********************seventhTASK********************
        /*

            Using scanner enter String (any two words) value with
            spaces in the beginning and at the end. In this input, the
            second word is not starting with the upper case, using string
            methods change the letter with upper case and print it
            Example 1:
            Please enter the String with the following format “ word “
            Natural black
            The output is:
            Natural Black
            Description
         */
//
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Please enter two word String with format of \"Natural black\"");
//        String word =scanner.nextLine();
//        String space = " ";
//        String firstWord= word.substring(0,word.indexOf(space)); //Natural ===> first word
//        String firstLetterOfSecondWord = word.substring((word.indexOf(space)+1),(word.indexOf(space)+2)).toUpperCase();  //B
//        String secondPartOfSecondWord = word.substring(word.indexOf(" ")+2); //lack
//        String finalWord = firstLetterOfSecondWord + secondPartOfSecondWord;
//        System.out.println(firstWord.concat(space).concat(finalWord));


//        System.out.println(firstWord);           //natural
//        System.out.println(firstLetterOfSecondWord.concat(secondPartOfSecondWord)); // Black
//
//        // lemon juice
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter any two words");
//        String words = input.nextLine();//Lemon Juice
//        int secondSpace = words.indexOf(" ",words.indexOf(" ")+1);
//        System.out.println(words.substring(0,secondSpace)+ words.substring(secondSpace,secondSpace+2).toUpperCase()+words.substring(secondSpace+2));
//

        //**************TaskSix*******************
        /*
        Using a scanner enter three different ingredients for the product on the
        same line. Then ask the user to enter any int number. Change the first
        letter of the ingredients starting from the entered number. (Ingredients
        should start with different letters. Please read the example carefully )
        Example 1:
        Please enter three ingredients with spaces:
        Milk Peanuts Butter
        Please enter the int number:
        5
        The output is:
        5ilk 6eanuts 7utter
        Description
         */
//        System.out.println("TASK 6 MY CODE ");
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Please enter three ingredients with spaces exc Milk Peanut Butter");
//        String words =scanner.nextLine();
//
//       System.out.println("Please enter a random number.");
//       int number =scanner.nextInt();
//
//        int secondSpace = words.indexOf(" ",words.indexOf(" ")+1);
//        String firstWord= words.substring(0,words.indexOf(" "));
//        String secondWord= words.substring(words.indexOf(" "),secondSpace);
//        String thirdWord= words.substring(secondSpace,words.length());
//        String word1 =number + firstWord.substring(1,firstWord.length());
//        String word2=(++number) + secondWord.substring(2,secondWord.length());
//        String word3 =(++number) + thirdWord.substring(2,secondWord.length());
//
//        String space = " ";
//        System.out.println(word1 + space + word2 + space + word3);
//
//        System.out.println("TASK 6 SMART ANDREII'S CODE ");
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter three ingredients with spaces exc Milk Peanut Butter");
//        String ingredient1 = input.next();
//        String ingredient2 = input.next();
//        String ingredient3 = input.next();
//
//        System.out.println("Enter any int number");
//        int num = input.nextInt();
//        String ingredientResult1 = (num++)+ ingredient1.substring(1);
//        String ingredientResult2 = (num++)+ ingredient2.substring(1);
//        String ingredientResult3 = (num)+ ingredient3.substring(1);
//        System.out.println("The output is : \n" + ingredientResult1 + " " + ingredientResult2 + " " + ingredientResult3);
//
//        // task 6
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter any two words");// space word space word
//        String words = input.nextLine();
//        int secondSpace = words.indexOf(" ",words.indexOf(" ")+1);
//        System.out.println(words.substring(0,secondSpace)+ words.substring(secondSpace,secondSpace+2).toUpperCase()+words.substring(secondSpace+2));

        }
    }


