package Array;

public class ForEachPractice2 {
    public static void main(String[] args) {
        char[] chs = {'A','4','n','&','z','*','3','u'};
        //by using each loop print out letters only
        System.out.println("=================");
        for (char letters : chs){
            if (letters>='a' && letters<='z' || letters<='A' && letters<='Z'){
                System.out.println(letters);
            }
        }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        for (char letter : chs){
            if (Character.isAlphabetic(letter)){
                System.out.println("This is letters "+letter);
            }else if (Character.isDigit(letter)){
                System.out.println("This is numbers "+letter);
            }else {
                System.out.println("This is some symbol " + letter);
            }

        }

    }
}
