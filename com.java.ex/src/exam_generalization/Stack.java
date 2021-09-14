package exam_generalization;

public class Stack {
	private Vector vector= new Vector();
	
	public void push(int inputNum) {
		vector.add(inputNum);
	}
	
	public int pop() {
		int top= vector.get();
		vector.remove(top);
		retrun top;
	}

}
