package primatives;

public class ComparisonPractice {

    public static void main(String[] args) {

        float fl =4;//if I chance it to 4.00 it will be still true
        int i =4;
        System.out.println(fl == i);//true
        boolean comp1 = fl ==i;
        System.out.println(comp1);//true
        System.out.println(18 == 18);
        System.out.println('a' == 'a');//true
        System.out.println("test" =="tesT");//false

        int  num1 =55;
        int num2 = 66;

        boolean comp2 = num1 != num2;
        System.out.println(comp2);//true
        System.out.println(18!=18);//false

        // LESS THAN

        System.out.println(num1 < num2); //true
        System.out.println(55 > num1); //false 55<55 ? no
        System.out.println(num2 < num1); //false
        System.out.println('c' < 'c');//false
        System.out.println('c'< 'd');// true
        //Uninary operators are also works with char
        char ch = 'a';
        System.out.println(ch);
        System.out.println(++ch);
        ch++;
        --ch;
        System.out.println(ch);
        System.out.println(--ch);

        //  GREATER THAN

        System.out.println(num1 > num2);// false
        System.out.println(num2 >109); //false
        System.out.println(num2++ >66);// false
        System.out.println(num2 > 66); //true  ****paranezin icinde bile olsa value artiyor bir sonraki icin num++ 67 oldu

        //LESS THAN OR EQUALS
        num1 =2;
        num2 =3;

        System.out.println(num1 < num2);// true
        System.out.println(num1<= num2); //true

        System.out.println(3 <= num2); //true
        num1++; // num1 = 3
        System.out.println(num1 <= num2);//true
        System.out.println(++num1 <= ++num2);
//        //GREATER THAN OR EQUALS
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num2 >= num1);//true
        System.out.println(7 >= ++num1 +num2);//false  4(behind the scene it is 5) +4=8
        num1++;
        System.out.println(num1);

        char ch3 = 'P';//this is 80 in the asscii table
        char ch4 = 80; //take the value from asscii table check at home their values.
//        // if i switch 80 to int, it will turn out to be false
             System.out.println(ch3 == ch4);//true
//
////        double degreeInFahrneint = 212.0;
////        double temprature = (degreeInFahrneint -32) / 1.8;
////        System.out.println(degreeInFahrneint + " degree Fahrenheit is "
////                + temprature + " degree in Celsius");
////
////
////        double degreeInFahrneint2 = -40;
////        double temprature2 = (degreeInFahrneint2 -32) / 1.8;
////        System.out.println(degreeInFahrneint2 + " degree Fahrenheit is "
////                + temprature2 + " degree in Celsius");
//
//









    }
}
