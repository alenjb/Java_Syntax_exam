package Contact_program;

import java.util.Scanner;

public class CustomerContact extends Contact{
	//거래처이름, 거래품목, 직급
	//정보출력 오버라이딩

	private String accountName;
	private String item;
	private String positon;
	
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
	//입력메소드
		@Override
		public Contact ScanFunc(Contact contact) {
			Scanner scanner= new Scanner(System.in);
			super.ScanFunc(contact);
			//강제 형변환
			CustomerContact customerContact= (CustomerContact)contact;
			System.out.print("거래처 이름: "); String acoountName=scanner.next();
			System.out.print("거래품목: "); String item =scanner.next();
			System.out.println("직급: "); String position =scanner.next();
			customerContact.accountName=acoountName;
			customerContact.item= item;
			customerContact.positon=position;
			return customerContact;
			
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
