package exam_classDiagram;

public class Washer extends HomeAppliance{
	
	@Override
	public void turnOn() {
		System.out.println("세탁기를 킵니다.");
	}@Override
	public void turnOff() {
		System.out.println("세탁기를 끕니다.");
	}

}
