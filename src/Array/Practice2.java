package Array;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] number = {4,3,6,7,11,45};
        System.out.println(number[3]);//7
       // number[6]=99; //IndexOutOfBoundsException
        number[1]=88;
        System.out.println(number.length);//6
        System.out.println(Arrays.toString(number));// [4, 88, 6, 7, 11, 45]
        for (int i =0; i<number.length;i++){
            System.out.println(number[i]);
        }
        }
    }

