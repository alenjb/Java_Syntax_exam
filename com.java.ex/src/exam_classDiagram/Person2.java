package exam_classDiagram;

public class Person2 {
	private Car owns;
	
	public Car getCar() {
		return this.owns;
	}
	public void setCar(Car car) {
		this.owns=car;
	}
	
}
