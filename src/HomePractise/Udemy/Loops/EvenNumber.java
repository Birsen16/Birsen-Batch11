package HomePractise.Udemy.Loops;

public class EvenNumber {
    public static void main(String[] args) {
//        int number = 4;
//        int end = 20;
//        int sum=0;
//        int count=0;
//        while (number<= end){
//            number++;
//            if (isEvenNumber(number)) {
//               count++;
//            }
//                System.out.println("Even number is " + sum);
//
//
//        }

        //UPDATED WITH SUM AND BREAK
        //

        int number = 4;
        int end = 20;
        int sum=0;
        int evenNumbersFound=0; //count
        while (number<= end){
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
                System.out.println("Even number is " + evenNumbersFound);
                evenNumbersFound++;//ASK THIS PART

                if (evenNumbersFound > 5){
                    break;
                }
        }
        System.out.println("Total even numbers found " + evenNumbersFound);
    }
    public static boolean isEvenNumber(int number){
        return(number%2)==0;//short cut
//       if ((number%2)==0){
//           return true;
//
//       }else{
//           return false;
//       }



    }
}
