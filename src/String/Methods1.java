package String;

public class Methods1 {
    public static void main(String[] args) {
        String device = "microphone";
        device.concat("is an input device"); //you dont see as microphone is an input device because you didnt store the concat value,
                                                // you did not create variable
        System.out.println(device);
        char ch = device.charAt(1);
        System.out.println(ch);
        device.length();// return as number
        int letterCount = device.length();//return a number --> 10
        System.out.println(letterCount);
        device += " is expensive"; // device was microphone then we added is expensive and reassigned, so it becomes
        System.out.println(device); // microphone is expensive as you see at sout as you can see

        device.concat(" device"); // above we assigned device as Microphine is expensive. Now, we are adding "device" via concat and
                                 //  it became microphone is expensive device but it is not saved so it is still as Microphone is expensive

        System.out.println(device.length());
        device = device.concat(" device");// here is 7 more because 6 letters and space
        System.out.println(device.length());

       // take last char from this last version of the string
        System.out.println( device.charAt(29)); //e
        String example = "The meanings of the designs on totem poles are as varied as the Indigenous " +
                "cultures that make them. They may celebrate cultural beliefs, " +
                "recount legends, depict family lineage, or //" +
                "simply be artistic. There are even used for public ridicule$";
        char lastChar =example.charAt(example.length()-1);
        System.out.println(lastChar);
        System.out.println("this is my example ===>" + example.indexOf('a', example.indexOf('a')+5));


        String example2 = "Thanksgiving is over. The price of the turkey will go down. So you can find more inexpensive purchases";
        int count = example2.length();
        char lastLetter = example2.charAt(count-1);
        System.out.println(count);
        System.out.println(lastLetter);

        String school = "Techtorial";
        //find the middle char from last string
        System.out.println(school.charAt(school.length()/2));
        System.out.println(example2.charAt((example2.length()-1)/2)); //space ciktigi icin terminal bos
        System.out.println(example.charAt((example.length()-1)/2)); //ikiye bolmek

//      System.out.println(school.charAt(15)); // StringIndexOutOfBoundsException, since there is no 15th index













    }
}
