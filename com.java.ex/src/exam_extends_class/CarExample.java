package exam_extends_class;

public class CarExample {
	public static void main(String[] args) {
		Car car= new Car();
		
		for(int i=1; i<5; i++) {
			int problemLocation = car.run();
			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 금호타이어로 교체");
				car.frontLeftTire= new KumhoTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 금호타이어로 교체");
				car.frontRightTire= new KumhoTire("앞왼쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 금호타이어로 교체");
				car.backLeftTire= new KumhoTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 금호타이어로 교체");
				car.backRightTire= new KumhoTire("뒤오른쪽", 17);
				break;
			case 0:
				return;
			}
			System.out.println("--------------------------------------------------");
		}
	}

}
