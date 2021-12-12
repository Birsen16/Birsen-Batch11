package primatives;

public class CompoundAssigments {

    public static void main(String[] args) {
//        //+=, -=,
        int num1=7;
        int num2= num1+7; //14
        num1+= num2; //21
        System.out.println(num1);

        num2-=8;
        System.out.println(num2); //num2 = num2-8------>14-8=6
//
        int num3 = num1 +num2;//21+6=27
        num2+= num3;//6+27 =33
        num1 +=num3;//21+27=48
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
//
        //task Currency exchange
//      double TurkishLira = 10.10;
//      double AmericanDollar =0.5;
//
//      double CurrencyExchange = AmericanDollar * TurkishLira;
//
//        System.out.println(CurrencyExchange);

        //Inches to meter Task
////
//        double GivenInchesValue = 1000;
//
//        double meter = GivenInchesValue * 0.0254;
//
//        System.out.println(GivenInchesValue + " inches is " + meter + " meters.");

        // days and years Task
//        int minutes = 3456789;
//        int years = (minutes / (60 * 24 * 365) );
//        int days = (minutes /60 /24 ) % 364;
//        System.out.println(minutes + " minutes is " + years + " years and " + days + " days");


            //=======simple task
        //ceate a variable. Declare varible to represent number of quarts needed for a painting job and assign appropriate
        // value for example: compute and display the number of galons and quarts needed for the job.
        //Example : A job needs 18 quarts requires 4 halon and 2 quarts.
//
//        final int QUARTS_TO_GALON = 4;
//
//        int quartsTotal = 18;
//        int gallonsNeeded;
//        int quartsNeeded;
//        gallonsNeeded = quartsTotal /QUARTS_TO_GALON;
//        quartsNeeded = quartsTotal % QUARTS_TO_GALON;
//        System.out.println("A job needs " + quartsTotal + " quarts requires "
//                            + gallonsNeeded + " gallons plus  " + quartsNeeded + " quarts.");

            //Write a program that declares named constants to represent the numbers of
            // inches, feet and yards in 1 mile.Also declare a variable to represent a number of miles and assigned a value to it.
            //Compute and display with explanatory text the value in inches, feet and yards.


        //*=
        num1 =4;
        num1 *=5;
        System.out.println(num1);//20
        // /=
        num1 /=4;
        System.out.println(num1);//5
        //%=
        num1 %=2;
        System.out.println(num1);//1

        //boolean can compile. going back to asscii table and combining the value
        char ch1 ='a';
        char ch2 ='m';
        char ch3 ='t';

        ch3 +='a';
        System.out.println("This is ch3 : " + ch3);
        ch2 *='3';
        System.out.println(ch2);

        ch1 -=9;
        System.out.println(ch1);

        int remainder = ch1 % 2;
        System.out.println(remainder);

//        ch1 %=2;
//        System.out.println(ch1);

        char random = '6';
        random %= 2;
        System.out.println(random);




    }
}
