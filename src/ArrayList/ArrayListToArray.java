package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Alan");
        names.add("Birsen");
        names.add("Said");
        names.add("Pelin");
        System.out.println(names);//this come as arraylist
        //converting this arraylist to array

        Object[] arrayNames=names.toArray();//here is how we can store arraylist items as array.

        System.out.println(Arrays.toString(arrayNames));//this comes as array.

        //when you convert from arraylist to array, you cant add any objects anymore.

    }
}
