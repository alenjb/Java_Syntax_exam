package Contact_program;

public class SmartPhone { 
	//회원정보를 저장할 Contact형의 static 배열
	public static Contact [] arr=new Contact[5];
	
	
	//생성자
	public SmartPhone() {}
	
	//회원정보 저장 메소드
	public static boolean save(Contact contact, int count) {
		for(int i=0; i<=count; i++) {
			if(SmartPhone.arr[i]==null) {
				SmartPhone.arr[i]=contact;
				//성공
				return true;
			}
		 //실패
		} return false;
	}
	//수정 메소드
	public static boolean update(String name, String newPhone, int count) {
		for(int i=0; i<=count; i++) {
			if(SmartPhone.arr[i]!=null &&SmartPhone.arr[i].getName().equals(name) ) {
				SmartPhone.arr[i].setPhone(newPhone);
				return true;
			}
		}
		return false;
	}
	//삭제 메소드
	public static boolean delete(String name, int count) {
		for(int i=0; i<count; i++) {
			if(SmartPhone.arr[i].getName().equals(name)) {
				//떙겨주기
				for (int k=i; k<count; k++) {
					arr[k]=arr[k+1];
				}
				return true;

			}
			
		}
		return false;
	}
	//전체 출력 메소드
	public static void printAll(int count) {
		System.out.println(SmartPhone.arr[0].getName());
		for(int i=0; i<count; i++) {
			if(SmartPhone.arr[i]!=null) {
				if(SmartPhone.arr[i] instanceof CompanyContact) {
					Contact contact= SmartPhone.arr[i];
					contact.PrintContact(contact);
					
				}
				else if(SmartPhone.arr[i] instanceof CustomerContact) {
					Contact contact= SmartPhone.arr[i];
					contact.PrintContact(contact);

				}
				else {
				
				System.out.println("이름: "+SmartPhone.arr[i].getName());
				System.out.println("번호: "+SmartPhone.arr[i].getPhone());
				System.out.println("이메일: "+SmartPhone.arr[i].getEmail());
				System.out.println("주소: "+SmartPhone.arr[i].getAddress());
				System.out.println("생일: "+SmartPhone.arr[i].getBirthday());
				System.out.println("그룹: "+SmartPhone.arr[i].getGroup());
				System.out.println("---------------------------------");
				}
			}
		}
		return;
	}

	//출력 메소드
	public void PrintArr(Contact contact) {
		System.out.println("이름: "+contact.getName());
		System.out.println("전화번호: "+contact.getPhone());
		System.out.println("이메일: "+contact.getEmail());
		System.out.println("주소: "+contact.getAddress());
		System.out.println("생일: "+contact.getBirthday());
		System.out.println("그룹: "+contact.getGroup());
	}
	
	//검색 메소드
	public static boolean search(String name, int count) {
		for(int i=0; i<=count; i++) {
			if(SmartPhone.arr[i]!=null && SmartPhone.arr[i].getName().contentEquals(name)) {
				System.out.println(name+"님의 연락처: "+ SmartPhone.arr[i].getPhone());
				return true;
				}
			}
			return false;
	}


	
	

}//ce
