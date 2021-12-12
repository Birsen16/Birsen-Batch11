package String;

public class MethodsTask3 {
    public static void main(String[] args) {

        /*
        String str = " Zero to Ten  ";
- change 'Ten' with/to 'HERO'
- make all of the string uppercase
- remove all spaces
- get only first three letter
- print the length of those three letters as ==> "The length of final verison is: +  <length>"
Collapse

         */

        String str = "  Zero to Ten  ";
        String name = str.replace("Ten", "HERO");
        System.out.println(name);
        String upperCase = str.toUpperCase();
        System.out.println(upperCase);
        String removeSpace = str.trim();
        System.out.println(removeSpace);
        String allSpaceRemoved = str.replace(" " , "");
        System.out.println(allSpaceRemoved);
        String threeLetters = removeSpace.substring(0,3);
        System.out.println(threeLetters);
        int x = str.length();
        System.out.println("The length of the final version is ; " + x);

        //method chaining ===> you can use method ofter method

        str = " Zero to Ten  ";
       int a = str.replace("Ten", "HERO").toUpperCase().trim().replace(" ", "").substring(0,3).length();
        //you can so method chaining just for String type.if you get length(), equal() and so because length return type
        // is int and equal return type is boolean. you can do one of those as last part of the chaining.

        System.out.println(a);




    }
}
