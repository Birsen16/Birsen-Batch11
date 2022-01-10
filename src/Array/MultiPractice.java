package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiPractice {
    public static void main(String[] args) {
        int[][] numbers = new int[2][3];//bu numaralar index number degil miktar.
        // yani outer array ikitane elementi inner array 3 elementi olamdi lazim.
        // O yuzden index numbers bu rakamlardan 1 tane daha az. yani outer array, 0,` ve inner array q, 1, 2 ilacak
        System.out.println(numbers);//[[I@c818063
        System.out.println(Arrays.toString(numbers));//[[I@c818063, [I@3f0ee7cb]
        System.out.println(numbers[0][0]);//0
        System.out.println(numbers[0][1]);//0

        numbers[0][0]=22;
        numbers[0][1]=23;
        numbers[0][2]=44;
        numbers[1][0]=55;
        numbers[1][1]=66;
        numbers[1][2]=77;
        System.out.println(numbers[0][0]);//22
        System.out.println(numbers[1][1]);//66
        //exception examples
        //numbers[0][3]=66;//.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3 at Array.MultiPractice.main(MultiPractice.java:26)
        //System.out.println(numbers[0][3]);//IndexOutOfBoundsException
        //there is just 0,1,2 index numbers it means just 3 spots but with obove code it was assigned into 4th spot
        System.out.println(Arrays.deepToString(numbers));//[[22, 23, 44], [55, 66, 77]]
        System.out.println(numbers.length);//this show 2 as there is two array as element

        for (int i =0; i< numbers.length;i++){
           // System.out.println(Arrays.toString(numbers[i]));//n[22, 23, 44] [55, 66, 77] this will inner array as array

            for (int k =0; k < numbers[i].length;k++){
               // System.out.println(k);//0 1 2 0 1 2
                //System.out.println(numbers[i][k]);//22 23 44 55 66 77// this will print elements one by one
            }
        }
        System.out.println("==============");
        for (int[] nums : numbers){
            for (int num : nums){
                System.out.println(num);//22 23 44 55 66 77

            }
        }

    }
}
