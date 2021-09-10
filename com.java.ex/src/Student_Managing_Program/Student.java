package Student_Managing_Program;

public class Student {
	
	public static void main(String[] args) {
		
		//String 배열에 정보 저장
		String [] arr= new String [3];
		arr[0]= "임영웅3420201234자바 웹프로그래밍";
		arr[1]= "영탁3920201235컴퓨터공학과";
		arr[2]="정동원2220201236정보보안";
		//저장완료 출력
		System.out.println(arr[0]+" 학생정보 입력 완료");
		System.out.println(arr[1]+" 학생정보 입력 완료");
		System.out.println(arr[2]+" 학생정보 입력 완료");
		
		//각 수강생에 대해여
		for( int k=0; k<3; k++) {
			//String 배열의 정보 중 숫자가 처음 나오는 위치, 마지막으로 나오는 위치 얻기
			int first=0; int last=0;
			for (int i = 0; i < arr[k].length(); i++) {
				//정수이면
	            if(arr[k].charAt(i)>=48 && arr[k].charAt(i)<=57) {
	            	//숫자 시작지점
	            	first= i;
	        		//숫자 끝나는지점 찾기
	            	for (int j = i; j < arr[k].length(); j++) {
	        			if(arr[k].charAt(j)<48 || arr[k].charAt(j)>57) {
	        				//숫자 끝나는 지점
	        				last=j;
	        				break;
	        				}
	        			}
	        		break;
	            }
	         }

		//이름, 나이, 수강생번호, 과목 명을 분리
		String name=arr[k].substring(0,first);
		String age=arr[k].substring(first, (first+2));
		String num=arr[k].substring(first+2, last);
		String subject=arr[k].substring(last);
		
		//저장 객체 생성
		StudentManage studentManage= new StudentManage(name, age, num, subject);
		//저장
		studentManage.save(studentManage);
			
		}
		//정보 수정
		StudentManage studentManage= new StudentManage("임영웅","34", "20201234", "자바 웹프로그래밍");
		boolean update_result= studentManage.update(studentManage);
		if (update_result==true) {
			System.out.println("이찬원학생정보 수정완료!!!");
			System.out.println("이찬원휴학생 정보입력!!!");
		}
	}
	
}
