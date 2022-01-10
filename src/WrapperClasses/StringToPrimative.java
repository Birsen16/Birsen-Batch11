package WrapperClasses;

import javax.sound.midi.Soundbank;

public class StringToPrimative {
    public static void main(String[] args) {
        String str = "12";
        System.out.println(str+10);//1210

        int number= Integer.parseInt(str);//22   //you can also put a number as "12" in the parenthesis.//behind the scean this is
        //unboxing is above
        Integer number1= Integer.parseInt(str);//Here we are doing wrapper class. We are taking
        // String and parsing it as a integer then storing it as a object.
        System.out.println(number1.equals("12"));//false because it is object
        System.out.println(number==12);//true

        byte bt = Byte.parseByte("127");
        //byte bt1 = Byte.parseByte("abc127");//NumberFormatException.

        boolean bl = Boolean.parseBoolean("true");//----> it does not matter if it is upper or lower or mix cases, it always true but
        // other than true everything is false including misspelled true. It will be false if you put a space in front of the true
        System.out.println("this is boolean  "+bl);//true

        float fl = Float.parseFloat("2.3");
        System.out.println(fl);

        float fl1 = Float.parseFloat("3.2f");
        System.out.println(fl1);

        //long lg = Long.parseLong("3544l");//NumberFormatException....we cant put l at the end of the long
        long lg1 = Long.parseLong("354483022087");
        //System.out.println(lg);

        //Integer nm = Integer.valueOf("12.34");//NumberFormatException  if this would Double.parseDouble,
        // it will work fine but because it is integer it is waiting whole number
        //System.out.println(nm);

        Integer number5 = null;
        int number8=number5; //NullPointerException

        String number7=""+number5;
        System.out.println(number7);
        // --->when object is null, it is fine but you can't assign null to primitive data type

    }

}
