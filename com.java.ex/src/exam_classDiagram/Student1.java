package exam_classDiagram;

import java.util.Vector;

public class Student1 {
	//필드
	private Vector <Course1> courses;
	private String studentName;
	
	//생성자
	public Student1() {
		
	}
	
	
	//메소드
	public void registerCourse(Course1 course1){
		this.courses.add(course1);
	}
	
	public void dropCourse(Course1 course1) {
		this.courses.remove(course1);
	}
	
	public Vector<Course1> getCourse() {
		return this.courses;
	}

	
}
