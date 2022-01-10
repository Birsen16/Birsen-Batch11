package Array;

import java.util.Arrays;

public class ForEachPractice3 {
    public static void main(String[] args) {
        String names[] = {"John", "Ryan", "David", "Nina", "Brian"};
        //create e-mail address for each of the manes in the array
        //john@gmail.com, brian@gmail.com
        //store those e-mails store in a array,
        //if it is gmail email store it in gmail array
        ///if it is yahoo email, store yahoo email
        String gMails[] = new String[names.length];
        String yahooMails[] = new String[names.length];

        for (String name : names) {
            // System.out.println(name + "@gmail.com");
            // System.out.println(name.toUpperCase().concat("@yahoo.com"));

            System.out.println("============================");
            for (int i = 0; i < names.length; i++) {

                gMails[i] = names[i] + "@gmail.com";
                yahooMails[i] = names[i].toUpperCase().concat("@yahoo.com");

            }
        }
        System.out.println(Arrays.toString(gMails));
        System.out.println(Arrays.toString(yahooMails));

//        System.out.println(name.toUpperCase().concat("@gmail.com"));//if you want them separate
//        // from above list, you need to create separate loop


        }

        }


