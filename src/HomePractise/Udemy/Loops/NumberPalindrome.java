package HomePractise.Udemy.Loops;

public class NumberPalindrome {
    public static void main(String[] args) {
        Palandrome(1221);
    }
    public static void Palandrome(int num){

        /*
        1-num i number olarak karsilastirma amacli save yapti
        2-variable reverse yaratti buda last digit icin
        3-while da ise number 0 olmama sartini koydu
        4- last digit aldi num%10
        5-son digit i ters cevirdi onuda reverse *10 +last digit yapti
        6- increment kisminida num/10 ile yapti
         */
        int reverse = 0;
        int number=num;
        while (num!=0) {
            int lastDigit = num%10; //1221 % 10= 1-----122%10=2-----12%10=2----1%10=1
           // reverse *= 10;
            //reverse += lastDigit;
            reverse=(reverse*10)+lastDigit; //(0*10)+1=1----(1*10)+2=12----(12*10)+2=122-----(122*10)+1=1221
            num /= 10;//122---122/10=12----12/10=1----1/1=0

        }
        if (reverse==number){
            System.out.println(number+ " is palindrome");
        }else {
            System.out.println(number + " is not palindrome");
        }

        /*
            public static boolean isPalindrome(int number) {
        int reverse = 0;
        for (int i = number; i != 0; i /= 10)
            reverse = i%10 + reverse*10;
        return reverse == number;
    }
}
         */
    }

}


/*
Write a method called isPalindrome with one int parameter called number.

The method needs to return a boolean.

It should return true if the number is a palindrome number otherwise it should return false.

Check the tips below for more info about palindromes.

Example Input/Output

isPalindrome(-1221); → should return true

isPalindrome(707); → should return true

isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.

Tip: What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the original number. For example: 121, 12321, 1001 etc.

Tip: Logic to check a palindrome number

Find the the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse.

If both are the the same then the number is a palindrome otherwise it is not.

Tip: Logic to reverse a number

Declare and initialize another variable to store the reverse of a number, for example reverse = 0.

Extract the last digit of the given number by performing the modulo division (remainder).
Store the last digit to some variable say lastDigit = num % 10.
Increase the place value of reverse by one.
To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
Add lastDigit to reverse.
Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10.
Repeat steps until number is not equal to (or greater than) zero.

A while loop would be good for this coding exercise.


Tip: Be careful with negative numbers. They can also be palindrome numbers.

Tip: Be careful with reversing a number, you will need a parameter for comparing a reversed number with the starting number (parameter).

NOTE: The method isPalindrome needs to be defined as public static like we have been doing
 */