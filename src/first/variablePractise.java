package first;

import java.util.Scanner;

public class variablePractise {
    public static void main(String[] args) {

//        int number1 = 6;
//
//        System.out.println(number1);
//
//        number1 = 7; // reassigning the value for variable
//
//        System.out.println(number1);
//
//        int $number = 6;
//        int number$ = 7;
//        int _number_ = 8;
//        int num$ber = 9;
//        // you can't start variable name with number or symbol other than $ and underscore.
//        // You can end with number but not start with number
//        // you can't use reserved keywords for naming the variable.
//
//        //TASK   create 2 int variables and print them as :
//        //My numbers are = <number1> and <number2>
//
//        int num1 =5;
//        int numb2 =15;
//        System.out.println("My numbers are= " + num1 + " and " + numb2);
//        System.out.println("My first number is: " + 111);
//
//        int a, b, c; //you can declare and initialize variable an th same line if they have same date type
//        int x =1, y =2, z =3;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a random word");
        String randomWord = input.nextLine();

        System.out.println("Enter number of letter that word consists");
        int givenLetterLenght = input.nextInt();


        System.out.println("Enter a letter that you want to find an index");
        String indexOfChar = input.nextLine();


//        int letterLenght = randomWord.length();
//        boolean isTrue = givenLetterLenght == letterLenght;


    }
}
