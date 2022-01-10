package Object;

public class Car {
    String brand;

    public Car(String brand) {
       this.brand=brand;
    }

    @Override
    public String toString() {
        return "My car's brand is " + brand;
    }

    @Override
    protected void finalize()  {
        System.out.println("Finalize");
    }

    public void move ( ){
        System.out.println( "Car is moving ");
    }
    public boolean move(String dest){
        System.out.println(brand + " moving to " + dest);
        return true;
    }


}
