package Set;

import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        TreeSet<Integer> zipCodes = new TreeSet<>();
        zipCodes.add(44);
        zipCodes.add(11);
        zipCodes.add(22);
        zipCodes.add(55);
        //first
        System.out.println(zipCodes.first());
        //last
        System.out.println(zipCodes.last());
        //pollfirst
        System.out.println(zipCodes.pollFirst());
        System.out.println(zipCodes);

        zipCodes.add(77);

        int i =zipCodes.pollLast();

        //pollLast


    }
}
