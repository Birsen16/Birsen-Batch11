package pages.amazonages;

import java.util.Arrays;
import java.util.Objects;

public class javapractice {
    public static void main(String[] args) {

    }
    public static int sumdigit(String str){
        int sum =0;

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if (Character.isDigit(c)){
                sum+=c-'0';
            }
        }
        return sum;
    }
    public static void countDuplicates(String str){

    }

}
