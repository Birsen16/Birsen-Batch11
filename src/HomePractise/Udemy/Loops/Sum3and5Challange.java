package HomePractise.Udemy.Loops;

public class Sum3and5Challange {
    public static void main(String[] args) {
        int count =0;
        int sum = 0;
        for (int i = 1; i <= 1000;i++){
            if (i%3==0 && i%5==0){
                count++;
                sum+=i;
                System.out.println(i + " can be divisible with 5 and 3");
                if (count==5){
                    break;
                }
            }
        }
        System.out.println("Total of  numbers that can divisible by 3 and are " + sum);


    }
}
