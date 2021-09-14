package exam_classDiagram;

public class Student2 {
	//필드
	private String studentName;
	
	//생성자
	public Student2(String name) {
		this.studentName=name;
	}
	
	//메소드
	public void addTranscript(Transcript transcript) {
		Transcript.transcripts.add(transcript);
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	

}
