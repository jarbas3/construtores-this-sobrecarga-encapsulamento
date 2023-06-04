package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char ch = sc.next().charAt(0);
		
		if (ch == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(accountNumber, accountHolder, initialDeposit);
		}
		else {
			account = new Account(accountNumber, accountHolder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.println("Updated account data:");
		System.out.println(account);
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		sc.close();
	}
}
