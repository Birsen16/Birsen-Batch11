package Array;

import java.util.Arrays;

public class CharPractice {
    public static void main(String[] args) {
        //print only numbers from this array
        char[] chs = {'A','4','n','&','z','*','3'};
        char[] others = new char[chs.length];
        int count=0;
        for (int i =0; i<  chs.length ;i++){
            if (chs[i] >='0' && chs[i] <= '9'){
                System.out.println(chs[i]);
                count++;
                //burda char oldugu icin '' icine koyduk eger normal yazsaydik
                // ascci table a gidip numaranin karsiligini arayacakti. yukaridaki chs[] 55 number olarak ekle sout yaptifinda 7 cikiyor

            }else{
               others[i]=chs[i];
            }

        }
        System.out.println(Arrays.toString(others));//[A,  , n, &, z, *,  ]
        Arrays.sort(others);
        System.out.println(Arrays.toString(others));//[ ,  , &, *, A, n, z] this is show sorted array from assending which means from small to large refered from Assci table


    }
}
