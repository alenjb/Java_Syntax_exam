package exam_classDiagram;

import java.util.Iterator;

public class Main2 {
	public static void main(String[] args) {
		Student2 s1= new Student2("홍길동");
		Student2 s2= new Student2("홍길자");
		
		Course2 se= new Course2("Software Engineering");
		Course2 designPattern = new Course2("DesignPattern");
		
		Transcript t1= new Transcript(s1, se);  //홍길동은 솦트 공학 수강
		Transcript t2= new Transcript(s1, designPattern);  //홍길동은 디자인 패턴 수강
		
		//홍길자는 디자인 패턴 수강
		Transcript t3= new Transcript(s2, designPattern);
		
		//홍길동은 2021년에 소프트웨어 공학에서 A+학점 취득
		t1.setDate("2021"); t1.setGrade("A+"); se.addTranscript(t1); 
		//홍길동은 2021년에 디자인패턴에서 A0 학점 취득
		t2.setDate("2021"); t2.setGrade("A0"); designPattern.addTranscript(t2);
		//홍길자는 2020년에 디자인 패턴에서 C+ 학점 취득		
		t3.setDate("2020"); t3.setGrade("C+");designPattern.addTranscript(t3);
		//모든 수강과목 출력
		printAll();
		
		
		
	}// me
	
	//수강한 모든 과목을 sysout 작업을 수행하는 메소드
	public static void printAll() {
		Iterator<Transcript> a= Transcript.transcripts.iterator();
		while(a.hasNext()) {
			Transcript transcript=a.next();
			System.out.println(transcript.getDate()+"년 "+transcript.getStudent().getStudentName()+"님은 "+
			transcript.getCourse().getName()+"과목에서 "+transcript.getGrade()+"학점을 취득하셨습니다.");
		}
	}
	


}
