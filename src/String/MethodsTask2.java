package String;

import java.util.Scanner;

public class MethodsTask2 {
    public static void main(String[] args) {
        /*
        by using scnner ask user to provide his/her gender, full name and birth year in the following format
        F - Jeny Brown - 1999
 - check if the sting starts with F
 - check if the string ends with M
 - check if the string contains your name
 - check if the string ending with birth year
 - replace '-' with '/'
         */

        Scanner input = new Scanner(System.in);
        System.out.println("What is your gender,full name and birth year in" + " the following format : F- Jenny Brown - 1999 ?");
        String info = input.nextLine();
        System.out.println(info.startsWith("F"));//
        System.out.println(info.endsWith("M"));
        System.out.println(info.contains("Birsen"));
        System.out.println(info.endsWith("2000"));
        System.out.println(info.replace('-', '/'));//you can put those in double quatation if i wish



    }
}
