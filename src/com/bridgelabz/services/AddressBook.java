package com.bridgelabz.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.entity.Contact;
import com.bridgelabz.interfaces.IAddressBook;

public class AddressBook implements IAddressBook {

	ArrayList<Contact> list = new ArrayList<Contact>();

	public void showAddressBook() {

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list);

		}
	}

	public void addContact() {
		Scanner sc = new Scanner(System.in);
		Contact contact = new Contact();

		System.out.println("Enter Person Details: ");

		System.out.println("Enter First Name: ");
		String firstName = sc.next();
		contact.setFirstName(firstName);

		System.out.println("Enter Last Name: ");
		String lastName = sc.next();
		contact.setLastName(lastName);

		System.out.println("Enter Phone Number: ");
		long phoneNumber = sc.nextLong();
		contact.setPhoneNumber(phoneNumber);

		System.out.println("Enter Email Id: ");
		String emailId = sc.next();
		contact.setEmailId(emailId);

		System.out.println("Enter City: ");
		String city = sc.next();
		contact.setCity(city);

		System.out.println("Enter State: ");
		String state = sc.next();
		contact.setState(state);

		System.out.println("Enter Zip: ");
		long zip = sc.nextInt();
		contact.setZip(zip);

		System.out.println("Contact added details are: ");

		list.add(contact);

		System.out.println("New added contact details are: ");
		/*
		 * System.out.println("FirstName:" + contact.getFirstName() + "\t" + "LastName:"
		 * + contact.getLastName() + "\t" + "PhoneNumber:" + contact.getPhoneNumber() +
		 * "\t" + "Email Id:" + contact.getEmailId() + "\t" + "City:" +
		 * contact.getCity() + "\t" + "State:" + contact.getState() + "\t" + "Zip:" +
		 * contact.getZip());
		 */
		System.out.println(contact);
		//sc.close();
	}

	// UC-3 edit existing contact details using person name
	public void editContact() {
		System.out.println("Enter person name for edit contact: ");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();

		Iterator<Contact> iterator = list.listIterator();
		Contact contact = null;
		while (iterator.hasNext()) {
			contact = iterator.next();

			if (firstName.equals(contact.getFirstName())) {

				System.out.println("Edit the details of person");
				System.out.println("Choose field you want to add:");
				System.out.println(" 1.First Name \t 2.Last Name \t 3.Phone Number \t 4.Email "
						+ " \t 5.State \t 6.City \t 7.Zip \t 8.Default ");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter First Name: ");
					String firstName1 = sc.next();
					contact.setFirstName(firstName1);
					break;
				case 2:
					System.out.println("Enter Last Name: ");
					String lastName = sc.next();
					contact.setLastName(lastName);
					break;
				case 3:
					System.out.println("Enter Phone Number: ");
					long phoneNumber = sc.nextLong();
					contact.setPhoneNumber(phoneNumber);
					break;
				case 4:
					System.out.println("Enter Email: ");
					String emailId = sc.next();
					contact.setEmailId(emailId);
					break;
				case 5:
					System.out.println("Enter State: ");
					String state = sc.next();
					contact.setState(state);
					break;
				case 6:
					System.out.println("Enter City: ");
					String city = sc.next();
					contact.setState(city);
					break;
				case 7:
					System.out.println("Enter Zip: ");
					long zip = sc.nextInt();
					contact.setZip(zip);
					break;
				default:
					System.out.println("Exit");
				}
			} else {
				System.out.println("Person not found here");
			}
		}

		System.out.println("FirstName:" + contact.getFirstName() + "\t" + "LastName:" + contact.getLastName() + "\t"
				+ "PhoneNumber:" + contact.getPhoneNumber() + "\t" + "Email Id:" + contact.getEmailId() + "\t" + "City:"
				+ contact.getCity() + "\t" + "State:" + contact.getState() + "\t" + "Zip:" + contact.getZip());
	}
	
	 // UC-4 deleting contact details using person name
 public void deleteContact() {
     System.out.println("Enter the name to search and delete");
     Scanner sc = new Scanner(System.in);
     String s = sc.next();
     
     for (int i = 0; i < list.size(); i++) {
         Contact p = list.get(i);
         if (s.equals(p.getFirstName())) {
             list.remove(i);
         }
     }
     System.out.println("contact after deletion");
     if (list.isEmpty() != true)
         System.out.println(list);
     else {
         System.out.println("contacts deleted");
     }
 }
 
 //UC-5 
 public void addMultipleContacts() {

     List<Contact> contacts = new ArrayList<>();
     System.out.println("Enter Your Address Book name ");
     Scanner sc = new Scanner(System.in);
     String findAddressBook = sc.next();

     System.out.println("Enter the First Name");
     String firstName = sc.next();

     System.out.println("Enter the Last Name");
     String lastName = sc.next();

     System.out.println("Enter the Address Name");
     String address = sc.next();

     System.out.println("Enter the City Name");
     String city = sc.next();

     System.out.println("Enter the State Name");
     String state = sc.next();

     System.out.println("Enter the Zip Name");
     int zip = sc.nextInt();

     System.out.println("Enter the PhoneNumber");
     long phoneNumber = sc.nextLong();

     System.out.println("Enter the email");
     String email = sc.next();
     Contact contact = new Contact();
     contacts.add(contact);

     System.out.println("Do you want add one more Contact Details");
     System.out.println("1 :Yes   /n  2 :No");
     int choice = sc.nextInt();
     switch (choice) {

         case 1:
            
             break;
         case 2:
            
             break;
             
         default:
             System.out.println("Please Enter correct choice");

     }

//     addressbooks.displayContacts(addressBookSystem);
//     addressbooks.addContacts();

 }

}
