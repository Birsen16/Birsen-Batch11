package Object;

import java.util.Scanner;

public class TestAnimal {
    public static void main(String[] args) {

        String str = new String("Test");
        Scanner scanner= new Scanner(System.in);

        Animal cat = new Animal(); //creating a object
        System.out.println(cat.name);//null
        cat.name="Leo";

        System.out.println(cat.name);//Leo
        System.out.println(cat.age);//you will see this as default which is zero as this is not assigned yet
        System.out.println(cat.color);// you will see this as default null as we have not assigned any color yet.

        cat.age= 9;
        cat.color= "orange";
        System.out.println(cat.age);//9
        System.out.println(cat.color);//orange

        //crate a dog animal then try to use instance variables with your new object
        System.out.println("========================");

        Animal dog = new Animal();
        dog.color="brown";
        dog.age=12;
        dog.name="Himbil";
        dog.gender= 'F';

        System.out.println(dog.color);
        System.out.println(dog.name);
        System.out.println(dog.age);
        System.out.println(dog.gender);
        dog.sleep();//Himbil is sleeping
        cat.eat();//Leo is sleeping
        cat.run();//90

        System.out.println(cat.energy);//90
        System.out.println(dog.energy);//100
        cat.run();//Leo has % 80 energy
        cat.run();//Leo has % 70 energy
        cat.sleep();// Leo has %100 energy
        System.out.println(cat.energy);//showing how much energy cat has.
        dog.info();

    }
}
