package Loops.forLoop;

public class ReversingString {
    public static void main(String[] args) {
        //String str= "Lets do it" reverse this string
        String str= "Lets do it";
        String reverse ="";
        for (int i = str.length()-1; i>0 ;i--){

        reverse+=str.charAt(0);
        }
        System.out.println(str);
        System.out.println(reverse);
    }
}
