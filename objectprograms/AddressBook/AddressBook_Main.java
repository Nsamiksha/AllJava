package AddressBook;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import Utility.util;

public class AddressBook_Main implements Manager1 {
	
static String Path="/home/user/javaPrograms/";
		static ObjectMapper mapper = new ObjectMapper(); 
		static String firstName;
		static String lastName;
		static String bookName;

		public static File createAddressBook(String name) throws IOException {
			   
			String newfile  = Path + name + ".json";
			
					File file = new File(newfile);

					boolean result = file.createNewFile();

					if(result) {
						System.out.println("Address book created...");
					}
					else {
						System.out.println("Address book not created");
					}
					
					
					return file;

		}

		public void printFileName() {
			
			
		}

	
public static void addPersonToContact(File file, String firstName, String lastName)
					throws JsonMappingException, IOException {
//
//				if ( (file).exists() != false) {
//					System.out.println("invalid address book");
//				
//				}else {
					
				Person_Pojo person = new Person_Pojo();
				Address_Pojo address = new Address_Pojo();
				PhoneNumber phone = new PhoneNumber();
				
				System.out.println("Enter street:");
				String street = util.printstring();
				System.out.println("Enter city:");
				String city = util.printstring();
				System.out.println("Enter State:");
				String state = util.printstring();
				System.out.println("Enter zip");
				int zip = util.printint();
				System.out.println("Enter mobile number:");
				long phoneNumber = util.printlong();
				phone.setMobileNumber(phoneNumber);
				address.setStreet(street);
				address.setCity(city);
				address.setState(state);
				address.setZip(zip);
				person.setFirstName(firstName);
				person.setLastName(lastName);
				person.setAddress(address);
				person.setPhoneNumber(phone);
				AddressBook_Main manager = new AddressBook_Main();
				manager.save1(person, file);
				}
				

			public static void editPerson(String name, File file) throws JsonMappingException, IOException {
				int count = 0;
				int tempCount = 0;
				String temp = "";
				int stop = 0;
				
				LinkedList<Person_Pojo> details = mapper.readValue(file,new TypeReference<LinkedList<Person_Pojo>>() {
						});
				for (Person_Pojo person : details) {
					if (person.getFirstName().equals(name)) { 
						tempCount = count;
					}
					count++;
				}
				while (stop != 2) {
					System.out.println("1. for edit first name");
					System.out.println("2. for edit last name");
					System.out.println("3. for edit address and phone number");
					count = util.printint();
					switch (count) {
					case 1:
						
						System.out.println("Enter new first name :");
						firstName = util.printstring();
						details.get(tempCount).setFirstName(firstName); 

						break;
					case 2:
						
						System.out.println("Enter new last name :");
						lastName = util.printstring();
						details.get(tempCount).setLastName(lastName); 

						break;
					case 3:
						
						System.out.println("press \n 1. for edit street");
						System.out.println("2. for edit city");
						System.out.println("3. for edit state");
						System.out.println("4 . for edit zip code");
						System.out.println("5 . for edit phone number");
						int choice = util.printint();
						if (choice == 1) {
							System.out.println("Enter street:");
							temp = util.printstring();
							details.get(tempCount).getAddress().setStreet(temp); 

						}
						if (choice == 2) {
							System.out.println("Enter city:");
							temp = util.printstring();
							details.get(tempCount).getAddress().setCity(temp); 


						}
						if (choice == 3) {
							System.out.println("Enter state:");
							temp = util.printstring();
							details.get(tempCount).getAddress().setState(temp);

						}
						if (choice == 4) {
							System.out.println("Enter zip:");
							int zip =util.printint();
							details.get(tempCount).getAddress().setZip(zip);
							;

						}
						if (choice == 5) {
							System.out.println("Enter mobile number:");
							Long phoneNumber = util.printlong();
							details.get(tempCount).getPhoneNumber().setMobileNumber(phoneNumber); 

						}
					}
					System.out.println("for stop press 2. or for continue press any number");
					stop =util.printint();
				}
				if (stop == 2) {
					
					mapper.writeValue(file,details);
				}
			}

			
			public void save1(Person_Pojo person, File file) throws JsonMappingException, IOException {

				if ( file.length() == 0) {
					LinkedList<Person_Pojo> newPerson = new LinkedList<>();
					newPerson.add(person);
					
					mapper.writeValue(file,newPerson);
					if (file.length() != 0) {
						
						System.out.println("data added successfully");
					} else {
						System.out.println("unsuccessful");
					}
				} else {
					long preFileLength = file.length();
					LinkedList<Person_Pojo> multiple = mapper.readValue(file,
							new TypeReference<LinkedList<Person_Pojo>>() {
							});
					multiple.add(person);
					mapper.writeValue(file,multiple);
					long afterWriteLength = file.length();
					if (preFileLength < afterWriteLength) {
						System.out.println("data added successfully");
					} else {
						System.out.println("data not fill in file");
					}
				}
			}

			
		
			public void add() throws JsonMappingException, IOException {
			
				System.out.println("Enter person first name:");
				firstName = util.printstring();
				System.out.println("Enter last name");
				lastName = util.printstring();
				System.out.println("Enter address book name");
				bookName = util.printstring();
				File file=null;
				addPersonToContact(file, firstName, lastName);
			}

			
			public void delete(String name, File file) throws JsonMappingException, IOException {
				LinkedList<Person_Pojo> details = mapper.readValue( file,
						new TypeReference<LinkedList<Person_Pojo>>() {
						});
				int count = 0;
				boolean result = true;
				
				for (Person_Pojo person : details) {
					if (person.getFirstName().equals(name)) { 
						details.remove(count);
						System.out.println("person successfully removed");
						mapper.writeValue(
								new File(Path + file),
								details);
					}
					count++;
				}
			
				for (Person_Pojo person : details) {
					if (person.getFirstName().equals(name)) {
						result = false;
					}
				}
				if (result == true) {
					System.out.println("person successfully remove");
				}
			}

			
			public void sortByName(File file) throws JsonMappingException, IOException {

				LinkedList<Person_Pojo> details = mapper.readValue(file,
						new TypeReference<LinkedList<Person_Pojo>>() {
						});
				LinkedList<String> name = new LinkedList<>();
				int count = 0;
				for (Person_Pojo person : details) {
					name.add(person.getFirstName());

				}
				
				String names[] = new String[name.size()];

				
				for (String value : name) {
					names[count] = value;
					count++;
				}
				Arrays.sort(names);

				System.out.println("sort by first name");

				
				for (String s : names) {
					int count2 = 0;
					while (count2 < details.size()) {
						if (details.get(count2).getFirstName().equals(s)) {
							System.out.println(details.get(count2));
						}
						count2++;
					}

				}
			}
	
			public void sortByZip(File file) throws JsonMappingException, IOException {
				LinkedList<Person_Pojo> details = mapper.readValue(file,
						new TypeReference<LinkedList<Person_Pojo>>() {
						});
				LinkedList<Integer> zip = new LinkedList<>();
				int count = 0;
				for (Person_Pojo person : details) {
					zip.add(person.getAddress().getZip());

				}
				int zipArray[] = new int[zip.size()];
				for (int value : zip) {
					zipArray[count] = value;
					count++;
				}
				Arrays.sort(zipArray);

				System.out.println("sort by zip");
				// count = 0;

				for (int s : zipArray) {
					int count2 = 0;
					while (count2 < details.size()) {
						if (details.get(count2).getAddress().getZip() == s) {
							System.out.println(details.get(count2));
						}
						count2++;
					}

				}

			}

			public void print(File addressBook, String name) throws JsonMappingException, IOException {
				LinkedList<Person_Pojo> details = mapper.readValue(addressBook,
						new TypeReference<LinkedList<Person_Pojo>>() {
						});
				for (Person_Pojo person : details) {
					if (person.getFirstName().equals(name)) {
						System.out.println(person);
					}
				}
			}

			
			public static File[] openFile() {
				File folder = new File(Path);
				return folder.listFiles();
			}
			
			
			public static void printFileNames()
			{
				File file[] = openFile(); 
				System.out.println("\ngot following json files at mentioned location...\nplz select proper one:");
				for (File file1 : file) {
					String name = file1.getName();
					if (name.contains(".json")) 
						System.out.println(name); 
				}
				System.out.println();
			}
			
		
			public static void openAddressbook(String addressbook) throws JsonMappingException, IOException {
				LinkedList<Person_Pojo> details = mapper.readValue(
						new File(Path  + addressbook),
						new TypeReference<LinkedList<Person_Pojo>>() {
						});
				System.out.println(details);

			}

			@Override
			public void save1(Person_Pojo person, String addressBook) throws JsonMappingException, IOException {
				
			}

			@Override
			public void delete(String name, String addressBook)
					throws JsonMappingException, IOException, JsonMappingException, IOException {
				
				
			}

			@Override
			public void sortByName(String bookName) throws JsonMappingException, IOException {
					
			}

			@Override
			public void sortByZip(String bookName) throws JsonMappingException, IOException {
				
				
			}

			@Override
			public void print(String bookName, String name) throws JsonMappingException, IOException {
				// TODO Auto-generated method stub
				
			}

	}
	



