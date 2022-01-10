package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortPracitice {
    public static void main(String[] args) {
        int[] zipCodes ={61212,91213,11214,71215};

        System.out.println(Arrays.toString(zipCodes));//[61212, 91213, 11214, 71215]
        Arrays.sort(zipCodes);//it will arrange the date in ascending order
        System.out.println(Arrays.toString(zipCodes));//[11214, 61212, 71215, 91213]

        String[] colors = {"violeT", "pink","Red", "white","black","red","brown","red"};
        System.out.println(Arrays.toString(colors));//[violeT, pink, Red, white, black, red, brown, red]
        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));//[Red, black, brown, pink, red, red, violeT, white]


    }
}
