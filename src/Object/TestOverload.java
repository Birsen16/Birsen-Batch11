package Object;

public class TestOverload {
    public static void main(String[] args) {
        OverloadPractice obj = new OverloadPractice();
        obj.sum(5,6);
        Cat cat = new Cat();
        cat.run("up",3);


        MethodPractice obj2 = new MethodPractice();
        obj2.ageCalculator(1999, "Birsen");

    }
}
