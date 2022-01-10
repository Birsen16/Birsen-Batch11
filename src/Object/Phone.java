package Object;

public class Phone {
    String brand;
    double price =1000;
    String color;
    //Constructor
    public Phone(){
       this("Navy Blue","Google");
        System.out.println("This is no argument constructor");
    }
    //constructor
    public Phone(String newColor){
        this.color=newColor;

        System.out.println("This is no argument constructor");
    }
    public Phone(String newColor, String newBrand){
        this.color=newColor;
        this.brand=newBrand;
        System.out.println("This is TWO parameter constructor");

    }






    //Method to set the color
    public void setColor(String color1){

        color=color1;
    }
    public void setColor(int i, double color1){
        //color=color1
    }
    //Method to call
    public void Phone(){
        int a =5;
        a=9;
    }
}

