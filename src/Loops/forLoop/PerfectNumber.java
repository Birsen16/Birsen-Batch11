package Loops.forLoop;

public class PerfectNumber {
    public static void main(String[] args) {
        //perfect number
        //if some of the divisors (except number itself) equals to number, it is called perfect number > ex: 28

        int sum=0;
        int number=28;
        for( int divisor = 1; divisor <=number/2 ; divisor++){

                if (number % divisor==0){
                    sum+=divisor;
                    System.out.println(sum);
            }
        }
            if (number == sum){
                System.out.println(number + " is a perfect number");
            }else {
                System.out.println(number + " is not a perfect number");
            }
    }
}
