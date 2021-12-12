package primatives;

public class ArithmaticOperations {

    public static void main(String[] args) {

        //Addition
        int num1 = 3;
        int num2 = 4;
        System.out.println(" Total is : " + (num1 + num2));
         int sum = num1 + num2; //7
        System.out.println(sum);

        //Subtraction
        int difference;
        difference = 10-num2; //10-4=6
        System.out.println("The difference is = " + difference);

        // Multiplication
        double product = difference * num2;//6*4=24
        System.out.println(product);

        // Division
        double division = product / 3; //24/3=8
        System.out.println(division);

        product = product * division;//24*8=192

        System.out.println(product); //192

        int division2 = 5/2;
        System.out.println(division2); //2

        double division3 = 5/2d;
        System.out.println(division3); //2.5

        float division4 = 5/2f;
        System.out.println(division4); // 2.5

        float division5= num2/num1;//1.0
        System.out.println(division5);

        //Remainder %(Modulus) Left over

        int a = 11;
        int b = 5;
        int remainder = a % b;
        System.out.println(" The left of 11/5 is = " + remainder);
//
//        int x = 13;
//        int y = 5;
//        int remainder2 = x % y;
//        System.out.println(remainder2);//3
//        System.out.println(25%21); // 4
//        System.out.println(25 % x); //12

//
//       String s = "102";
//        System.out.println(Integer.parseInt(s)+ 4); //106 but if there would not have any parsing and just s + 4 then it is 1024
//        int n = 5;
//        System.out.println(Integer.toString(n) +1); // 51
////
//        String s ="age:47";   // if you want to convert string to integer,
//        s= s.replaceAll("\\D+","");
//        int M = Integer.parseInt(s);
//        System.out.println(M + 2);
//
//      int type = (int) 4.5;
//        System.out.println(type);//4-java does not know round







    }
}
