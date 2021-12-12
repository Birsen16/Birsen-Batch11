package Loops.while_DoWhile;

import IfStatement.IfPractice;

public class CountingChars {
    public static void main(String[] args) {
    /*
    -count letters, digits and other characters in the String
     String str = "$3%GTlk64mn^y?";
     sout("There are <..> letters in the string");
     sout("There are <..> digits in the string");
     */
//        String str= "$3%GTlk64mn^y?".toUpperCase();
//        int index=0;
//        int letterCounter=0;
//        int numberCount =0;
//        int charCounter=0;
//
//        do {
//            if (str.charAt(index) >= 'A' && str.charAt(index) <= 'Z'  ){
//                letterCounter++;
//            }else if (str.charAt(index) >= '0' && str.charAt(index) <='9'){
//                numberCount++;
//
//            }else{
//                charCounter++;
//            }
//            index++;
//
//        }while (index < str.length());
//        System.out.println("There are "+letterCounter + " letters in the string");
//        System.out.println("There are "+numberCount + " numbers in the string");
//        System.out.println("There are "+charCounter + " symbols in the string");
//
        int index= 0;
        String str = "$3%GTlk64mn^y?".toUpperCase();
        int letterCounter = 0;
        int numberCounter =0;
        int charCounter =0;
        do {
            if (str.charAt(index) >= 'A' && str.charAt(index) <='Z'){
                letterCounter++;
            }else if (str.charAt(index) >= '0' && str.charAt(index) <='9'){
                numberCounter++;
            }else{
                charCounter++;
            }
            index++;

        }while (index < str.length());
        System.out.println("There are "+letterCounter + " letters in the string");
        System.out.println("There are "+numberCounter + " numbers in the string");
      System.out.println("There are "+charCounter + " symbols in the string");

    }
}
