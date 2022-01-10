package Array;

import java.util.Arrays;

public class MultiPractice1 {
    public static void main(String[] args) {
        //States of different regions in USA
        // reach out and print evert single state
        String [][] states1=new String[1][1];
        String [][] states = {{"IL","OH"},{"NY","NC","FL"},{"CA","WA","OR","UT"}};
        /*
        if you create multidimensional array by using "new" keyword, inner array will be same size
         example = String [][] states1=new String[1][1];
        if you create multidimensional array with curly brackets, size of the inner array  can vary
        example =String [][] names = {{"IL","OH"},{},{"CA","WA","OR","UT"}};
         */

            for (String[] state : states){
                //for (int i = 0; i< state.length;i++){  bunida sout  Arrays.toString() olarak en sonunda yaparsan array halinde veriyour
                for (String st:state){
                    System.out.println(st);//IL OH NY NC,FL,CA,WA,OR,UT   bunlari yukaridan asagi print ediyor

                }

            }

    }
}
