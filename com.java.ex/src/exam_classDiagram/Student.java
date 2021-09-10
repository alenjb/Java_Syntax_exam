package exam_classDiagram;

import java.util.Vector;

public class Student {
	Vector<Course> courses;
	String name;
	//생성자
	public Student(String name) {
		this.name=name;
		courses =new Vector<Course>();		
	}
	//등록 메소드
	public void registerCourse(Course course) {
		courses.add(course);
	}
	//삭제 메소드
	public void dropCourse(Course course) {
		courses.remove(course);
	}
	
	
	
}
