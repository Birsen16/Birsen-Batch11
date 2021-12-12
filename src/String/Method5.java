package String;

public class Method5 {
    public static void main(String[] args) {

      String word = "Sunday";

      //replace();
        String updatedWord =word.replace('a', '$');
        System.out.println(updatedWord);

        String updatedWord1 = word.replace("Sun", "Satur");
        System.out.println(updatedWord1);
        System.out.println(word.replace("day", "*"));
        System.out.println(word.replace("sun", "Satur"));//noting will change because sun is lower case

        String code = "Java";
        System.out.println(code.replace('a' , '$')); // it will replace all the a's in java with $ so it will make it J$v$






    }
}
