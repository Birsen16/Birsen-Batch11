package String;

public class Concat {
    public static void main(String[] args) {
        String test = "Chicago";
        String number = "1";
        number += "2";
        number +=2;
        System.out.println(number);// 122 is the outcome.Because you are adding number to string. string + 2=string2

        //String has built methods/functions you can call by using your variable

       test=test.concat(" is the Best");//Chicago is the best
       test=test.concat(" in the summer.");// concat means plus so Chicago is the best in the summer.
       System.out.println(test);
       test+=test.concat("EVER");//Chicago is the Best in the summer.Chicago is the Best in the summer.EVER
       System.out.println(test);//Chicago is the Best in the summer.Chicago is the Best in the summer.EVER

       String str = "just do it ";
       System.out.println(str);

       String str1 = new String("whatever it takes!");
       System.out.println(str1);
       System.out.println(str+str1);




    }
}
