package IfStatement;

import java.util.Scanner;

public class Hired {
    public static void main(String[] args) {
        /*
        ==Task==

  nested if >>>> java>selenium>API>Sql>Appium ornegi
  ask user:
        -s/he knows Java yes/no
                yes: ask s/he knows Selenium

                        can learn: ask s/he has API testing experience
                        yes: ask s/he has API testing experience
                        no: we need someone who is familiar with Selenium
                                yes: ask s/he has Sql knowledge
                                        yes: "Congrat!! You are HIRED!!"
                                        no: We need someone who has Sql knowledge
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Do you know Java ? yes / no");
        String java = scanner.nextLine();
        if (java.equalsIgnoreCase("yes")){
            System.out.println("Do you know Selenium? yes / or/ learn");
            String selenium = scanner.nextLine();
            if (selenium.equalsIgnoreCase("yes" )|| selenium.equalsIgnoreCase("learn")){
                System.out.println("Do you know API?");
                String api = scanner.nextLine();
                if (api.equalsIgnoreCase("yes")){
                    System.out.println("Do you know SQL");
                    String sql =scanner.nextLine();
                    if (sql.equalsIgnoreCase("yes")){
                        System.out.println("Congrats!! You are hired");
                    } else {
                        System.out.println("We need someone with SQL knowledge");
                    }
                } else {
                    System.out.println("We need someone who knows API");
                }
            } else {
                System.out.println("We need someone who know Selenium");
                System.out.println("Can you learn?");
            }
        }else {
            System.out.println("We need someone who knows Java");
        }

    }
}
