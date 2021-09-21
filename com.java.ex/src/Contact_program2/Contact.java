package Contact_program2;

public class Contact {
	//필드
	private String name;
	private String phoneNumber;
	private String emailAddress;
	private String group;
	private String address;
	private String birthday;
	
	//생성자
	public Contact(String name, String phoneNumber, String emailAddress, String group, String address,
			String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.group = group;
		this.address = address;
		this.birthday = birthday;
	}
	public Contact() {}
	
	
	//메소드
	public void printCotact(Contact contact) {
		System.out.println("이름: "+contact.name);
		System.out.println("휴대폰 번호: "+contact.phoneNumber);
		System.out.println("이메일: "+contact.emailAddress);
		System.out.println("그룹: "+contact.group);
		System.out.println("주소: "+contact.address);
		System.out.println("생일: "+contact.birthday);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
	
	

}
