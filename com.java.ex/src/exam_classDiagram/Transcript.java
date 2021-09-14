package exam_classDiagram;

import java.util.Vector;

public class Transcript {
	//필드
	public static Vector<Transcript> transcripts =new Vector<Transcript>();
	private String studentName;
	private String courseName;
	private String date;
	private String grade;
	
	//생성자
	public Transcript(Student2 student2, Course2 course2) {
		this.studentName= student2.getStudentName();
		this.courseName= course2.getName();
	}
	
	//메소드
	public Student2 getStudent() {
		return new Student2(this.studentName);
	}
	
	public Course2 getCourse() {
		return new Course2(this.courseName);
	}
	
	public void setDate(String date) {
		this.date=date;
	}
	
	public String getDate() {
		return this.date;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
}
