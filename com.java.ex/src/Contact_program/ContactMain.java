package Contact_program;

import java.util.Scanner;

public class ContactMain {
	//메소드
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		//개인정보 입력받기
		Contact contact1= new CompanyContact();
		contact1=contact1.ScanFunc(new CompanyContact());
		contact1.PrintContact(contact1);
		
		Contact contact2= new CustomerContact();
		contact2=contact2.ScanFunc(new CustomerContact());
		contact2.PrintContact(contact2);
		SmartPhoneMain.printAll();
		
		
//		//저장
//		first.save(first);		
		//출력
//		first.PrintContact(first);
		
		
		
		
	}//me
	

}
