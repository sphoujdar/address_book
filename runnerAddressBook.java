package address_book;

import java.util.Scanner;



public class runnerAddressBook {

		
			
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean exitSwitch = false;
		AddressBook book1 = new AddressBook();
		Scanner scanner = new Scanner(System.in);
		int userChoice;
		
		while (exitSwitch == false) {
			System.out.println("\n\nSelect what you want to do : \n\n" +
								"0. View the Address Book \n" +
								"1. Add Person to Address Book \n" + 
								"2. Modify Person in Address Book \n" + 
								"3. Delete Person in Address Book \n" +
								"4. Sort the Address Book and View \n" +
								"5. Exit the Program\n\n");
			
				userChoice = scanner.nextInt();
				
				switch(userChoice) {
				  case 0:
					  book1.printBook();
					  break;
				  case 1:
					  book1.addPerson(scanner);
					  break;
				  case 2:
					  book1.modifyPerson(scanner, book1);
				    break;
				  case 3:
					  book1.deletePerson(scanner, book1);
				    break;
				  case 4:
					  book1.sortBook();
				    break;
				  case 5:
					  System.out.println("Goodbye!");
					  exitSwitch = true;
					  	
					  break;
				  default:
					  System.out.println("Please Enter Valid Input");
					  
			}
		    
			
			
	}
		scanner.close();
		
	
}
}
