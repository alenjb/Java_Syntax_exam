package Contact_program;
import java.util.Scanner;

public class SmartPhoneMain {
	//스마트폰 인스턴스 생성
	public static SmartPhone smartphone= new SmartPhone();

	public static void main(String[] args) {
		//스캐너 생성
		Scanner scanner= new Scanner(System.in);
		//개인정보 입력받기(기본 2번)
		for(int i=0; i<2; i++) {
			System.out.print("이름: "); String name =scanner.next();
			System.out.print("전화번호: "); String phone =scanner.next();
			System.out.print("이메일: "); String email =scanner.next();
			System.out.print("주소: "); String address =scanner.next();
			System.out.print("생일 "); String birthday =scanner.next();
			System.out.println("그룹: "); String group =scanner.next();
			
			//contact 객체 생성해서 저장
			Contact contact=new Contact(name, phone, email, address, birthday, group);
			smartphone.save(contact);
			System.out.println("데이터가 저장되었습니다.("+(i+1)+")");
		}	
		
		//메뉴
		while(true) {//무한반복
			System.out.println("---------------------------------");
			System.out.println("1. 연락처 등록");
			System.out.println("2. 모든 연락처 출력");
			System.out.println("3. 연락처 검색");
			System.out.println("4. 연락처 삭제");
			System.out.println("5. 연락처 수정");
			System.out.println("6. 프로그래밍 종료");
			int ch=scanner.nextInt();
			switch (ch) {
				case 1:
					System.out.print("이름: "); String name =scanner.next();
					System.out.print("전화번호: "); String phone =scanner.next();
					System.out.print("이메일: "); String email =scanner.next();
					System.out.print("주소: "); String address =scanner.next();
					System.out.print("생일 "); String birthday =scanner.next();
					System.out.println("그룹: "); String group =scanner.next();
					
					//저장
					Contact contact=new Contact(name, phone, email, address, birthday, group);
					smartphone.save(contact);
					System.out.println("데이터가 저장되었습니다.");
					break;
					
				case 2:
					//전체출력
					printAll();
					break;
					
				case 3:
					//검색
					System.out.println("검색할 연락처의 이름을 입력하세요");
					String inputname1=scanner.next();
					boolean result=search(inputname1);
					if(result) System.out.println("연락처 검색 성공");
					else System.out.println("해당 연락처를 찾을 수 없습니다.");
					
					break;
		
				case 4:
					//삭제
					System.out.println("삭제할 연락처의 이름을 입력하세요");
					String inputname2=scanner.next();
					boolean result2= smartphone.delete(inputname2);
					if(result2) System.out.println("삭제 성공");
					else System.out.println("해당 연락처를 찾을 수 없습니다.");
					break;
		
				case 5:
					//연락처 수정
					System.out.println("수정할 연락처의 이름을 입력하세요");
					String inputname3=scanner.next();
					System.out.println("새로운 번호를 입력하세요");
					String inputphone=scanner.next();
					boolean result3= smartphone.update(inputname3, inputphone);
					if(result3) System.out.println("수정 성공");
					else System.out.println("해당 연락처를 찾을 수 없습니다.");
					break;
					
				case 6:
					//프로그램 종료
					return;
					
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
		}}
		
	}//me
	
	//전체 출력 메소드
	public static void printAll() {
		System.out.println(SmartPhone.arr[0].getName());
		for(int i=0; i<100; i++) {
			if(SmartPhone.arr[i]!=null) {
				System.out.println("이름: "+SmartPhone.arr[i].getName());
				System.out.println("번호: "+SmartPhone.arr[i].getPhone());
				System.out.println("이메일: "+SmartPhone.arr[i].getEmail());
				System.out.println("주소: "+SmartPhone.arr[i].getAddress());
				System.out.println("생일: "+SmartPhone.arr[i].getBirthday());
				System.out.println("그룹: "+SmartPhone.arr[i].getGroup());
				System.out.println("---------------------------------");

			}
		}
		return;
	}
	
	//검색 메소드
	public static boolean search(String name) {
		for(int i=0; i<100; i++) {
			if(SmartPhone.arr[i]!=null && SmartPhone.arr[i].getName().contentEquals(name)) {
				System.out.println(name+"님의 연락처: "+ SmartPhone.arr[i].getPhone());
				return true;
				}
			}
			return false;
	}
	public void input_contact(Scanner scanner) {
		
	}
}//ce
