package Contact_program;
import java.util.Scanner;

public class SmartPhoneMain {
	//스마트폰 인스턴스 생성
	public static SmartPhone smartphone= new SmartPhone();

	public static void main(String[] args) {
		//스캐너 생성
		Scanner scanner= new Scanner(System.in);
		int count=ContactMain.main(args);
		//개인정보 입력받기(기본 2번)
		
//		for(int i=0; i<2; i++) {
//			System.out.print("이름: "); String name =scanner.next();
//			System.out.print("전화번호: "); String phone =scanner.next();
//			System.out.print("이메일: "); String email =scanner.next();
//			System.out.print("주소: "); String address =scanner.next();
//			System.out.print("생일 "); String birthday =scanner.next();
//			System.out.print("그룹: "); String group =scanner.next();
//			
//			//contact 객체 생성해서 저장
//			Contact contact=new Contact(name, phone, email, address, birthday, group);
//			count++;
//			smartphone.save(contact, count);
//			System.out.println("데이터가 저장되었습니다.("+count+")");
//		}	
		
		//메뉴
		
			
		
		while(true) {//무한반복
			System.out.println("---------------------------");
			System.out.println("1. 회사 연락처 등록");
			System.out.println("2. 거래처 연락처 등록");
			System.out.println("3. 모든 연락처 출력");
			System.out.println("4. 연락처 검색");
			System.out.println("5. 연락처 삭제");
			System.out.println("6. 연락처 수정");
			System.out.println("7. 프로그래밍 종료");
			String ch=scanner.next();
			switch (ch) {
				case "1":
					Contact companyContact1= new CompanyContact();
					companyContact1=inputFunc(companyContact1);
					CompanyContact companyContact2= (CompanyContact)companyContact1;
					System.out.print("회사이름: "); companyContact2.setCompanyName(scanner.next());
					System.out.print("부서이름: "); companyContact2.setTeamName(scanner.next());
					System.out.print("직급: ");  companyContact2.setPositon(scanner.next());

					//저장
					boolean firstResult=SmartPhone.save(companyContact2,count);
					if (firstResult==true) {
						count=count+1;
						System.out.println("데이터가 저장되었습니다. ("+count+")");
					System.out.println("---------------------------");}
					
					break;
					
				case "2":
					Contact customerContact1= new CustomerContact();
					customerContact1=inputFunc(customerContact1);
					CustomerContact customerContact2= (CustomerContact)customerContact1;
					System.out.print("거래처이름: "); customerContact2.setAccountName(scanner.next());
					System.out.print("거래품목: "); customerContact2.setItem(scanner.next());
					System.out.print("직급: ");  customerContact2.setPositon(scanner.next());

					//저장
					boolean secondResult=SmartPhone.save(customerContact2,count);
					if (secondResult==true) {
						count=count+1;
						System.out.println("데이터가 저장되었습니다. ("+count+")");
					System.out.println("---------------------------");}
					break;

				case "3":
					//전체출력
					SmartPhone.printAll(count);
					break;
					
				case "4":
					//검색
					System.out.println("검색할 연락처의 이름을 입력하세요");
					String inputname1=scanner.next();
					boolean searchResult=SmartPhone.search(inputname1, count);
					if(searchResult) System.out.println("연락처 검색 성공");
					else System.out.println("해당 연락처를 찾을 수 없습니다.");
					
					break;
		
				case "5":
					//삭제
					System.out.println("삭제할 연락처의 이름을 입력하세요");
					String inputname2=scanner.next();
					boolean deleteResult= SmartPhone.delete(inputname2,count);
					count--;
					if(deleteResult) System.out.println("삭제 성공");
					else System.out.println("해당 연락처를 찾을 수 없습니다.");
					break;
		
				case "6":
					//연락처 수정
					System.out.println("수정할 연락처의 이름을 입력하세요");
					String inputname3=scanner.next();
					System.out.println("새로운 번호를 입력하세요");
					String inputphone=scanner.next();
					boolean result3= SmartPhone.update(inputname3, inputphone, count);
					if(result3) System.out.println("수정 성공");
					else System.out.println("해당 연락처를 찾을 수 없습니다.");
					break;
					
				case "7":
					//프로그램 종료
					System.out.println("프로그램이 종료됩니다.");
					return;
					
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
		}}
		
	}//me
	
	
	//입력 메소드
	public static Contact inputFunc(Contact contact) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("이름: "); String name =scanner.next();
		System.out.print("전화번호: "); String phone =scanner.next();
		System.out.print("이메일: "); String email =scanner.next();
		System.out.print("주소: "); String address =scanner.next();
		System.out.print("생일 "); String birthday =scanner.next();
		System.out.print("그룹: "); String group =scanner.next();
		contact.setName(name);
		contact.setPhone(phone);
		contact.setEmail(email);
		contact.setAddress(address);
		contact.setBirthday(birthday);
		contact.setGroup(group);
		return contact;
	}

}//ce
