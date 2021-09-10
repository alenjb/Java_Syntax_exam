package exam_extends_class;

public class Student extends People{
	public int studentsNo;

	public Student(String name, String ssn, int studentsNo) {
		super(name, ssn);
		this.studentsNo = studentsNo;
	}
	
}
