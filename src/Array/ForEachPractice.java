package Array;

public class ForEachPractice {
    public static void main(String[] args) {
        int[] numbers ={45,23,5,7,21,66,200};
        //print out each element form   this array by asking each loop
        for (int i=0;i<=numbers.length-1;i++){
            System.out.println(numbers[i]);
        }
        System.out.println("=============");
        for (int num: numbers){
            System.out.println(num);
        }
        System.out.println("==============");
        String flowers[]={"rose","lily","orchid","violet","tulip"};
        for (String flower: flowers){
           // System.out.println(flowers[0]);//this will print rose for 5 times
           // System.out.println(flower);//this prints individual element one by one.bur from start to end without any exception


        }

    }
}
