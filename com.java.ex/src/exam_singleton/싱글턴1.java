package exam_singleton;

public class 싱글턴1 {
	private int num=1;
	private String name="이정빈";
	private 싱글턴1(int num, String name) {
		this.num = num;
		this.name = name;
	}
	private 싱글턴1() {}
	public static 싱글턴1 getinstance() {
		싱글턴1 싱글톤= new 싱글턴1();
		return 싱글톤;
	} 
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
