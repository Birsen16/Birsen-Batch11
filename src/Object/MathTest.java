package Object;

import java.util.Locale;

public class MathTest {
    public static void main(String[] args) {
        MathPractice object = new MathPractice();
        object.sum();
        object.total(4,5);//4 + 5 = 9
        object.total(10,5); //10 + 5 = 15
        //System.out.println(object.sum()); you cant use void return type methods in the sout.

        int a = object.sum2(2,3);//when you have method with return type then you can save and play with it just like below.
        int x= a * a;
        System.out.println(x);//This is the only way you ccn show it as it is not created in the method.

        object.sum2(x,10);

        String str =object.speak();
        System.out.println(object.speak());
        System.out.println(str);
        //call numberToStrng method and do concatenation with your first and last name and Print it out

        String str1  = object.NumberToString(1);
        str1 = str1.concat(" Birsen Duman");
        System.out.println(str1);

        System.out.println(object.NumberToString(3.4).concat(" Birsen Duman"));
    }

}
