package Array;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        String colors[] = {"white", "black", "red", "pink","orange"};
        //print out every element in reverse order from the given array.
//
//        String []reversed = new String[colors.length];
//        String str="";
//        for (int a = 0; a<colors.length;a++){
//            str="";
//            for (int i = colors[a].length()-1;i>=0;i--){
//                str+=colors[a].charAt(i);
//            }
//            reversed[a]=str;
//        }
//        System.out.println(Arrays.toString(colors));
//        System.out.println(Arrays.toString(reversed));


        // String[] colors = {"white", "black", "red", "pink"};
         String[] colorsNew = new String[colors.length];
        int i =0;

        for(String colorReversed: colors){
            String str = "";
            for( int num = colorReversed.length()-1; num>= 0; num--){
               str += colorReversed.charAt(num) ;
            }
            colorsNew[i] = str + " ";
            i++;
        }
        System.out.println(Arrays.toString(colorsNew));

    }
}
