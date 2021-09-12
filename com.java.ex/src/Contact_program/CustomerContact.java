package Contact_program;

import java.util.Scanner;

public class CustomerContact extends Contact{
	//거래처이름, 거래품목, 직급
	//정보출력 오버라이딩

	private String accountName;
	private String item;
	private String positon;
	
	
	public CustomerContact() {}
	public CustomerContact(String name, String phone, String email, String address
			, String birthday, String group, String accountName, String item, String positon) {
		super();
		this.accountName = accountName;
		this.item = item;
		this.positon = positon;
	}
	//재정의된 출력 메소드
	@Override
	public void PrintContact(Contact contact) {
		super.PrintContact(contact);
		//강제 형변환
		CustomerContact customerContact= (CustomerContact)contact;
		System.out.println("거래처이름: "+ customerContact.getAccountName());
		System.out.println("거래품목: "+customerContact.getItem());
		System.out.println("직급: "+customerContact.getPositon());
		System.out.println("---------------------------");
	}
	
	
	//getter & setter
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getPositon() {
		return positon;
	}
	public void setPositon(String positon) {
		this.positon = positon;
	}
	
}
