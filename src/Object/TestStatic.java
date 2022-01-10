package Object;

public class TestStatic {
    public static void main(String[] args) {
        //you can call static method from another class by using name of the class,
        // no need to create an object
        //just like below
        StaticPetPractice.eat();
        StaticPetPractice pet = new StaticPetPractice();
        pet.eat();
        pet.play();
        StaticPetPractice.eat();
        System.out.println(pet.food);

    }

}
