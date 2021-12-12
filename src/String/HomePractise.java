package String;

import java.util.Scanner;

public class HomePractise {
    public static void main(String[] args) {
//
//        String name = "Birsen";
//        System.out.println("My name is " + name);
//        Scanner input = new Scanner(System.in);
//        System.out.println("What is your name? ");
//        String youName = input.nextLine();
//        System.out.println("Very nice to meet you " + youName + " , Can you enter your address please?");
//        String address = input.nextLine();
//        System.out.println("What is your birth year?");
//        int birthYear = input.nextInt();
//        int age = 2021 - birthYear;
//        System.out.println("You are " + age + " years old and you look so young for your age");

//        Scanner scn = new Scanner(System.in);
//
//        System.out.println("What is your name?");
//        String name = scn.nextLine();
//        System.out.println("Hello " + name + " , Plese enter your height in meter. ");
//        double height = scn.nextDouble();
//        System.out.println( "Please enter your weight in kilo. ");
//        double weigh = scn.nextDouble();
//        double BMI = weigh / (height * height);
//        System.out.println("Your BMI is = " + BMI);
//        System.out.println(name + ", You are in perfect shape for now. Keep up good work!");


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String name = scanner.nextLine();
//        System.out.println("Please enter your birth year");
//        int birthYear = scanner.nextInt();
//        int age= 2021-birthYear;
//        System.out.println(name + ", You are " + age + " years old.");


//        int number = 67893;
//        int digit5 = number %10;
//        number = number /10;
//        int digit4 = number % 10;
//        number = number /10;
//        int digit3 = number % 10;
//        number = number /10;
//        int digit2 = number % 10;
//        number = number / 10;
//        int digit = number % 10;
//        number = number /10;
//        System.out.println(digit5);
//        System.out.println(digit4);
//        System.out.println(digit3);
//        System.out.println(digit2);
//        System.out.println(digit);


//        double degreeInFahrenheit = 212.0;
//        double temperature = (degreeInFahrenheit -32) / 1.8;
//        System.out.println( degreeInFahrenheit + " degree Fahrenheit is "
//                + temperature + " in Celsius");
//
//        Scanner number = new Scanner(System.in);
//        System.out.println("Hello User, please enter an integer number?");
//        int input = number.nextInt();
//      //if reminder with 3 gives 0 this number will be even
//        //otherwise it is off
//
//        boolean isEven = input % 2 == 0;
//        System.out.println(input + " is even number " + isEven);

        // HERE WE HAVE A CASTING. WE ENTER 5.99 AND IT PRINTS 5 BECAUSE WE CAST DOUBLE TO INT AS BELLOW

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter a double number");
//        int number = (int)scanner.nextDouble();
//        System.out.println("Here is your int number==: " + number);
 //       System.out.println("**************************************************************************");

        //HERE WE HAVE WHILE LOOP ALONG WITH BREAK
//        Scanner scan = new Scanner(System.in);
//        while (true){
//            System.out.println("Please enter some data and hit enter (- 1 to quit)");
//            if (scan.hasNextInt()){
//                int data = scan.nextInt();
//                System.out.println(data + " is an integer \n\n");
//                if (data ==-1)break;
//        System.out.println("**************************************************************************");

//            Scanner scanner=new Scanner(System.in);
//
//            System.out.println("Please enter max capacity:");
//            int maxCapacity = scanner.nextInt();
//            System.out.println("Please enter number of sold tickets");
//            int soldTickets = scanner.nextInt();
//
//            boolean enoughCapacity = maxCapacity > soldTickets;
//
//            System.out.println(enoughCapacity);
//        System.out.println("**************************************************************************");
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Please enter first exam score (1 - 100):");
//        double first = scanner.nextDouble();
//        System.out.println("Please enter second exam score (1 - 100):");
//        double second = scanner.nextDouble();
//        System.out.println("Please enter third exam score (1 - 100):");
//        double third = scanner.nextDouble() ;
//
//        System.out.println("Please enter your attendance percentage:");
//        double attendance = scanner.nextDouble();
//
//
//        boolean canPass = ((first /100* 20) + (second /100* 30) + (third /100* 50)) >= 65 && (attendance >= 80);
//
//
//        System.out.println(canPass);

        System.out.println("**************************************************************************");

//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Daily Steps:");
//        int steps = scanner.nextInt();
//        System.out.println("Daily Miles:");
//        double miles = scanner.nextDouble();
//        System.out.println("Daily calories:");
//        int callories = scanner.nextInt();
//
//       boolean canLoose10Kilos = callories < 1500 && steps >= 10000 || miles >= 4.0;
//        System.out.println(canLoose10Kilos);

        System.out.println("**************************************************************************");
//        int a =11;
//        int b = 1;
//        int total=a++ + ++a + --b + ++b + b + ++a + ++b - --b + a;
//        System.out.println(a); // After finding the total a = 8
//        System.out.println(b); // After finding the total b = 9
//        System.out.println(total); // total will be 55
//        // in this task, you should only find the value of a and b in the beginning.
//        // There is no test for this task.
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("type something");
//        String something = input.next();
//        System.out.println("type something else");
//        String anything = input.next();
//        System.out.println(something + " " + anything);


        //           Scanner scan = new Scanner(System.in);

//            System.out.println("How many numbers");
//            int howMany = scan.nextInt();
//        System.out.println("enter numbers of your chose");
//            int x =3;
//            int total = 0;
//            while (x <= howMany){
//                int num = scan.nextInt();
//                total += num ;
//                x++;
//            }
//        System.out.println(" The sum is = " + total);
//
//        Scanner scan = new Scanner(System.in);
//        //enter password = Computer
//        //incorrect. Try again : zebra
//        //incorrect Try again : password
//        //incorrect Try again : apple
//        //incorrect Try again : eagle
//        //Access granted!
//        System.out.println("Enter the password : ");
//        String guess = scan.nextLine();
//        while (!guess.equalsIgnoreCase("eagle")) { //guess is not equal to "eagle". There is another way to do it which is
//            //(guess.equals("eagle") == false)
//            System.out.println("incorrect. Try again : ");
//            guess = scan.nextLine();
//
//        }
//        System.out.println("Access is granted!");
        /*
        Using scanner enter two String input. Print true if the second string is starting with
        the first string’s last two characters,otherwise print false.
        Example 1: Enter first string value: Google Enter second string value:: Learning Result: true
        Example 2: Enter first string value: Utility Enter Second string value: Type Result: true
         */

       // Scanner input = new Scanner(System.in);

        //$$$$two digit homework

//        System.out.println("Enter first string value");
//        String firstStringValue = input.nextLine();
//
//        System.out.println("Enter second string value");
//        String secondStringValue = input.nextLine();
//        String lastTwoChar= firstStringValue.substring(firstStringValue.length()-2);
//
//        Boolean isTrue = secondStringValue.startsWith(lastTwoChar);
//        System.out.println(isTrue);

        /*
        Using Scanner ask the user to enter one of the song names and make sure you are using nextLine() method to instantiate string.
         1. Print first char of given song name
         2. Print last char of given song name
         3. Print length of the given song name
         4. Print the index number of "k" in this song name
         5. Print char from an index number of 3
         6. Print song name upper case
         7. Print song name lower case
            Please do all printing in order.
         */
//        System.out.println("Enter song name");
//        String favoriteSong = input.nextLine();
//        System.out.println(favoriteSong.charAt(0));
//        System.out.println(favoriteSong.charAt(favoriteSong.length()-1));
//        System.out.println(favoriteSong.length());
//        System.out.println(favoriteSong.indexOf("k"));
//        System.out.println(favoriteSong.substring(3,4));
//        System.out.println(favoriteSong.toUpperCase());
//        System.out.println(favoriteSong.toLowerCase());
        /*
       + Go to Main class
       + Create a Scanner object inside the main method
        +Ask the user to enter a random word
        +Then ask the user to input the number of letters that word consists
       + Your code should print true if the user entered a right number of letters in the word, false if the wrong number is entered.
        +Then the code should ask to enter a letter that the user wants to find an index of.
        +Your code should print the index of the entered letter, if the word doesn’t contain the letter then the code should print -1
        Please look at two Examples below to understand how your code should work.
        Enter a random word
        Techtorial -> this line represents user's input Enter number of letter that word consists 10 ->
        this line represents user's input true Enter a letter that you want to find an index a -> this line represents user's input 8

        Second Example

        Enter a random word Java Enter number of letter that word consists 6 false Enter a letter that you want to find an index v 2
         */

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a random word");
//        String randomWord = input.nextLine();
//
//        System.out.println("Enter number of letter that word consists");
//        int number = input.nextInt();
//
//        System.out.println("Enter a letter that you want to find an index");
//        String letter =input.nextLine();
//
//        boolean isLenghtEqual= randomWord.length() == number;
//        int indexNumber = randomWord.indexOf(letter);
//        System.out.println(isLenghtEqual);
//        System.out.println(indexNumber);
        /*
        Please ask user to input three string value
         1- Print the first char of those three-string together.
         2- Print the last char of each string together
         3- Print true if each of the string lengths is equaled to each other.

         EXAMPLE: Input -1: We
         Input -2: Love
         Input -3: Java
         OUTPUT: WLJ eea false (since each string length is not equals to each other)

         */
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please enter the first word");
//        String firstWord = scanner.next();
//        System.out.println("Please enter the secnd word");
//        String secondWord = scanner.next();
//        System.out.println("Please enter the third word");
//        String thirdWord = scanner.next();
//        String firstChars = "" +firstWord.charAt(0)+ secondWord.charAt(0)+thirdWord.charAt(0);
//        String lastChars = "" +firstWord.charAt(firstWord.length()-1)+secondWord.charAt(secondWord.length()-1)+thirdWord.charAt(thirdWord.length()-1);
//        int firstWordLength= firstWord.length();
//        int secondWordLength = secondWord.length();
//        int thirdWordLength = thirdWord.length();
//        boolean isLengthEqual= firstWordLength == secondWordLength && firstWordLength == thirdWordLength && secondWordLength == firstWordLength;
//        System.out.println(firstChars);
//        System.out.println(lastChars);
//        System.out.println(isLengthEqual);

        /*
        Using Scanner ask user to enter one string value with three words
        1- Print first letter of each word together
        2- Print last letter of each word together
        3- Print length of each word (First print first word's length then print second word's length
           lastly print last word's length)
           Example:
           Please enter value:
           "Java String Test"
            Output:
            JST
            agt
            4
            6
            4
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the first word");
//        String firstWord = scanner.next();
//        System.out.println("Please enter the second word");
//        String secondWord = scanner.next();
//        System.out.println("Please enter the third word");
//        String thirdWord = scanner.next();
//        String firstChars = "" +firstWord.charAt(0)+ secondWord.charAt(0)+thirdWord.charAt(0);
//        String lastChars = "" +firstWord.charAt(firstWord.length()-1)+secondWord.charAt(secondWord.length()-1)+thirdWord.charAt(thirdWord.length()-1);
//        System.out.println(firstChars);
//        System.out.println(lastChars);
//        System.out.println(firstWord.length());
//        System.out.println(secondWord.length());
//        System.out.println(thirdWord.length());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two string word");
        String word = scanner.nextLine();
        int Space= word.indexOf(" ");
        // Google learning"
        System.out.println(Space);
        String lastTwoLettersOfFirstWord = word.substring(Space-2, Space);
        String firstTwoLettersOfSecondWord= word.substring(Space+1, Space+3);
        System.out.println(lastTwoLettersOfFirstWord);
        System.out.println(firstTwoLettersOfSecondWord);
        boolean isEqual= firstTwoLettersOfSecondWord.equals(lastTwoLettersOfFirstWord);
        System.out.println(isEqual);






    }
}
