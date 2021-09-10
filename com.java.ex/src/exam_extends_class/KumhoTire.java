package exam_extends_class;

public class KumhoTire extends Tire{
	
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation<maxRotation) {
			System.out.println("금호타이어 수명: "+(maxRotation-accumulateRotation)+"회");
			return true;
		}
		else {
			System.out.println("*** "+location+"금호타이어 펑크 ***");
			return false;
		}
	}
	
	
}
