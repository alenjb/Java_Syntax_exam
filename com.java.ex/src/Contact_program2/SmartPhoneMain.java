package Contact_program2;

import java.util.Scanner;


public class SmartPhoneMain {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		SmartPhone phone= new SmartPhone();
		System.out.println("데이터 2개를 입력합니다.");
		phone.save(phone.inputContact(1));
		phone.save(phone.inputContact(2));
		while(true) {
			printMenu();
			String ch= scanner.next();
			switch(ch) {
			case "1":
				phone.save(phone.inputContact(1));
				break;

			case "2":
				phone.save(phone.inputContact(2));
				break;
			case "3":
				phone.printAll();
				break;
			case "4":
				System.out.print("검색할 이름을 입력하세요: ");
				String searchName= scanner.next();
				phone.search(searchName);
				break;
			case "5":
				System.out.print("삭제할 이름을 입력하세요: ");
				String deleteName= scanner.next();
				phone.delete(deleteName);
				break;
				
			case "6":
				phone.update();
				break;
			
			case "7":
				scanner.close();
				return;
				
			default:
				break;
			}

		}
		
		
		
		
	}
	
	static void printMenu() {
		System.out.println("-----------------");
		System.out.println("1.연락처 등록(회사)");
		System.out.println("2.연락처 등록(거래처)");
		System.out.println("3.모든 연락처 출력");
		System.out.println("4.연락처 검색");
		System.out.println("5.연락처 삭제");
		System.out.println("6.연락처 수정");
		System.out.println("7.프로그램 종료");
		System.out.println("-----------------");
	}
}
