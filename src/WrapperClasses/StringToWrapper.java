package WrapperClasses;

public class StringToWrapper {
    public static void main(String[] args) {
        String color = "20";
        Integer number=Integer.valueOf(color);
        System.out.println(number+20);//40   ---> This integer object that's why we can use it as a integer number

       // String str = String.valueOf(color);//NumberFormatException if color is "red" above the number example
       // System.out.println(str);

        Boolean bl=Boolean.valueOf("true");
        System.out.println(bl);//true
        Boolean bl1= Boolean.valueOf("example");
        System.out.println(bl1);//false--->

        int i = Integer.valueOf("77");
        System.out.println(i);

      //Character ch=Character.valueOf("c");//compile time error   we cant do char for wrapper classes

    }
}
