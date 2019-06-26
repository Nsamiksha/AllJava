package AddressBook;

	public class PhoneNumber {
	private long mobileNumber;

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "PhoneNumber [mobileNumber=" + mobileNumber + "]";
	}

	}
	