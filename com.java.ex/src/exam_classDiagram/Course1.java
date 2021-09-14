package exam_classDiagram;

import java.util.Vector;

public class Course1 {
	//필드
	private Vector <Student1> students;
	private String courseName;
	
	//생성자
	public Course1() {}
	
	//메소드
	public void addStudent(Student1 student1 ) {
		this.students.add(student1);
	}
	
	public void removeStudent(Student1 student1) {
		this.students.remove(student1);
	}
	
	public Vector<Student1> getStudents() {
		return this.students;
	}
	public String getName() {
		return this.courseName;
	}
	
	
}
