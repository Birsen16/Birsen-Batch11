package ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        int[] numbers = {3,4,5,6};
        List<int[]> listNumber=Arrays.asList(numbers);

        Integer[]  numbers1 = {3,4,5,6};
        List<Number> listNumber1=Arrays.asList(numbers1);// List<Integer> listNumber1=Arrays.asList(numbers1); boylede yazabilirdin

        System.out.println(listNumber1);
      //  System.out.println(listNumber1.add(7));//pportedOperationException   you can not add another item
        // to array list after conversation

        for (int[] i : listNumber){
            System.out.println("+++++"+Arrays.toString(i));
        }
        Integer[]  numbers2 = {3,4,5,6};
        List<Object> listNumber2=Arrays.asList(numbers1);
        System.out.println(listNumber2);
    }
}
