package com.bankApplication.exponent.serviceImpl;

import java.util.Scanner;

import com.bankApplication.exponent.autoGenerator.AccountNoAutoGenerator;
import com.bankApplication.exponent.model.Account;
import com.bankApplication.exponent.service.RBI;
import com.bankApplication.exponent.validateMobileNo.validationChecker;

public class SBI implements RBI {

	Scanner sc = new Scanner(System.in);
	Account acc = new Account();
	Account[] accounts = new Account[5];

	@Override
	public void createAccount() {

		System.out.println("Enter account creation number`s :");
		int n = sc.nextInt();
		if (n < accounts.length) {
			for (int i = 0; i < n; i++) {

				Account acc = new Account();
				long accNo = AccountNoAutoGenerator.generateAccountNo();
				acc.setAccountNo(accNo);
				System.out.println("Acoount No:" + accNo);

				String name = validationChecker.validateName();
				acc.setAccountName(name);

				String aadharN = validationChecker.validateAadharNo();
				acc.setAadharNo(aadharN);

				String panNo = validationChecker.validatePanNo();
				acc.setPanNo(panNo);

				String mailId = validationChecker.getEmail();
				acc.setEmail(mailId);

				long mobNo = validationChecker.getMobileNumber();
				acc.setContact(mobNo);

				System.out.println("Enter ammount to open account:");
				acc.setAccountBalance(sc.nextLong());
				accounts[i] = acc;
				System.out.println("Account created for " + i + "s index." + acc.getAccountName());

			}
			System.out.println("Account created successfully...!");
		} else {
			System.out.println("Account creation limit exceeds...!");
		}
	}

	@Override
	public void showAccountDetails() {
		System.out.print("Enter Account Number: ");
		long accNumber = sc.nextLong();
		boolean flag = false;
		for (int i = 0; i < accounts.length; i++) {

			if (accounts[i] != null && accounts[i].getAccountNo() == accNumber) {
				flag = true;
				System.out.println(accounts[i]);
				break;
			}
		}
		if (!flag) {
			System.out.println("Invalid Account Number...!");
		}
	}

	@Override
	public void showAccountBalance() {

		System.out.println("Enter Account Number : ");
		long accNumber = sc.nextLong();

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNo() == accNumber) {

				System.out.println("Current Balance : " + accounts[i].getAccountBalance());
			}
		}
	}
	@Override
	public void withdrawMoneyt() {

		System.out.print("Enter Account Number: ");
		long accNo = sc.nextLong();

		boolean flag = false;

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNo() == accNo) {
				flag = true;
				System.out.print("Enter Amount to Withdraw: ");
				double withdrawamount = sc.nextDouble();
				if (accounts[i].getAccountBalance() >= withdrawamount) {
					double updatedAmount = accounts[i].getAccountBalance() - withdrawamount;
					accounts[i].setAccountBalance(updatedAmount);
					System.out.println("Withdrawal Successful ");
					System.out.println("Current Balance: " + updatedAmount);
				} else {
					System.out.println("Insufficient Amount ");
				}

				break;
			}
		}
		if (!flag) {
			System.out.println("Invalid Account Number..!");
		}
	}

	@Override
	public void depositeMoney() {
		System.out.print("Enter Account Number: ");
		long accNo = sc.nextLong();
		boolean flag = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNo() == accNo) {
				flag = true;
				System.out.print("Enter Amount to Deposit: ");
				double depositAmount = sc.nextDouble();
				double updatedAmount = accounts[i].getAccountBalance() + depositAmount;
				accounts[i].setAccountBalance(updatedAmount);

				System.out.println("Deposit Successful...!");
				System.out.println("Current Balance: " + updatedAmount);
				break;
			}
		}

		if (!flag) {
			System.out.println("Invalid Account Number...!");
		}
	}

	@Override
	public void updateDetails() {

		System.out.println("Enter Account Number to Update Details:");
		long accNo = sc.nextLong();

		boolean flags = false;

		for (int i = 0; i < accounts.length; i++) {

			if (accounts[i] != null && accounts[i].getAccountNo() == accNo) {

				flags = true;
				int choice;

				do {
					System.out.println("\n_______Update Menu_______");
					System.out.println("1. Update Name");
					System.out.println("2. Update Contact");
					System.out.println("3. Update Aadhar");
					System.out.println("4. Exit");
					System.out.print("Enter your choice: ");

					choice = sc.nextInt();
					sc.nextLine();

					switch (choice) {

					case 1:
						System.out.print("Enter New Name: ");
						String name = sc.nextLine();
						accounts[i].setAccountName(name);
						System.out.println("Name Updated Successfully ");
						break;

					case 2:
						System.out.print("Enter New Contact Number: ");
						long contact = sc.nextLong();
						accounts[i].setContact(contact);
						System.out.println("Contact Updated Successfully ");
						break;

					case 3:
						System.out.print("Enter New Aadhar Number: ");
						String aadhar = sc.next();
						accounts[i].setAadharNo(aadhar);
						System.out.println("Aadhar Updated Successfully ");
						break;

					case 4:
						System.out.println("Exit from Update Menu");
						break;

					default:
						System.out.println("Invalid Choice ");
					}

				} while (choice != 4);

				break;
			}
		}

		if (!flags) {
			System.out.println("Account Number Not Found ");
		}
	}

}
