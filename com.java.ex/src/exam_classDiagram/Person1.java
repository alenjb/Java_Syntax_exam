package exam_classDiagram;

public class Person1 {
	//필드
	private Phone1 homePhones;
	private Phone1 officePhone;
	
	//생성자
	Person1(){
		homePhones= new Phone1();
		officePhone= new Phone1();
		}
	
	//메소드
		//HomePhones 반환
	public Phone1 getHomePhones() {
		return homePhones;
	}
		//HomePhones 설정
	public void setHomePhones(Phone1 homePhones) {
		this.homePhones = homePhones;
	}
		//OfficePhone 반환
	public Phone1 getOfficePhone() {
		return officePhone;
	}
		//OfficePhone 설정
	public void setOfficePhone(Phone1 officePhone) {
		this.officePhone = officePhone;
	}
	
	

}
