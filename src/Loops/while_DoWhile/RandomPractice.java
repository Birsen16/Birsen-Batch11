package Loops.while_DoWhile;

import java.util.Random;

public class RandomPractice {
    public static void main(String[] args) {
        Random random = new Random(100);
        int number = random.nextInt();
        System.out.println(number);
        int number1 = random.nextInt(2);
        System.out.println(number1);
    }
}
