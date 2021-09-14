package exam_classDiagram;


public class Course2 {
	//필드
	private String courseName;
	
	//생성자
	public Course2(String name) {
		this.courseName= name;
	}
	
	//메소드
	public void addTranscript(Transcript transcript) {
		Transcript.transcripts.add(transcript);
	}
	
	public String getName() {
		return this.courseName;
	}
}
