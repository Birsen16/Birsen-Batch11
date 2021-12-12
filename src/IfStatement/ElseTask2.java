package IfStatement;

import java.util.Scanner;

public class ElseTask2 {
    public static void main(String[] args) {
        //find out if your zip code is even or odd number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your zip code");
        int zip = scanner.nextInt();
        if (zip % 2 == 0){
            System.out.println("Your zip code is even number");
        }else {
            System.out.println("Your zip code is odd number");
        }

    }
}
