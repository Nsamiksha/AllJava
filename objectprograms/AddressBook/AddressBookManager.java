package AddressBook;

import java.io.File;
import java.io.IOException;

import Utility.util;

public class AddressBookManager {

public static void main(String[] args) throws IOException {
		
	
		String firstName,lastName;
		AddressBook_Main manager= new AddressBook_Main();	
	int choice = 0;
	int choice1 = 0;
	
	do {
		
	System.out.println("<>Welcom To Address Book<>");
	System.out.println("1.Create new Address Book"
			+ "\n2.Open"
			+ "\n3.Close"
			+ "\n4.Save"
			+ "\n5.Exit");
	System.out.println("Enter the choice:");
	 choice = util.printint();
	 switch(choice) {
	 
	 
		case 1:
			//create addressbook
			System.out.println("Enter the Name of AddressBook");
			String addressBookName = util.printstring();
			
	File file = AddressBook_Main.createAddressBook(addressBookName);
				
			
			System.out.println("<>Address Book Functions<>");
			System.out.println("\n1.Add People to Contact"
					+ "\n2.Modify Address Book"
					+ "\n3.Main Menu");
			System.out.println("Enter the choice:");
			choice1 = util.printint();
			 switch(choice1) {	
			
			 case 1: 
				 //add people
				 manager.printFileName();
				 System.out.println("Enter the First Name:");
					firstName=util.printstring();
					System.out.println("Enter the Last Name:");
					lastName=util.printstring();
					AddressBook_Main.addPersonToContact(file,firstName,lastName);
					break;
			 case 2:
//				 modify
//				manager.printFileName();
//				System.out.println("Enter the File Name");
//				addressBookName= util.printstring();
//				boolean exist = new File(path+addressBookName).exists();
//				long fileLength= new File(path+addressBookName).length();
//				if(exist==false||fileLength==0) {
//					System.out.println("Invalid choice");
//				}else {
					System.out.println("<>Content of AddressBook<>");
					//AddressBook_Main.createAddressBook(addressBookName);
					System.out.println("1.Edit Contact"
							+ "\n2.Delete Contact"
							+ "\n3.Sort By"
							+ "\n4.Display "
							+ "\n5.Exit");
					System.out.println("Enter the choice");
					int choice2= util.printint();
					switch(choice2) {
					case 1:
						//edit contact
						System.out.println("Enter the FirstName");
						firstName= util.printstring();
						manager.editPerson(firstName,file);
						break;
					case 2:
						//delete contact
						System.out.println("Enter the FirstName");
						firstName= util.printstring();
						manager.delete(firstName,file);
						break;
					case 3:
						//sort by
						System.out.println("1.sort by Name"
								+ "\n2.sort by Zip"
								+ "\n3.Enter the choice:");
						choice=util.printint();
						if(choice==1) {
							manager.sortByName(file);
						}
						if(choice==2) {
							manager.sortByZip(file);
						}
						break;
					case 4:
					case 5:break;
					}
			 case 3://open
			 case 4://close
			 case 5://save
					}
			 }while(choice1 <= 4 && choice1>0);
			
	 
	
	}while(choice>5 && choice >0);
	
	
	 
	
	
}
	
}
