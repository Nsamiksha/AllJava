package AddressBook;

import java.io.File;
import java.io.IOException;

import Utility.util;

public class AddressBookTest {
	static String path="/home/user/javaPrograms/";

	public static void main(String[] args) throws IOException {
		String firstName,lastName;
		AddressBook_Main manager= new AddressBook_Main();
		int repeat=1;
		while(repeat==1) {
			System.out.println("<>Address Book<>");
			System.out.println("1.Create new Address Book"
					+ "\n2.Add People to Contact"
					+ "\n3.Modify Address Book"
					+ "\n4.Exit");
			System.out.println("Enter the choice:");
			int choice = util.printint();
			switch(choice) {
			case 1:
				System.out.println("Enter the Name of AddressBook");
				String addressBookName=util.printstring();
//				if(AddressBook_Main.createAddressBook(addressBookName)) {
//					System.out.println("Address book created...");
//				}else {
//					System.out.println("Address book is aready present..");
//				}
				break;
				
			case 2:
				manager.printFileName();
				System.out.println("Enter the File Name:");
				addressBookName=util.printstring();
				System.out.println("Enter the First Name:");
				firstName=util.printstring();
				System.out.println("Enter the Last Name:");
				lastName=util.printstring();
				//AddressBook_Main.addPersonToContact(addressBookName,firstName,lastName);
				break;
			case 3:
				manager.printFileName();
				System.out.println("Enter the File Name");
				addressBookName= util.printstring();
				boolean exist=new File(path+addressBookName).exists();
				long fileLength= new File(path+addressBookName).length();
				if(exist==false||fileLength==0) {
					System.out.println("Invalid choice");
				}else {
					System.out.println("<>Content of AddressBook<>");
					AddressBook_Main.createAddressBook(addressBookName);
					System.out.println("1.Edit Contact"
							+ "\n2.Delete Contact"
							+ "\n3.Sort By"
							+ "\n4.Display "
							+ "\n5.Exit");
					System.out.println("Enter the choice");
					choice= util.printint();
					switch(choice) {
					case 1:
						System.out.println("Enter the FirstName");
						firstName= util.printstring();
						//manager.editPerson(firstName,addressBookName);
						break;
					case 2:
						System.out.println("Enter the FirstName");
						firstName= util.printstring();
						manager.delete(firstName,addressBookName);
						break;
					case 3:
						System.out.println("1.sort by Name"
								+ "\n2.sort by Zip"
								+ "\n3.Enter the choice:");
						choice=util.printint();
						if(choice==1) {
							manager.sortByName(addressBookName);
						}
						if(choice==2) {
							manager.sortByZip(addressBookName);
						}
						break;
					case 4:
						System.out.println("Enter the FirstName");
						firstName=util.printstring(); 
						manager.print(addressBookName,firstName);
						break;
					case 5:
						System.exit(0);
					}
				}
				break;
			case 4:
				System.out.println("Exit");
				System.exit(0);
			}
			
		}
		System.out.println("press 1 to continue");
		repeat= util.printint();

	}

	

}
