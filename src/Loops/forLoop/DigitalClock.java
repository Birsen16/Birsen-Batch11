package Loops.forLoop;

public class DigitalClock {
    public static void main(String[] args) {
        //Print hours and minutes for 12 hours of a day
        //ex: 0:0 ...0:1...  0:59... 1:0.... 1:1... 1:2

        SAID:
        for (int h= 0; h < 12; h++){

           PELIN:
           for (int m =0; m <= 59; m++){


               // System.out.println(h +" : " + m);
                BIRSEN:
                for (int s = 0; s <= 59; s++){
                    if (s==10) {
                        break BIRSEN;//pleace a if condition and break with labek and it will break the lable otherwise it will break just the closest loop.
                    }
                    System.out.println(h +" : " + m + " : " +s);
                }

            }

        }









    }
}
