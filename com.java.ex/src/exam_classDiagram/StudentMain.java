package exam_classDiagram;

public class StudentMain {
	public static void main(String[] args) {
		Student student= new Student("이정빈");
		Course course= new Course("수학");
		student.registerCourse(course);
		System.out.println(student.courses.get(0).coursename);
	}
}
