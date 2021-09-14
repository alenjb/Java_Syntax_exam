package exam_generalization;

public class Vector {
	private int [] arr= new int[10];
	
	public void add(int inputNum) {
		
	}
	public void remove(int value) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==value) {
				for(int j=i; j<arr.length; j++) {
					arr[j]=arr[j+1];
				}
			}
		}
	}
	public int size() {}
	public void get() {
		
		
	}

}
