package Array;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String[] names =new String[6];
        System.out.println(Arrays.toString(names));
        names[5]="Alex";
        names[4]="Dinara";
        names[2]="Ana";
        names[0]="Mary";
        System.out.println(Arrays.toString(names));//before be assigning names you will see [null, null, null, null, null, null]
        System.out.println(names[3]);// we havent assinged any names to this so we will see null

        //show all names from array list one by one

        for (int i =0; i< names.length;i++){
            System.out.println(names[i]);//this shows one by one at the nextline. you will see
                                        // them as each name in different line not next to each other

            //length() and length are different. length() is method but length is for array, and you can call it variable, argument

        }
    }
}
