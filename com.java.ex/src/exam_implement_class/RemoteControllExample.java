package exam_implement_class;

public class RemoteControllExample {
	public static void main(String[] args) {
		RemoteControll rc;
		rc= new Television();
		
		rc.setMute(true);
		rc.turnOn();
		rc.turnOff();
		System.out.println("------------");
		rc=new Audio();
		rc.setMute(true);
		rc.turnOn();
		rc.turnOff();

	}
}
