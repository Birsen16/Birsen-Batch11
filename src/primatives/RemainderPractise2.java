package primatives;

public class RemainderPractise2 {

    public static void main(String[] args) {
        //find the product of digits from given number
        //456 ==> 4*5*6=120 sout)The product is = "

        int myValue = 456;

        int digit3 = myValue % 10;
        myValue = myValue/10;
        int digit2= myValue % 10;
        myValue = myValue/10;
        int digit = myValue%10;
        myValue = myValue/10;

        int product = digit * digit2 * digit3;

        System.out.println("The product is " + (digit * digit2 * digit3));
        System.out.println( "The Product is = " + product);

    }

}
