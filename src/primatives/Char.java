package primatives;

public class Char {
    public static void main(String[] args) {
        char ch1 ='A';
        System.out.println("A");// This is string. I can use it again and again
        System.out.println(ch1); //
        System.out.println('A');

        ch1= '5';
        System.out.println(ch1*2);//ASCII table value of 5 is 53. that's why it gave the result of 106

        char ch2= ch1;
        System.out.println(ch1);
        char ch3 = '&';
        System.out.println(ch3);

        char ch4 = 80;
        System.out.println(ch4); // ASCII  table indicates 79 as O.
        //  char ch5 = 'ye';     You can't assign more than one character in single quotation mark

        int numberChar = 'T';
        System.out.println(numberChar); // T is 84 on ASCII table

        char randomChar = 2345;
        System.out.println(randomChar);
        //SUMMARY OF THE CHAR AND INT FOR ASCII
        char yourLetter = 110;
        int ourLetter = 'K';
        System.out.println(yourLetter);
        System.out.println(ourLetter);



        // char can take whole number and int can take single character because of the ASCII


    }
}
