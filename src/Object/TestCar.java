package Object;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda");
        Car car3 = new Car("Toyota");
        Car car4 = new Car("Toyota");
        System.out.println("this is a try --->" +  car3.toString());
        car1.move();
        car2.move("North");
        System.out.println(car1);//Object.Car@2acf57e3.This showing hashcode because
        // we don't have string method in our own car class.
        // I overload the toString method and changed the method body then run again and showed My car's brand is Toyota
        car1=null;
        System.out.println(car2);//My car brand is Honda. this prints hashcode before we import toString method in Car class
        System.gc();

    }
}
