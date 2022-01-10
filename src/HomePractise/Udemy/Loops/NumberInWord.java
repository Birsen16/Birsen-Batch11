package HomePractise.Udemy.Loops;

public class NumberInWord {
    public static void main(String[] args) {
        /*
        Write a method called printNumberInWord.
        The method has one parameter number which is the whole number.
        The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER"
        if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers.
         You can use if-else statement or switch statement whatever is easier for you.
         */
        numberInWord(5);
        numberInWord(1);
        numberInWord(-1);
        numberInWord(9);

    }

    public static void numberInWord(int number) {
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            default:
                System.out.println("other");
                break;
        }
        System.out.println(number);

    }



    }




