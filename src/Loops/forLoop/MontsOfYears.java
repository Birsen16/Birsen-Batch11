package Loops.forLoop;

public class MontsOfYears {
    public static void main(String[] args) {
        /*
        peinr out months for the years between 2020 to 2023
        print out the manes of each month
         */
        for (int y =2020; y<=2023;y++){


            System.out.println(y+ "-->");
            for (int m = 1; m<=12;m++){
                System.out.print(m+ "- ");
                switch (m){
                    case 1:
                        System.out.println("January");
                        for (int days = 1;m <= 31;m++){
                            System.out.println(m + " ");
                        }
                        break;
                    case 2:
                        System.out.println("February");
                        break;
                    case 3:
                        System.out.println("March");
                        break;
                    case 4:
                        System.out.println("April");
                        break;
                    case 5:
                        System.out.println("May");
                        break;
                    case 6:
                        System.out.println("June");
                        break;
                    case 7:
                        System.out.println("July");
                        break;
                    case 8:
                        System.out.println("August");
                        break;
                    case 9:
                        System.out.println("September");
                        break;
                    case 10:
                        System.out.println("October");
                        break;
                    case 11:
                        System.out.println("November");
                        break;
                    case 12:
                        System.out.println("December");
                        break;

                }
            }
            System.out.println();
        }








    }
}
