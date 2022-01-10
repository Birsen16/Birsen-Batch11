package Array;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int[] studentIds =new int[5];
        studentIds[0]=22;
        studentIds[1]=23;
        studentIds[3]=24;
        studentIds[4]=25;
        studentIds[2]=26;



        studentIds[1]=99; //reassigning the value of studentId[5]
        System.out.println(studentIds[1]); //99
        //studentIds[5]=51; // index 5 is out of bounds for length 5
       // System.out.println(studentIds[5]);//index 5 is out of bounds for length 5 there are just 0 through 4.
       // System.out.println(studentIds);//it will print out memory location for erray --->[I@c818063

        System.out.println( studentIds[0]);//99  reassignment is fine this was differnt number earlier
        System.out.println( studentIds[1]);//22
        System.out.println( studentIds[2]);//99
        System.out.println(studentIds[3]);//0 -->default value  **** if you have reserve spot but value then 0 pops up
        /*int -->0
        double -->0.0
        object-->null
        string-->null
        boolean-->false
        char-->''
         */
        System.out.println("=======================");
        for (int i =0; i < studentIds.length; i++) {
            System.out.println(studentIds[i]);// 22,99,26,24,25
        }
        System.out.println("=======================");
            System.out.println(Arrays.toString(studentIds));//[22, 99, 26, 24, 25] it will print all elements from array


    }
}
