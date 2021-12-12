package String;

import java.util.Scanner;

public class ScannerPractice9 {
    /*

Efe  10:05 AM
-deposit money for David
	create a new class: MoneyTransaction
	David wants to deposit hispaychecks into his account and already has $200
	He has 3 paychecks (610, 385, 975)
	he can only deposit one check at a time
	*Ask: "How much is Deposit amount?" every time he is making deposit
	after all of paycheks deposited in to account
	he bought a phone for $599 and headphone for $299
	*Ask: How much is phone?
	*Ask: How much is headPhone?
	Calculate his final money and print --> "Your final balance is <finalAmount>"
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double balance = 200;
        System.out.println("How much deposit amount?");
        double deposit1 =scan.nextDouble();
        balance += deposit1;
        System.out.println("How much deposit amount?");
        double deposit2 =scan.nextDouble();
        balance += deposit2;
        System.out.println("How much deposit amount?");
        double deposit3 =scan.nextDouble();
        balance += deposit3;


        System.out.println("How much is your phone?");
        double phone$ = scan.nextDouble();
        balance -= phone$;
        System.out.println("How much is headphone?");
        double headPhone$ = scan.nextDouble();
        balance -= headPhone$;

        System.out.println("Your final balance is = " + balance);

    }
}
