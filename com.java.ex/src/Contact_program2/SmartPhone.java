package Contact_program2;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartPhone {
	//필드
	ArrayList<Contact> contactArr;
	Scanner scanner;
	//생성자
	public SmartPhone() {
		contactArr= new ArrayList<Contact>();
		scanner= new Scanner(System.in);
	}
	
	//메소드
		//저장 메소드
	void save(Contact contact) {
		contactArr.add(contact);
	}
		//수정 메소드
	void update() {
		System.out.print("수정할 연락처 이름: ");
		String inputOldName=scanner.next();
		System.out.print("\n새로운 이름");
		String inputNewName=scanner.next();
		System.out.print("\n새로운 전화번호: ");
		String inputPhoneNumber=scanner.next();
		for(int i=0; i<contactArr.size(); i++) {
			if(contactArr.get(i).getName().contentEquals(inputOldName)) {
				contactArr.get(i).setName(inputNewName);
				contactArr.get(i).setPhoneNumber(inputPhoneNumber);			break;}
		}
	}
	
		//삭제 메소드
	void delete(String name) {
		for(int i=0; i<contactArr.size(); i++) {
			if(contactArr.get(i).getName().contentEquals(name)) {
				contactArr.remove(i);
				break;
			}}
	}
		//검색 메소드
	void search(String name) {
		for(int i=0; i<contactArr.size(); i++) {
			if(contactArr.get(i).getName().contentEquals(name)) {
				contactArr.get(i).printCotact(contactArr.get(i));
				break;
			}
			
		}
	}
	
	
		//출력 메소드
	void print(Contact contact) {
		contact.printCotact(contact);
	}
		//전체 출력 메소드
	void printAll() {
		for(int i=0; i<contactArr.size();i++) {
			contactArr.get(i).printCotact(contactArr.get(i));
			System.out.println("----------------------");
		}
	}
	
		//입력메소드
	public Contact inputContact(int type) {
		scanner=new Scanner(System.in);
		System.out.println("-------------------");
		System.out.print("이름: ");
		String name= scanner.next();
		System.out.print("휴대폰 번호: ");
		String phoneNumber= scanner.next();
		System.out.print("이메일 주소: ");
		String emailAddress= scanner.next();
		System.out.print("그룹: ");
		String group= scanner.next();
		System.out.print("주소: ");
		String address= scanner.next();
		System.out.print("생일: ");
		String birthday= scanner.next();
		
		if(type==1) {
			System.out.print("회사이름: ");
			String companyName= scanner.next();
			System.out.print("부서이름: ");
			String teamName= scanner.next();
			System.out.print("직급: ");
			String position= scanner.next();
			return new CompanyContact(name, phoneNumber, emailAddress, group, address, birthday, companyName, teamName, position);
		}
		else if(type==2) {
			System.out.print("거래처이름: ");
			String customerName= scanner.next();
			System.out.print("거래품목: ");
			String itemName= scanner.next();
			System.out.print("직급: ");
			String position= scanner.next();
			return new CustomerContact(name, phoneNumber, emailAddress, group, address, birthday, customerName, itemName, position);
		}
		else {
			return new Contact(name, phoneNumber, emailAddress, group, address, birthday);
		}
	}
	
}
