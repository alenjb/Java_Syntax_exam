package exam_abstractMethod;

public class Dog extends Animal{
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	public Dog() {
		this.kind="포유류";
	}
}
