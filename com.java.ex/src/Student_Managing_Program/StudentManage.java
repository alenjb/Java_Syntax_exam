package Student_Managing_Program;

import java.util.ArrayList;

public class StudentManage {

	//필드
	String name;
	String age;
	String num;
	String subject;
	
	//학생정보 담을 어레이리스트
	static ArrayList<StudentManage> StudentList= new ArrayList<StudentManage>();
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((num == null) ? 0 : num.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentManage other = (StudentManage) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}

	
	
	//생성자
	public StudentManage(String name, String age, String num, String subject) {
		this.name = name;
		this.age = age;
		this.num = num;
		this.subject = subject;
	}
	
	
	//저장 메소드
	public boolean save(StudentManage studentManage) {
			StudentList.add(studentManage);
			return true;
		}
	//수정 메소드
	public boolean update(StudentManage studentManage) {
		for(StudentManage studentManage2: StudentList) {
			if(studentManage2.equals(studentManage)){
				//왜 그냥 equals는 안되나요?? 주소값이라서? ㅇㅇ
				//학생목록에서 해당 객체 위치 찾기
				int index_num= StudentList.indexOf(studentManage2);
				//해당 객체 학생목록에서 삭제
				StudentList.remove(index_num);
				//새로운 이찬원 갹체 생성
				StudentManage news= new StudentManage("이찬원","26","20201237","드론 전문가 과정");
				//이찬원 객체를 휴학생 리스트에 추가 
				OtherStudent.OtherList.add(index_num, news);
				return true;
			}
			
		}
		return false;
	}
	
	
}
