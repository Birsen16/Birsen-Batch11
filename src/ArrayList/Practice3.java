package ArrayList;

import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {


        /*===TASK===:
-Create an ArrayList that will store 5 fruit names
-Print out stored values by using for Loop
*/

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("peach");
        fruits.add("orange");
        fruits.add("muz");
        fruits.add("blueberry");
        for (int i = 0; i < fruits.size(); i++) {

            System.out.println(fruits.get(i));
        }
        //create a method to take arraylist as a paramater of fruits and this method \
        // will print out fruits if it has 5 or more letters


    }
    public static void printFruits (ArrayList<String> fruits){
        for (int i=0;i< fruits.size();i++){
            if(fruits.size()>=5){
                System.out.println(fruits.get(i));
            }
        }
        System.out.println("===================");
        for (String fruit: fruits){
            if(fruit.length()<=4){
                fruits.remove(fruit);
            }
            System.out.println(fruit);

        }
    }


}
