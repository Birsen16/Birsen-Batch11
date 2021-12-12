package String;

public class Methods6 {
    public static void main(String[] args) {


        String name = "    Techtorial Academy is located in Des Plains     ";

        //trim(); ---> it will remove spaces before and after the string but soaces in the middle stays.

        String updatedName = name.trim(); //hover over the trim and hold the command key, it will show you return type.
        System.out.println(updatedName);
        System.out.println(name);

        //subString()

        String part1 = updatedName.substring(4);
        System.out.println(part1);

        String part2 =updatedName.substring(4,12);// the char at the first index is included
                                                 // but at the second index is not included in the substring
        System.out.println(part2);



    }
}
