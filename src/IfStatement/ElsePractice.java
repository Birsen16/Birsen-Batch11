package IfStatement;

public class ElsePractice {
    public static void main(String[] args) {
        boolean myLicense = true;
        if (myLicense == true){
            System.out.println("You can enjoy your driving");
        }else {
            System.out.println("DMV is next door, please visit");
        }
        int number = 1234;
        if (number < 24){
            System.out.println("yaaaayyy");
        }else {
            System.out.println("this is print out from else block");
        }
        if ('A' == 'A')
            System.out.println("************");
            //System.out.println("XXXXXXXXXX"); //it works without curly brackets only if there is one line but
            // if you add second line else shows compile error
        else
            System.out.println("!!!!!!!!!!!!!");




    }
}
