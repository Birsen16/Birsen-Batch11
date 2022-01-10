package Array;

public class Task4 {
    public static void main(String[] args) {

        //find the sum of numbers which is less than 10
        int[] arr = {4,24,10,100,5,78,11,25,55};
        int sum=0;
        for (int i = 0; i<arr.length;i++){
            if (arr[i] <10){
                sum+=arr[i];
            }
        }
        System.out.println(sum);



    }
}
