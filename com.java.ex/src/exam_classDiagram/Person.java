package exam_classDiagram;

public class Person {
	//Phone 배열
	private Phone[] phones;
	//생성자
	Person(){
		phones= new Phone[2];
	}
	
	//메소드
		//배열 반환
	public Phone[] getPhones() {
		return this.phones;
	}
		//특정 인덱스의 배열 요소 반환
	public Phone getPhones(int index) {
		return this.phones[index];
	}
		//배열 설정
	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}
		//특정 인덱스의 배열 요소 설정
	public void setPhones(int index, Phone phone) {
		this.phones[index] = phone;
	}
	
	

}
