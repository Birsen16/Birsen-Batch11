package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CombiningArrays {
    public static void main(String[] args) {
        int[] num1= {3,4,5};
        int[] num2 = {6,7,8,9};
         //combine those two arrays in another arrays

            int[] result= new int[num1.length + num2.length];

            for (int i = 0; i< num1.length;i++){
                result[i]=num1[i];
            }
        System.out.println(Arrays.toString(result));//[3, 4, 5, 0, 0, 0, 0]
        for (int y = num1.length,c= 0; y < result.length;y++,c++){
            result[y]= num2[c];
        }
        System.out.println(Arrays.toString(result));//[3, 4, 5, 6, 7, 8, 9]
        }
    }

