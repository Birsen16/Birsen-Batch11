package WrapperClasses;

public class Practice1 {
    public static void main(String[] args) {

        //for byte and short, we need to create variable first then we create wrapper class.
        byte b=2;
        Byte bt =new Byte(b);
        System.out.println(bt);

       // Student st = new Student(); //Why it doesnt see st object here

        short s =7;
        Short sh=new Short(s);//2
        System.out.println(sh);//7


        char c = 'a';
        Character ch = new Character(c);
        System.out.println(ch);

        Integer  it = new Integer(4);
        Float fl=new Float(3.4);
        Double db =new Double(4.5);
        Long lg =new Long(1234);
        Boolean bl = new Boolean(true);
        System.out.println(bl);//true


        int i = new Integer(22);//UNBOXING--> when Java converts Wrapper class to primative date.
        Integer num= 3;               //AUTOBOXING--->Here we have a value and we are making it object and assigning at the same time.
        //we could also do as Integer num= i;
        //Autoboxitng is when Java converts primitive date to Wrapper class object.
        System.out.println(num);
        System.out.println(num.toString().concat("hello").length());//now it is making it string and containing it with something else;


        //array
        int[] numbers = {i,num};
        System.out.println(num*75);//225

    }

}
