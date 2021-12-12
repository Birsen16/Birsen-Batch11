package primatives;

public class UnirayPractice1 {

    public static void main(String[] args) {

        int studentNumber = 25;
        System.out.println(studentNumber);

        int num1 = studentNumber++;
        System.out.println(num1);//shows 25 but it is 26.
        System.out.println(studentNumber);// shows 26 and it is still 26.

        studentNumber++;//it is now 27
        System.out.println(studentNumber);// it shows 27


        int num2= ++studentNumber;
        System.out.println(num2); //28

        int count = 5;
        System.out.println(count++); // 5----shows 5 but increase it to 6
        System.out.println(++count);// 7


        //========================

        int number = 8;
        System.out.println(number--); //shows 8 and it is 7
        System.out.println(number--); // shows 7 it is 6
        System.out.println(--number); //shows 5 it is 5


         number++; //6*** number was 5 at above line
        System.out.println(number++ + number++); // shows 13 number is 8.

        System.out.println(number);//8

        int result = --number + --number + 2 - number++ * 2;
        System.out.println(result); // 7 + 6 + 2 -6 * 2=3
        System.out.println(number); // 7

        //===============================
        int a = ++number; // number was 7 and it became 8.

        System.out.println(a);// 8
        System.out.println(number); // 8


    }
}
