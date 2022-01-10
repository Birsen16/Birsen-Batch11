package Map;

import primatives.CastingPractise;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    //create a method that will take a map<Integer, String > as a parameter
    //and, it will print out keys from that map one by one

    public static void keysOneByOne(HashMap<Integer, String> map){//you can make iy map, hashMap, treelist
        for (Integer key :map.keySet()){
            System.out.println(key);
        }

    }

    public static void main(String[] args) {

    }
}
