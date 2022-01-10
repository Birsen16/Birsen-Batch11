package ArrayList;

import java.util.ArrayList;

public class FlowerTest {
    public static void main(String[] args) {


        Flower flower5 = new Flower("Blue", "Ivy", 2.99);
        Flower flower1 = new Flower("Red ", "rose", 3.99);
        Flower flower2 = new Flower("while", "daisies", 4.99);
        Flower flower3 = new Flower("yellow", "cactus", 2.00);


        ArrayList<Flower> flowersList = new ArrayList();
        flowersList.add(flower1);
        flowersList.add(flower2);
        flowersList.add(flower3);
        flowersList.add(flower5);

        for (Flower flower:flowersList ){
            System.out.println(flower.name + " is $" + flower.price);
        }
        System.out.println(totalPrice(flowersList));

    }
    public static double totalPrice(ArrayList<Flower> vase){
        double sum=0;
        for (Flower flower : vase){
            sum+=flower.price;
        }
return sum;
    }

}
/*
create a method that will take parameter as ArrayList of flowers\
this method will return the total prices of the flowers
 */
