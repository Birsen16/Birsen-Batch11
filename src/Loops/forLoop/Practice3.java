package Loops.forLoop;

public class Practice3 {
    public static void main(String[] args) {
        //print out every letter from the string
        //print index number of he letters and * together with the letter >> 0*T 1*0 2*d.....
        String str = "Today is snowyyyyyy";

//        for (int i = 0; i < str.length()-1; i++){
//
//            System.out.print(i + "*"+ str.charAt(i)+ " ");
//        }

        //
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i)=='y'){
                System.out.println(i +"" +str.charAt(i));
            }

        }

        //count the number if letter 'n' in the given String
        //"There are .... 'n' in the string"
        int count = 0;
        for (int i =0 ; i< str.length(); i++){
            if (str.charAt(i) =='n'){
                count++;
            }
        }
        System.out.println("There are " + count + "letter n in the string");

    }
}
