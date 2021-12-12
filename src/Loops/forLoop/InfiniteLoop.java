package Loops.forLoop;

public class InfiniteLoop {
    public static void main(String[] args) {
        for (int k = 0; k<6 ;k++){
            System.out.println("Said");
        }
        // infinite loop
        for ( ; ; ){
            System.out.println("Zack");//this will run forever becaue there is no condition and this is called infinite loop

        }
       // System.out.println(x); this statement will not be reached out since there is infinite loop before it
    }
}
