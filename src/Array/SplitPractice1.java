package Array;

import java.util.Arrays;

public class SplitPractice1 {
    public static void main(String[] args) {
        String str = "Stay safe and healthy";
        str.split(" ");// bunu direct asagidaki line gibi yazabilirsin
        String words[]=str.split(" ");//return type is string array
        System.out.println(Arrays.toString(words));//[Stay, safe, and, healthy]
        //print every single word as : .....***

        for (String word: words){
            System.out.println(word+ "***");// you can also use concat method as sout(word.concat("***");
        }
        String  words2[] = str.split("a");
        System.out.println(Arrays.toString(words2));
        System.out.println(words2.length);
        //12/17/2021  split with months, days and years
        //12.17.2021
        //12_17_2021

            String date= "12_17_2021";
            String[] splitDate = date.split("_");
            System.out.println(Arrays.toString(splitDate));
            //12.17.2021
             date= "12.17.2021";
             String[] splitDate2= date.split("\\.");//if you want to use dot for spliting put two slash in front of it
             System.out.println("This is for .(dot) example "  + Arrays.toString(splitDate2));
            //String[] splitDate2= date.split(".");
            //System.out.println(Arrays.toString(splitDate2));//[]

             System.out.println("\"something\"");//this is how you print a word in double quotation marks

        // [12, 17, 2021]
        for (String element: splitDate2){
            System.out.println("\""+element+"\""); //this is how you can print every array element in a double quotation mark
        }

    }

}
