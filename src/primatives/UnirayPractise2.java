package primatives;

public class UnirayPractise2 {

    public static void main(String[] args) {

        int a = 7;
        int b = 4;
        int result = --a + --b + a++ * 2 - b++ * a--; // 6 + 3 + 6 X 2 -3X7 =0
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);

//        //TASK DONUT
//        each donut is 2$
//        12 donuts, next time you get $1 off(post- decreament)
//        or
//        buy 12 donuts you get $1 off now.(pre-decreament)


        //// Ask Dunkin Donut example just for the DD part. KK part is clear
        int eachDonut=2;
        int donutNumber =12;
        int total= donutNumber * eachDonut;


        System.out.println(total); //DD
        System.out.println(--total); //KK

        char ch ='a';
        System.out.println(--ch);
        System.out.println(ch);
        System.out.println(++ch);
        ch++;
        ++ch;
       System.out.println(ch);
       System.out.println(--ch);




    }
}
