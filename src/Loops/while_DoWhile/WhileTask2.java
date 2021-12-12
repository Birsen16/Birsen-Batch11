package Loops.while_DoWhile;

import java.util.Scanner;

public class WhileTask2 {
    /*
    get a string from user and priit out every letter from giben string seperated bu comma
    input--> winter
    out --> w, i, n, t, e, r,
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = input.next();
        int index =0;
        while (index < word.length()){
            System.out.print(word.charAt(index)+ ", ");
            index++;

        }

        //print those letters in reverse order
        System.out.println();// if you put empty sout it will give next line
        int lastIndex = word.length()-1;
        while (lastIndex >=0){
            System.out.print(word.charAt(lastIndex) + ", ");
            lastIndex --;
        }
          //Homework = count how many lower case letters in the given string and print out
    }
}
