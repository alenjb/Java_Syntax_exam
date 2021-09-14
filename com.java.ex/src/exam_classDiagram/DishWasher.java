package exam_classDiagram;

public class DishWasher extends HomeAppliance{
	@Override
	public void turnOn() {
		System.out.println("식기세척기를 킵니다.");
	}@Override
	public void turnOff() {
		System.out.println("식기세척기를 끕니다.");
	}
}
