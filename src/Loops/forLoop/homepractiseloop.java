package Loops.forLoop;

public class homepractiseloop {
    public static void main(String[] args) {
        //print out every letter fro the string
        //print index number of the letter and * together with the letter >> 0*T 1*0 2*d.....
        String str = "Today is snowyy";

//        for (int i = 0; i< str.length(); i++){
//            System.out.println(i + "*" + str.charAt(i));
//
//        }//print out only letter y from the string
        int count=0;
        for (int i =0; i < str.length(); i++){
            if (str.charAt(i)=='y'){
                System.out.println(str.charAt(i));
               count++;

            } System.out.println(count);

        }


    }
}
