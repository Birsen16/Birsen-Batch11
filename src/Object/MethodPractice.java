package Object;

import java.util.Scanner;

public class MethodPractice {
    /*
    `create a method that will calculate age of a person,
    `does not return age,
    `will take birth year as parameter,
    `user provides the birth year
    `will print age of person

     */
    public void ageCalculator(int birthYear){
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Pleaae enter your birthyear");
//        birthYear=scanner.nextInt();
        int age =2021-birthYear;
        System.out.println("Your age is " + age);
    }
    //Overload AgeCalculator method by passing name of the person as parameter and
    //return age.
    public int  ageCalculator(int birthYear, String name) {

        int age = 2021 - birthYear;
        System.out.println(name + " Your age is " + age);
        System.out.println("Overloaded age calculator method ");
        return age;
    }
    //=============================
    //create a method that will take int array as a parameter
    //it will calculate sum of the  numbers in the array
    //it will return the sum as double
    public double sumOfArrayElements(int[] ids){
        double sum=0;
        for (int id :ids){
            sum+=id;
        }
    return sum;

    }

        public static void main(String[] args) {
        MethodPractice object2 = new MethodPractice();
        object2.ageCalculator(1999);

        int[] numbers={1,2,3,4,5,6,7};
        double v=object2.sumOfArrayElements(numbers);
        System.out.println(object2.sumOfArrayElements(numbers));

        double w = object2.sumOfArrayElements(new int[] {1,2,3,4,5,});
            System.out.println(w);
    }
}
