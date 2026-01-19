
package com.bankApplication.exponent.validateMobileNo;

import java.util.Scanner;
import java.util.regex.Pattern;
import org.omg.CORBA.portable.ValueOutputStream;

public class validationChecker {

	static Scanner sc = new Scanner(System.in);

	// _________________________________Name Validation Method __________________________________________
	public static String validateName() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name :");
		String nameIN = sc.next();
		if (Pattern.matches("[A-Za-z]+", nameIN)) {
			System.out.println("Valid name...!");
			sc.hasNextLine();
			return nameIN;
		} else {
			System.out.println("Invalid name please enter again...!");
			return validateName();
		}
	}

//_________________________________Aadhar no Validation Method __________________________________________
	public static String validateAadharNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter aadhar No:");
		String aadharIN = sc.nextLine().trim();
		if (Pattern.matches("[2-9]{1}[0-9]{3}[ ]{1}[0-9]{4}[ ]{1}[0-9]{4}", aadharIN) && aadharIN.length() == 14) {
			System.out.println("Valid aadhar no:");
			return aadharIN;
		} else {
			System.out.println("Invalid aadhar No:");
			return validateAadharNo();
		}
	}
//_________________________________PAN no Validation Method __________________________________________

	public static String validatePanNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pan No:");
		String panIN = sc.next();
		if (Pattern.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}+", panIN) && panIN.length() == 10) {
			System.out.println("Valid Pan No:");
			return panIN;
		} else {
			System.out.println("Invalid PAN no try again...!");
			return validatePanNo();
		}
	}
//_________________________________Email  Validation Method __________________________________________

	public static String getEmail() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mail Id;");
		String emailIN = sc.nextLine().trim();
		String mailRegix = "^[a-zA-Z0-9.]{6,30}@gmail\\.com$";
		if (Pattern.matches(mailRegix, emailIN)) {
			System.out.println("Valid Email");
			return emailIN;
		} else {
			System.out.println("Invalid email try again...!");
			return getEmail();
		}

	}
//_________________________________Mobile  no Validation Method__________________________________________

	public static long getMobileNumber() {
		System.out.println("Enter your Mobile Number:");
		long mobileno = sc.nextLong();
		String mobilenoStr = String.valueOf(mobileno);

		if (mobilenoStr.length() == 10 && (mobilenoStr.startsWith("6") || mobilenoStr.startsWith("7")
				|| mobilenoStr.startsWith("8") || mobilenoStr.startsWith("9"))) {
			System.out.println("Valid mobile No");
			return mobileno;
		} else {
			System.out.println("Invalid Mobile number try again");
			return getMobileNumber();
		}
	}

}