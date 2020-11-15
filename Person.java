package address_book;


public class Person {
	String name;
	String address;
	

	
	
	 public Person() { 
	 }



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}




	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}

	
/*
	public static void main(String args[]) {
		
		
		}
		
	}
	*/
	
}


/*
 * class AddressBook { ArrayList<Person> currentBook;
 * 
 * public AddressBook() { super(); Person blankPerson = new
 * Person("Person Zero", "Address Zero"); this.currentBook = currentBook; }
 * 
 * public void addPerson() { Scanner personInput = new Scanner(System.in);
 * String name; String address;
 * 
 * System.out.println("Enter Person Name : "); name = personInput.next();
 * 
 * System.out.println("Enter Person Address : "); address = personInput.next();
 * 
 * 
 * Person newPerson = new Person(name,address); currentBook.add(newPerson);
 * 
 * 
 * personInput.close(); }
 * 
 * public void findPerson(String personToFind) {
 * 
 * }
 * 
 * public void deletePerson(String personToDelete) {
 * 
 * }
 * 
 * public void modifyPerson(String personToModify) {
 * 
 * }
 * 
 * public void sortAddressBook() {
 * 
 * }
 * 
 * 
 * }
 */
