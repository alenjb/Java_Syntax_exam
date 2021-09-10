package exam_extends_class;

public class Tire {
	public int maxRotation;
	public int accumulateRotation;
	public String location;
	
	public Tire(String location,int maxRotation) {
		super();
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation<maxRotation) {
			System.out.println(location+"타이어 수명:"+ (maxRotation- accumulateRotation)+"회");
			return true;
		}
		else {
			System.out.println("*** "+location+"타이어 펑크 ***");
			return false;
		}
	}
	
}
