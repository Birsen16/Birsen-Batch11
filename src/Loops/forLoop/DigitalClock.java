package Loops.forLoop;

public class DigitalClock {
    public static void main(String[] args) {
        //Print hours and minutes for 12 hours of a day
        //ex: 0:0 ...0:1...  0:59... 1:0.... 1:1... 1:2


        for (int h= 0; h < 12; h++){

            for (int m =0; m <= 59; m++){
               // System.out.println(h +" : " + m);
                for (int s = 0; s <= 59; s++){
                    System.out.println(h +" : " + m + " : " +s);
                }

            }

        }









    }
}
