package Contact_program2;

public class CustomerContact extends Contact{
	//필드
	String customerName;
	String itemName;
	String position;
	
	//셍성자
	public CustomerContact() {
	}
	public CustomerContact(String name, String phoneNumber, String emailAddress,
			String group, String address, String birthday,
			String customerName, String itemName, String position) {
		super(name, phoneNumber, emailAddress, group, address, birthday);
		this.customerName= customerName;
		this.itemName= itemName;
		this.position= position;
	}
	
	//메소드
	@Override
	public void printCotact(Contact contact) {
		super.printCotact(contact);
		System.out.println("거래처이름: "+this.customerName);
		System.out.println("거래품목: "+this.itemName);
		System.out.println("직급: "+this.position);

	}
	public String getcustomerName() {
		return customerName;
	}
	public void setcustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getitemName() {
		return itemName;
	}
	public void setitemName(String itemName) {
		this.itemName = itemName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}


}
