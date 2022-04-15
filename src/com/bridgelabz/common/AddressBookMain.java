package com.bridgelabz.common;

import java.util.Scanner;

import com.bridgelabz.interfaces.IAddressBook;
import com.bridgelabz.services.AddressBook;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Management System");

		IAddressBook addressBook = new AddressBook();

		System.out.println("1. Add Contact");
		System.out.println("2. Show Contacts");
		System.out.println("3. Delete Contact");
		System.out.println("4. Edit Contact");
		System.out.println("5. Exit");
		System.out.println("Enter your desired option:");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		while (option != 5) {
			switch (option) {
			case 1:
				addressBook.addContact();
				break;
			case 2: 
				addressBook.showAddressBook();
				break;
			case 3: 
				addressBook.deleteContact();
				break;	
			case 4: 
				addressBook.editContact();
				break;
			case 5:
				option = 5;
				break;
			default:
				System.out.println("Enter valid option from the list");
				break;
			}
			
			System.out.println("1. Add Contact");
			System.out.println("2. Show Contacts");
			System.out.println("3. Delete Contact");
			System.out.println("4. Edit Contact");
			System.out.println("5. Exit");
			System.out.println("Enter your desired option:");
			
		    option = sc.nextInt();
		}

		//sc.close();
	}
}
