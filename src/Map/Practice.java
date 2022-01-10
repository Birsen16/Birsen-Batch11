package Map;

import java.util.HashMap;

public class Practice {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap();

        //put()
        map.put(1,"Enes");
        map.put(2,"Alex");
        map.put(3,"David");
        map.put(4,"Alex");

        System.out.println(map);//{1=Enes, 2=Alex, 3=David, 4=Alex}

        map.put(1,"Yusuf");//if you try to store same key multiple times, it will update value for that
        System.out.println(map);//{1=Yusuf, 2=Alex, 3=David, 4=Alex}
        map.put(null, "Enes");
        System.out.println(map);//{null=Enes, 1=Yusuf, 2=Alex, 3=David, 4=Alex}
        map.put(null, "David");
        System.out.println(map);//{null=David, 1=Yusuf, 2=Alex, 3=David, 4=Alex}

        //get();

        map.get(2);

        //remove();
        map.remove(null);
        System.out.println(map);

        //replace()
        map.replace(2,"Jennifer");
        System.out.println(map);

        map.replace(2,"Jennifer","Zack");
        System.out.println(map);

        System.out.println(map.containsKey("Zack"));//false
        System.out.println(map.containsKey(6));//true
        System.out.println(map.containsKey(19));//false

        System.out.println(map.containsValue("Enes"));//true
        System.out.println(map.containsValue(false));//false

        //size()
        System.out.println(map.size());//4
        System.out.println(map.isEmpty());//false

        //putall()

        HashMap<Integer,String> map1=new HashMap<>();

        map1.put(1,"White");
        System.out.println(map1);

        map1.putAll(map);
        System.out.println(map1);






    }
}
