package ArrayList;

public class Computer {
    String brand;
    double price;
    double screenSize;
    String color;
    int storage;

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", screenSize=" + screenSize +
                ", color='" + color + '\'' +
                ", storage=" + storage +
                '}';
    }



    public Computer(String brand, double price, double screenSize,String color,int storage){
        this.brand=brand;
        this.price=price;
        this.screenSize=screenSize;
        this.color=color;
        this.storage=storage;

    }

}
