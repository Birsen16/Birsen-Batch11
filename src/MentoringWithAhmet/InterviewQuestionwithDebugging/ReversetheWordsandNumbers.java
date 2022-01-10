package MentoringWithAhmet.InterviewQuestionwithDebugging;

import java.util.Scanner;

public class ReversetheWordsandNumbers {
    public static void main(String[] args) {
        //Ask the user to input word and reverse it
        //Ask the user to input number and reverse it
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter an word");
        String word = scanner.nextLine();
        System.out.println("enter an number");
        int number = scanner.nextInt();

       for (int i =word.length()-1; i>=0;i--){
           word+=word.charAt(i);
       }
        System.out.println(word);


    }
}
