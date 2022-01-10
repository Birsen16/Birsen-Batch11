package Object;

public class Cat {
    String name;
    int age;
    String color;
    int FoodAmount;
    //Create a method name as run(), it will take a parameter as a destination
    //it will reduce food amount by 1 for every execution
    // it will print out as cat is running...<west>

    public void run(String destination){
       FoodAmount-=1;
        System.out.println(name + " is running to" +destination );
    }
    //create a method as set color method
    //this will take a parameter and initialize the calor of the cat.
    public void setColor(String newColor){
        color = newColor;
    }
    //create a method that will return color of the cat, name it as getColor();
    public String getColor(){
        return color;
    }

    public static void main(String[] args) {
        Cat cat1 =new Cat();
        cat1.name="Ginger";
        cat1.color="Orange";
        cat1.age=9;
        cat1.FoodAmount=10;
        cat1.run("up");
        System.out.println(cat1.FoodAmount);
        cat1.setColor("Pink");
        System.out.println(cat1.color);
        System.out.println("This is coming from getColor() method -->" + cat1.getColor());
        cat1.run("up", 3);
    }
    public void run(String destination,int times){
        FoodAmount-=1;
        System.out.println(name + " is running to" +destination + times);
    }

}
