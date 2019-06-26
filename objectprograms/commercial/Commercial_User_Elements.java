package commercial;

public class Commercial_User_Elements {
	private String emailID;
	private String userName;
	private long phoneNO;
	private String date;
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getPhoneNO() {
		return phoneNO;
	}
	public void setPhoneNO(long phoneNO) {
		this.phoneNO = phoneNO;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Commercial_User_Elements [emailID=" + emailID + ", userName=" + userName + ", phoneNO=" + phoneNO
				+ ", date=" + date + "]";
	}
	
}
