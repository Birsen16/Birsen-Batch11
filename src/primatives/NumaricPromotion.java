package primatives;

public class NumaricPromotion {

    public static void main(String[] args) {

        byte b1 = 12;
        short sh1 = b1;
        short sh2 = 3;
        //byte b2 = sh2; compile time error, you can not shore larger date type into smaller data type
        //short result = b1 + sh2; compile time error,
        byte b2= 2;
        //byte result2 = b1 + b2; compile time error,
        int result2 = b1 +b2;// Numeric  promotion happens and java promotos smaller data types to int

        int i1= 4;
        double d1 = i1;
//         int i2 = d1; //compile time error
        float f1 = 1.2f;
        float f2 = 3.4f;
        double result3 = f1 + f2;
//        float f3 = result3; //compile time error.
        double d4 = 1.2;
        double result5 = f1 +d4; // Numeric  promotion happens and java promotes larger data type


        int number = 5;
        number = number +1;
        int number2 =10;


        }


    }

