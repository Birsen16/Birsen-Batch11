package Loops.forLoop;

public class homepractiseloop {
    public static void main(String[] args) {
        String str = "abcdefghijklmnop";
        int n =3;
        for(int i = 0; i<str.length();i+=n){
            System.out.print(str.charAt(i));
        }
    }

}
