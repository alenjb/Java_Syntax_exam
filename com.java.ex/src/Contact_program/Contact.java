package Contact_program;

public class Contact {
//	main
//	getter,setter
//	값을 바꾸는 메소드

	
	//필드
	private String name;
	private String phone;
	private String email;
	private String address;
	private String birthday;
	private String group;
	
	//생성자
	public Contact() {}
	public Contact(String name, String phone, String email, String address
			, String birthday, String group) {
		this.name=name;
		this.phone=phone;
		this.email=email;
		this.address=address;
		this.birthday=birthday;
		this.group=group;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	//출력 메소드
	public void PrintContact(Contact contact) {
		System.out.println("이름: "+contact.getName());
		System.out.println("전화번호: "+contact.getPhone());
		System.out.println("이메일: "+contact.getEmail());
		System.out.println("주소: "+contact.getAddress());
		System.out.println("생일: "+contact.getBirthday());
		System.out.println("그룹: "+contact.getGroup());
	}
	

	//회원정보 저장 메소드
//	public boolean save(Contact contact, int count) {
//		for(int i=0; i<=count; i++) {
//			if(SmartPhone.arr[i]==null) {
//				SmartPhone.arr[i]=contact;
//				//성공
//				return true;
//			}
//		 //실패
//		} return false;
//	}
	
	
	
}//ce
