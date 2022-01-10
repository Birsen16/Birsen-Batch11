package Object;

public class StaticPetPractice {
    String name;
    int age;
    String color;
   static double food=20;//

    static void eat(){
        food-=1;
        System.out.println("Food amount is now " + food);
        //to call static method  into main method,
        //you need to create an object
        StaticPetPractice pet9 = new StaticPetPractice();
       // pet9.play();
        pet9.color = "red";
    }
        public void play(){
        System.out.println("Pet is playing ");
        /*
        inside a non static method,you can call static
        or nonstatic method without object. See below:
         */
        eat();
        StaticPetPractice.eat();
        food = 100;
        color = "blue";


    }

    public static void main(String[] args) {
        StaticPetPractice pet1 = new StaticPetPractice();
        pet1.eat();//run-->19
        pet1.eat();//run-->18
        StaticPetPractice pet2 = new StaticPetPractice();
        pet2.eat();//run -->19.why this is also 19, they are eating from same bag of food. they are acting like
        // they have 2 separate bag of the food. By the way this happened 17 after we added static in front of oour variable food
        //if you type static in front of the food at above variable it will make them share same bag static double food=20;
        pet1.eat();//16
        pet2.eat();//-run -->15


        //=========
        eat();//run -->14  ---> This eat() method without object
        // and without class name is working because eat method is in the same class and it is static
        //=========
        StaticPetPractice.eat();
        /*
         nonstatic methods can not be called
         without object from static method
         play();
         staticPetPractice.play();
         */


    }
}
