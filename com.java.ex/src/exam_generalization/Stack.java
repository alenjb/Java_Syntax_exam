package exam_generalization;

public class Stack {
	private Vector vector= new Vector();
	
	public void push(int inputNum) {
		vector.add(inputNum);
	}
	
	public String pop() {
		String top= vector.get();
		vector.remove(top);
		return top;
	}

}
