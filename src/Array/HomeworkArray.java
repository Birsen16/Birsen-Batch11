package Array;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums=new int[]{10,4,3,55,32,145,443,234,98,32};

        System.out.println("Please enter number from array");

        int value =scanner.nextInt();

        int count=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]==value){
                count++;
                nums[i]=0;

            }if (count==0){
                System.out.println("False");
            }

        } System.out.println(Arrays.toString(nums));





















//        Scanner scanner= new Scanner(System.in);
//        int[] num = new int[7];
//        for (int i =0;i<num.length;i++){
//            System.out.println("Enter number for array");
//            num[i]=scanner.nextInt();
//        }
//        for(int i = 0; i < num.length; i++) {
//            int j;
//            for(j =0; j < num.length; j++) {
//                if(i!=j && num[i]==num[j]){
//
//                    break;
//
//                }
//            }if(j==num.length){
//                System.out.println(num[i]);
//            }
//
//
//        }
    }
//        int[] num = new int[13];
//        for (int i =0;i<num.length;i++){
//            System.out.println("Enter number for array");
//            num[i]=scanner.nextInt();
//        }
//        for(int i = 0; i < num.length; i++) {
//            int count1=0;
//            for(int j = 0; j < num.length; j++) {
//                if(num[i] == num[j] ) {
//                   count1++;
//
//                }
//            }
//            if(count1==1) {
//                System.out.print(num[i] + " ");
//            }
//
//        }
//        double[] fahrenheits = new double[]{32,21,0,-3,-40,32,80};
//        //((Fahrenheit-32)*5)/9
//        double[] celsius =new double[fahrenheits.length];
//
//        for (int i = 0; i<fahrenheits.length;i++){
//                celsius[i]=(fahrenheits[i]-32)*5/9;
//            System.out.print(celsius[i] + ", ");
//        }


    }




