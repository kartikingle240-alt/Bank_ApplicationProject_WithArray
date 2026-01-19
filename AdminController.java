package com.bankApplication.exponent.controller;

import java.util.Scanner;
import com.bankApplication.exponent.service.RBI;
import com.bankApplication.exponent.serviceImpl.SBI;

public class AdminController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		RBI rbi = new SBI();
		
		System.out.println("\n______________Create Account in SBI Bank________________\n");
		rbi.createAccount();
		
		while (flag) {
			System.out.println("_______________________");
			System.out.println("1. Create Account      |");
			System.out.println("2. Show Account Details|");
			System.out.println("3. Show account balance|");
			System.out.println("4. Withdraw money      |");
	
	        System.out.println("5. Deposite money      |");
			System.out.println("6. UpdateAccountDetails|");
			System.out.println("7. Exit                |");
			System.out.println("_______________________|");
			System.out.println("Enter your choice :");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				rbi.createAccount();
				break;
			case 2:
				rbi.showAccountDetails();
				break;
			case 3:
				rbi.showAccountBalance();
				break;
			case 4:
				rbi.withdrawMoneyt();
				break;
			case 5:
				rbi.depositeMoney();
				break;
			case 6:
				rbi.updateDetails();
				break;
			case 7:
				flag = false;
				System.out.println("Thank you for visiting");
				break;
			default:
				System.out.println("Invalid choice please choole from 1 to 7");
				break;
			}
		}
	}
}
