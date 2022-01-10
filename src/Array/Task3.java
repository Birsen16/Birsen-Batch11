package Array;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {4,24,10,100,5,78,11,25,55};
        //print out numbers grater than 10
        int count=0;
        int[] largeNumbers= new int[arr.length];
        for (int i = 0; i< arr.length;i++){

            if (arr[i]>10){
                //System.out.println(arr[i]);// we are saving this one in largeNumbers
                largeNumbers[i]=arr[i];
            }
        }
        System.out.println(Arrays.toString(largeNumbers));

    }
}
