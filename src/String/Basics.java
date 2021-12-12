package String;

public class Basics {
    public static void main(String[] args) {
        String word = "Tech"; // Tech is string object. Creating varible is special to String.
        // you can create object in other classed ust like below with String.new. That's why string is a special class
        //String variable and new.String is stored in different places in memory.

        System.out.println(word);
        String word2 = new String("Tech");//object created 88string object*****This is string object.
        System.out.println(word2);

        String word3 = "Tech" + "Torial";
        System.out.println(word3);
        System.out.println(word + "JAVA");
        System.out.println(word);
        System.out.println(word + "77");
        System.out.println(word + (7 + 8));
        //  System.out.println(word + 7 - 8); this would not work b/c word + 7 = Tech7 so you can not subtrack 7 out of Tech7.
        //without parentheses, it will not work because you cant take number from string
        System.out.println(word + 7*8); //this works because precedence of operations
        System.out.println(7 + 8 +word +7 +8);//15Tech78
        word += "torial"; // word = word + torial
        System.out.println(word);
        word +=33;

       System.out.println(word);//torial33
        word +=33-11;
        System.out.println(word);


    }
}
