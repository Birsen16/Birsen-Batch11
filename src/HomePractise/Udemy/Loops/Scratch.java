package HomePractise.Udemy.Loops;

public class Scratch {
    public static void main(String[] args) {
        int number=5005;
        int last=number%10;
        int first;
        while (number>=10){
            number/=10;

        }
        System.out.println("those are digits ====>"+ (last+number));
    }
}
