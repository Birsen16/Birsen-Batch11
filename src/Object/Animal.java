package Object;

public class Animal     {
    //instance variables, we can also call them our object variables
    String name;
    int age;
    String color;
    char gender;
    String breed= "German Shepard";//if you initize here it will be default value. Otherwise you need to initilize it as bird.breed ="peacock";
    int energy =100;

    public void sleep(){
        energy=100;
        System.out.println(name + " has %" + energy+ " energy");
        System.out.println(name + " is charging up..");
    }

    public void eat(){
        System.out.println(name + " is eating");
    }
    public void run(){
    energy=energy-10;
        System.out.println(name + " has % "+ energy+ " energy");
    }
    public void info(){
        System.out.println("Name is " + name + " Age is " + age + " Color is " + color + " Breed is " + breed + " Energy is " + energy );
    }




}
