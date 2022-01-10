package Array;

public class ForEachPractice1 {
    public static void main(String[] args) {
        double[] checks = {2540,10000,100000,65.50,1.99};
            //by using for each loop find and print total amount of checks
        double total=0;
        for (double check : checks){
            total+=check;
            //you can also say
        }
        System.out.println(total);
    }
}
