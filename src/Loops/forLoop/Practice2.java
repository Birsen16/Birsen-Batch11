package Loops.forLoop;

public class Practice2 {
    public static void main(String[] args) {
        //print out numbers between 0 to 5 decreasing by using for loop
        for (int i= 5; i >= 0;  i--){
            System.out.println(i);
        }
        //find the total of numbers between 1 to 5 for loop
        int sum =0;
        for (int num = 1; num <5; num++){
            sum +=num;

        }
        System.out.println(sum);
    }
}
