package exam_generalization;

public class Vector {
	private String [] arr= new String[10];
	
	public void add(int inputNum) {
		
	}
	public void remove(String value) {
		for(int i=0; i<arr.length; i++) {
			if(this.arr[i].contentEquals(value)) {
				for(int j=i; j<arr.length; j++) {
					arr[j]=arr[j+1];
				}
			}
		}
	}
	public int size() {
		for(int i=0; i<this.arr.length; i++) {
			if(arr[i].contentEquals(null)) {
				return i+1;
			}
		}return 10;
	}
	public String get() {
		return arr[(this.size()-1)];
	}

}
