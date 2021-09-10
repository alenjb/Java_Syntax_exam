package Contact_program;

public class SmartPhone { 
	//회원정보를 저장할 Contact형의 static 배열
	public static Contact [] arr=new Contact[100];
	
	
	//생성자
	public SmartPhone() {}
	
	//회원정보 저장 메소드
	public void save(Contact contact) {
		for(int i=0; i<100; i++) {
			if(arr[i]==null) {
				arr[i]=contact;
				break;
			}
			
		}
	}
	//수정 메소드
	public boolean update(String name, String newPhone) {
		for(int i=0; i<100; i++) {
			if(SmartPhone.arr[i]!=null &&SmartPhone.arr[i].getName().equals(name) ) {
				SmartPhone.arr[i].setPhone(newPhone);
				return true;
			}
		}
		return false;
	}
	//삭제 메소드
	public boolean delete(String name) {
		for(int i=0; i<100; i++) {
			if(SmartPhone.arr[i].getName().equals(name)) {
				//떙겨주기
				for (int k=i; !arr[k+1].equals(null); k++) {
					arr[k]=arr[k+1];
				}
				return true;

			}
			
		}
		return false;
	}
	
	

}//ce
