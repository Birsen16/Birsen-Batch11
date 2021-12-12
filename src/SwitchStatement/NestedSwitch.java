package SwitchStatement;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        /*call tectorial and options are below
        1-it department
           David, Tima
        2-admin
          Alex, Jessi
        3-customer care
         Zack,Ana,John
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Thank you for calling Techtorial. Please sellect from folling options. \n1-IT\n2-Admin\n3-Customer Care");
        int department = input.nextInt();
        switch (department) {
            case 1:
                System.out.println("You are connected to IT department.Who do you want to talk with David or Tima." +
                        " Please enter the name");
                input = new Scanner(System.in);
                String name = input.nextLine().toLowerCase();
                switch (name) {
                    case "david":
                        System.out.println("You are connected to David");
                        break;
                    case "tima":
                        System.out.println("you are connected to Tima");
                        break;
                    default:
                        System.out.println("we dont have " + name);
                        break;
                }
                break;
            case 2:
                System.out.println("You are connected to admin department.Who do you want to talk with Alex or" +
                        " Jessi Please enter the name");
              input = new Scanner(System.in);
              String name1 = input.nextLine().toLowerCase();
                switch (name1) {
                    case "alex":
                        System.out.println("You are connected to Alex");
                        break;
                    case "jessi":
                        System.out.println("you are connected to Jessi");
                        break;
                    default:
                        System.out.println("we dont have " + name1);
                        break;
                }
            case 3:
                input = new Scanner(System.in);
                String name2 = input.nextLine().toLowerCase();
                System.out.println("You are connected to Customer Care department.Who do you want to talk with John, Zack or Ana. Please enter the name");
                switch (name2) {
                    case "John":
                        System.out.println("You are connected to John");
                        break;
                    case "Zack":
                        System.out.println("you are connected to Zack");
                        break;
                    case "Ana":
                        System.out.println("you are connected to Ana");
                        break;
                    default:
                        System.out.println("we dont have " + name2);
                        break;
                }
        }
    }
}
