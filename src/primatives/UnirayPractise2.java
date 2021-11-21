package primatives;

public class UnirayPractise2 {

    public static void main(String[] args) {

        int a = 7;
        int b = 4;
        int result = --a + --b + a++ * 2 - b++ * a--; // 6 + 3 + 6 X 2 -3X7 =0
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);

        int donutCost=2;
        int donutCount =12;
        int totalCost = donutCost * donutCount;
        System.out.println(totalCost); //DD
        System.out.println(--totalCost); //CC



    }
}
