package Set;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet ids=new HashSet();
        HashSet<Integer>ids1=new HashSet();
        Set<Integer> ids2=new HashSet();//-----> This is creating from Set interface from hashset

        ids1.add(22);
        ids1.add(33);
        ids1.add(44);
        ids1.add(99);
        System.out.println(ids1);
        System.out.println(ids1.equals("22"));
        System.out.println(ids1.contains("22"));
        System.out.println(ids1.hashCode());

        ids1.add(null);
        System.out.println(ids1);
        ids1.add(22);//you cant add dublicate elements so when we store 22 second time then it is just like before
        System.out.println(ids1);//

        //there is no get() method so you can use foreach loop to reach elements.
        // there is no indexing so so you cant use regular loop

//        for (Integer id : ids1){//NullPointerException
//            System.out.println(id*2);
   //     }
        for (Integer id : ids1){//NullPointerException
           if (id==null){
               continue;
           }
            System.out.println(id*2);//66,198,44,88
               }

        Iterator iterator =ids2.iterator();//you can use this just like for each loop for collections

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(ids1.size());

    }
}
