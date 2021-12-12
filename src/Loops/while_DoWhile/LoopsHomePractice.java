package Loops.while_DoWhile;public class LoopsHomePractice {
    public static void main(String[] args) {

        int number =0;
        while (number<10){
            System.out.println("hi");
            number++;
        }

       // System.out.println("The Sum of digits in the number 125 is " + digitSum(125));
        //if you have 20 days to retirement, count each day backwords until your retirement day arrives.
        int dayOfWork =20;
        int halfWay = dayOfWork /2;
        while (dayOfWork >=1){
            System.out.println("Work day to retire = " + dayOfWork);
            dayOfWork--;
            if (dayOfWork==0){
                System.out.println("Enjoy your party");
            }else if (halfWay==0){
                System.out.println("You are halfway through. Keep up!");
            }
        }

//        int i = 1;
//        while (true){
//            if (i == 10){
//                break;
//            }
//            System.out.println("i = " + i);
//            i++;
//        }

//        int count =1;
//        while (count<= 6){
//            System.out.println("Count value is = " + count);
//            count++;
//        }
//            int number =4;
//            int finishedNumber =20;
//        int number = 0;
//        while (number <=20){
//            number++;
//            if (number <= 5){
//                System.out.println("skipping number " + number);
//                continue;
//            }
//            System.out.println("Number is = " + number);
//            if (number>= 10){
//                System.out.println("Breaking at " + number);
//                break;
//            }
//    }
    }
//    public static int digitSum(int number){
//        if (number<10){
//            return -1;
//        }int sum =0;
//        while (number >0){
//            //extract least significant digit
//            int digit = number % 10;
//            sum+= digit;
//
//            //drop the least significant digit
//            number /= 10; //this means number = number / 10;
//        }
//        return sum;
    }



