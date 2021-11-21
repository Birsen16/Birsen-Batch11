package primatives;

public class RemainderPractice {

    public static void main(String[] args) {
        //Modulus --> remainder (leftover after division)

        int number1 = 45;
        int number2 = 6;
        int remainder1 = number1 % number2;
        System.out.println("Remainder1 is = " + remainder1);
        //Find the sum of digits from given number
        // 123---> 1+2+3=6===>sout(sum is >><sum>
        int myNumber =123;
        int digit3 = myNumber%10; //123 % 10 = 3
        myNumber    =myNumber/10; //123 / 10 =12
        int digit2 = myNumber%10; //12 % 10 = 2
        myNumber = myNumber/10;  //12 / 10 =1
        int digit1 = myNumber%10; // 1 % 10 =

        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);

        double sum =digit1 + digit2 + digit3;
    }
}
