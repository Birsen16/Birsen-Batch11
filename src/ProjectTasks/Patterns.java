package ProjectTasks;

public class Patterns {
    public static void main(String[] args) {
        int number = 6;
        for (int z = 1; z <= number; z++) {// bunuda bir alttaki linei 5 kere yazmak icin kullaniyoruz yani how many line
            for (int i = 1; i <= number; i++) {//bu yan yana 123456 yazar bir sira

                System.out.print(i);
            }
            System.out.println();// buda 123456 yazdiktan sonra sonraki line getiriyor
        }

        for (int i = 1; i <= number; i++) {
            for (int z = 1; z <= i; z++) {
                System.out.print(i);
            }
            System.out.println();
        }

        for (char z = 'a'; z <= 'e'; z++) {
            for (char ch = z; ch >= 'a'; ch--) {
                System.out.print(ch);

            }
            System.out.println();
        }

        int num = 5;
        for (int y = 1; y <= num; y++) {
            for (int i = 1; i <= y; i++) {

                System.out.print("*");
            }
            System.out.println();
        }
        int value = 5;
        for (int z =1;z <=num;z++) {
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print("$");
                }
            }
            System.out.println();
        }

        System.out.println("=====================");

                int row=3;
                int value1=1;

            for (int i= 1; i <= row;i++){


            for (int j =1; j<=i;j++){

                System.out.print(value1+"");
                value1++;
            }
            System.out.println();
        }

    }
}