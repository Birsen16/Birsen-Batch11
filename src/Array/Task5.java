package Array;

public class Task5 {
    public static void main(String[] args) {
        //find the missing number from array sequence
        int sum1=0;
        int sum2=0;
        int[] numbers={4,5,7,8,9}; //finding actual sum
        for (int a : numbers){
            sum1+=a;
        }

        for (int i =4; i<=9;i++){
            sum2+=i;
        }

        System.out.println("Missing number is " + (sum2- sum1));
    }
}
