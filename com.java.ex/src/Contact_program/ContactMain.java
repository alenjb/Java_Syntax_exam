package Contact_program;

import java.util.Scanner;

public class ContactMain {
	//메소드
	public static int main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		int count=0;
		
		//개인정보 입력받기
		Contact contact1= new CompanyContact();
		contact1=SmartPhoneMain.inputFunc(contact1);
		CompanyContact contact2= (CompanyContact)contact1;
		System.out.print("회사이름: "); contact2.setCompanyName(scanner.next());
		System.out.print("부서이름: "); contact2.setTeamName(scanner.next());
		System.out.print("직급: ");  contact2.setPositon(scanner.next());
		System.out.println("---------------------------");

		boolean result1=SmartPhone.save(contact2,count);
		if (result1==true) {
			count=count+1;
			System.out.println("데이터가 저장되었습니다. ("+count+")");
		System.out.println("---------------------------");
}
		
		Contact contact3= new CustomerContact();
		contact3=SmartPhoneMain.inputFunc(contact3);
		CustomerContact contact4= (CustomerContact)contact3;
		System.out.print("거래처이름: "); contact4.setAccountName(scanner.next());
		System.out.print("거래품목: "); contact4.setItem(scanner.next());
		System.out.print("직급: ");  contact4.setPositon(scanner.next());
		System.out.println("---------------------------");

		boolean result2=SmartPhone.save(contact4, count);
		if (result2==true) {
			count=count+1;
			System.out.println("데이터가 저장되었습니다.("+count+")");
			System.out.println("---------------------------");
		}
		
		return count;
		

		
		
		
		
	}//me
	
	

}
