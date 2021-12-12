package String;

public class Methods2 {
    public static void main(String[] args) {
        String flower = "Rose";
        int indexOfR = flower.indexOf('R');
        int indexOfR1 = flower.indexOf("R");
        System.out.println("first implementation " + indexOfR);
        System.out.println("second implementation " + indexOfR1);

        System.out.println(flower.indexOf("o"));//1
        System.out.println(flower.indexOf("os"));//java will first matching char sequence which is 1
        System.out.println(flower.indexOf("o,s"));//-1  coma is just another char so it says -1 which means it doesnt have any maching char or char sequence
        System.out.println(flower.indexOf("r"));//-1
        System.out.println(flower.indexOf("Rose"));//0 because first matching index sequence is R
        System.out.println(flower.indexOf("rose")); //o
        System.out.println(flower.indexOf("Roses")); //-1


        String object = "umbrellam";
        System.out.println(object.indexOf("========>" + 'e',6));//return tyoe is -1 because there is no after 6
                                            // this means find e after index numbrt 6
        System.out.println(object.indexOf('l'));//5
        System.out.println(object.indexOf("l" ,6));
        System.out.println(object.indexOf('m', object.indexOf('m')+1));//8  this +1 is means that find m and add one more
        System.out.println(object.length()); // 9
        System.out.println(object.indexOf('r'));


        String sentence = "I love lilies";
        System.out.println(sentence.indexOf('l' , sentence.indexOf('i')));

        //toUppercase()--> makes you  string as UpperCase
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence);

        //toLowerCase() --> makes string as lowercase
        System.out.println(sentence.toLowerCase());
        //think about making single letter uppercase from a string
        String str = "Just do it";
        //indexOf();--->returning number
        //charAt();--->returning char
        // you can also make everything uppercase and take D. However, we're trying to take d and make it uppercase.
        char letter = str.charAt(str.indexOf("d"));// here you are takeing letter d
        String str2 = ""; // here you are making char to string
        str2 += letter; //here you are making char to string
        System.out.println(str2.toUpperCase());


        String input = "Just do it";
        char letter2 = input.charAt(input.indexOf("d"));
        String input2 = "";
        input2 += letter2;
        System.out.println(input2.toUpperCase());
//
      //  System.out.println(str.substring(0,1).toUpperCase() + str.substring(1)); //this is making first latter uppercase
                            //think about first letter of just do it is lowercase and you making just letter uppercase.






    }
}
