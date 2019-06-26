package AddressBook;

public class Person_Pojo {

		private String firstName;
		private String lastName;
		private Address_Pojo address;
		private PhoneNumber phoneNumber;
		@Override
		public String toString() {
			return "PersonalDetails [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
					+ ", phoneNumber=" + phoneNumber + "]";
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public Address_Pojo getAddress() {
			return address;
		}
		public void setAddress(Address_Pojo address) {
			this.address = address;
		}
		public PhoneNumber getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(PhoneNumber phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		

	}
	