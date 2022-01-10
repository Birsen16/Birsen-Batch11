package ArrayList;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
        //store 5 computer object into an ArrayList
        Computer comp1= new Computer("mac",1100,16,"slver",256);
        Computer comp2= new Computer("mac",1100,16,"slver",256);
        Computer comp3= new Computer("HP",1100,16,"slver",256);
        Computer comp4= new Computer("casper",1100,16,"slver",256);
        Computer comp5= new Computer("Allienware",1100,16,"slver",256);
        ArrayList<Computer> list = new ArrayList<Computer>();
        list.add(comp1);
        list.add(comp2);
        list.add(comp3);
        list.add(comp4);
        list.add(comp5);

        System.out.println(list);//ArrayList.Computer@3f0ee7cb, ArrayList.Computer@75bd9247, ArrayList.Computer@7d417077, ArrayList.Computer@7dc36524, ArrayList.Computer@35bbe5e8]
        System.out.println("======================");

        ArrayList <Computer> macComputers=new ArrayList<>();
        for (Computer device : list){
            if (device.brand.equalsIgnoreCase("mac")){
                System.out.println(device);
                System.out.println(device.price);
                System.out.println(device.brand);
                macComputers.add(device);
            }
        }
        System.out.println(macComputers);
    }

    
}
