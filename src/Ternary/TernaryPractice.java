package Ternary;

import java.util.Locale;

public class TernaryPractice {
    public static void main(String[] args) {
        int a = 2,b = 3;
        String result1 =a < b ? "hello": "Bye";
        System.out.println(result1);
        //int result2 = a < b ? a * b: "Text"; to be able to stereo the result
                                               // of ternary bot options has to be same date type
        System.out.println(a< b ? a*b: "Test'");

        boolean result3 =a >= b ? a == b : a<b;
        System.out.println("result = " + result3);

        int result4 = 'a' > 'Z' ? 5 + 6 +7 : 7-4-1; // first contition is true from ascii table
        System.out.println(result4);

        String str = "David";
        String result5 = str.substring(3).equals("id") ? str.toLowerCase().concat(" is number") : str.toUpperCase().concat("is String");
        System.out.println(result5);
        System.out.println(str.equals("DAVID") ? str.substring(3).toUpperCase() : str.substring(3).toLowerCase());

        int n1 = 2;
        int n2 = 3;
       int restult6 =  n1 % 2 == 0 ? 5 : 6;
        System.out.println(restult6);


    }
}
