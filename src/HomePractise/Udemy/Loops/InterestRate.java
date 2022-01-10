package HomePractise.Udemy.Loops;

public class InterestRate {
    public static void main(String[] args) {


        int amount = 10000;
        for (double i = 8; i > 1; i--) {

            System.out.println("The interest amount of " + i+"% is " + amount * (i / 100));
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        int count=0;
        int num=50;

        for (int i = 10; i< num/2; i++){
          if (i%2!=0){
              System.out.println("Prime numbers are = " +  i);
            count++;
            if (count == 10){
                System.out.println("Exiting for loop");
                break;

            }

          }

          }
        System.out.println("Total of prime numbers are " + count);

    }

        }
/*
        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.

        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%

    // Create a for statement using any range of numbers
    // Determine if the number is a prime number using the isPrime method
    // if it is a prime number, print it out AND increment a count of the
    // number of prime numbers found
    // if that count is 3 exit the for loop
    // hint:  Use the break; statement to exit
 */