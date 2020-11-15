package address_book;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AddressBook {
	ArrayList<Person> currentBook = new ArrayList<Person>();


	public void addPerson (Scanner sc) {
		System.out.println("Adding New Person");
		Person currentPerson = new Person();
		System.out.println("Please Enter Name");
		String name = sc.next();
		currentPerson.setName(name);
		System.out.println("Please Enter Address");
		String address = sc.next();
		currentPerson.setAddress(address);
		this.currentBook.add(currentPerson);
	}
	
	public void printBook () {
		for (int i = 0 ; i<currentBook.size(); i++) {
			System.out.println("Name : " + currentBook.get(i).getName());
			System.out.println("Address : " + currentBook.get(i).getAddress());
			
		}
	}

	public int findPerson(Scanner sc) {
		System.out.println("Please Enter Name");
		String name = sc.next();
		boolean found = false;
		for (int i = 0 ; i<currentBook.size(); i++) {
			//System.out.println(currentBook.get(i).getName());
			if(currentBook.get(i).getName().equals(name)) {
				return i;
			}
		}
		if(!found) { 
			System.out.println("Not in Address Book");
		}
		
		return -999;
	}
	
	public void modifyPerson(Scanner sc, AddressBook book1) {
		int index = book1.findPerson(sc);
		if(index == -999) {
			return;
		}
		else {
			System.out.println("Enter the new address : ");
			String address = sc.next();
			this.currentBook.get(index).setAddress(address);
			System.out.println("Address updated");
			System.out.println("Name : "+ this.currentBook.get(index).getName() +"\nAddress : " + this.currentBook.get(index).getAddress());
			//book1.printBook();
		}
	}
	
	public void deletePerson(Scanner sc,AddressBook book1) {
		int index = book1.findPerson(sc);
		if(index == -999) {
			return;
		}
		else {
			this.currentBook.remove(index);
			book1.printBook();
		}
	}
	
	public void sortBook() {
		System.out.println("Before sorting : ");
		this.printBook();
		//this.currentBook.sort();
		Collections.sort(this.currentBook, new NameComparator());
		System.out.println("After sorting");
		this.printBook();
	}
	
	
}


