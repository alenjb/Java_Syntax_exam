package exam_classDiagram;

public class Freezer extends HomeAppliance{
	@Override
	public void turnOn() {
		System.out.println("냉장고 킵니다.");
	}@Override
	public void turnOff() {
		System.out.println("냉장고를 끕니다.");
	}
}
