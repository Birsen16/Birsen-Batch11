package Array;

import java.sql.Array;
import java.util.Scanner;

public class HomeworkArrayTask {
    public static boolean threeAmigos(int[] array) {
        boolean result = false;
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] % 2 == 0 && array[i + 1] % 2 == 0 && array[i + 2] % 2 == 0) ||
                    (array[i] % 2 != 0 && array[i + 1] % 2 != 0 && array[i + 2] % 2 != 0)) {
                return result = true;
            }
        }

        return result;
    }

    /**
     * Write a method that takes an array of ints and returns a boolean.
     * Return true if that array contains two numbers anywhere in the array
     * whose sum is 100
     *
     * @param nums
     * @return boolean
     */
    public static boolean make100With2(int[] nums) {
        //consider each element except last element
        for (int i = 0; i < nums.length - 1; i++) {
            // start from the i'th element until the last element
            for (int j = i + 1; j < nums.length; j++) {
                // if the desired sum is found, print it
                if (nums[i] + nums[j] == 100) {

                    return true;
                }
            }

        }
        return false;


    }


    /**
     * Write a method switchPairs that switches the order of values in an Array of Strings in a pairwise fashion.
     * Your method should switch the order of the first two values,
     * then switch the order of the next two, switch the order of the next two, and so on.
     * <p>
     * {"four", "score", "and", "seven", "years", "ago"}-> return {"score", "four", "seven", "and", "ago", "years"}
     * {"to", "be", "or", "not", "to", "be", "hamlet"} -> return {"be", "to", "not", "or", "be", "to", "hamlet"}
     * <p>
     * Method that is using String[]
     *
     * @param Array
     * @return switched pairs array
     */
    public String[] switchPairs(String[] list) {
        String[] str = new String[list.length];
        if (list.length <= 1) {
            return list;
        }
        for (int i = 0; i < list.length - 1; i = i + 2) {
            if (list.length % 2 != 0) {
                str[i] = list[i + 1];
                str[i + 1] = list[i];
                str[str.length - 1] = list[list.length - 1];
            } else {
                str[i] = list[i + 1];
                str[i + 1] = list[i];
            }

        }
        return str;
    }



//    /**
//     *
//     * @param array of book pages
//     * @return page that is out of order; if all pages in the order return -1;
//     *
//     * For example you given an array
//     *  int[]pages={20,100,55,78,44,90}; -> method will return 55
//     *	int[]pages2={20,21,22,78,44,90};-> method will return 44
//     *  int[]pages3={20,21,22,78,84,90};-> method will return -1
//     */

        public int outOfOrder(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1] < arr[i]) {
                    return arr[i + 1];
                }
            }
            return -1;

//    /**
//     *
//     * Write a method that takes an array of integers and returns a boolean.
//     * Return true if the array contains 1 and 2 later somewhere in the array,
//     * and 1 has to come before 2.
//     *
//     * contains12([1, 3, 2]) -> true
//     * contains12([3, 1, 2]) -> true
//     * contains12([3, 1, 4, 5, 2]) -> true
//     * contains12([3, 2, 4, 5, 1]) -> false
//     *
//     * @param nums
//     * @return boolean
//     */
//
//    public boolean contains12(int[] nums) {
//        // TODO
//        return false;
//    }
//
//    /**
//     * Write a method that will accept array of integers as parameter
//     * and will return one long number of combined numbers.
//     * If the number is negative accept it as positive
//     *
//     * For example:
//     * {2,66,3,90,1,-10} -> return int 266390110
//     * {0,34,5,3,8} -> return int 34538
//     *
//     * @param array of numbers
//     * @return combined numbers of array
//     */
//    public long combineNumbers(int[] numbers) {
//        //TODO
//        return -1;
//    }
//
//    /**
//     * Write a method that will accept one array as parameter and will remove duplicates
//     * and return will have unique numbers inside
//     *
//     * for example:
//     * {3,6,8,3,2,7,9,9} -> return {3,6,8,2,7,9}
//     * {-1,5,8,-1,-55,55,0} -> return {-1,5,8,-55,55,0}
//     *
//     * @param array of numbers
//     * @return array of unique numbers
//     */
//            public int[] removeDuplicates ( int[] nums){
//                //TODO
//                return -1;
//            }
//
//
//
//
   }
}

