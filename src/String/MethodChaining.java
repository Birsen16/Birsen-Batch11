package String;

import java.util.Scanner;

public class MethodChaining {
    public static void main(String[] args) {
//        String name = "    David  ";
//        //you can use string method as much as you want until you reach return type int or boolean type. This sample was
//                            //String type but we changed it to char because last method return type id char
//        char letter =name.substring(5).substring(2).toUpperCase().replace("a", "xxx").trim().charAt(1);
//        System.out.println(letter);
//        String n = name.substring(5).substring(2).toUpperCase().replace("a", "xxxx").trim();
//        System.out.println(n);




        /*
        Go to Main class
        Create a Scanner object inside the main method
        Get all the information below using scanner BUT Please DO NOT use ANY System.out.println();
        other than printing result AT THE END.
         a. Full Name b. State Code c. City d. Gender ( F, M) e. Age
        If Age is more than 18 and Full Name is starting with ‘A’ and last name is ending with ‘V’ and state code
         is starting with ‘I’ and ending with ‘L’ and City length is not more than 10,
         and gender is equaled to ‘F’, I am able to vote. If I am able to vote, print true. If not, print false.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Name");
        String fulllName= input.nextLine();
        System.out.println("State Code");
        String stateCode = input.nextLine();
        System.out.println("city");
        String city = input.nextLine();
        System.out.println("gender");
        String  gender = input.nextLine();
        System.out.println("age");
        int age = input.nextInt();

        Boolean canVote =  fulllName.startsWith("A") && fulllName.endsWith("V") && stateCode.startsWith("I") && stateCode.endsWith("L")
                 && age > 18 && gender.endsWith("F") && city.length() <= 10;
        System.out.println(canVote);



    }
}
