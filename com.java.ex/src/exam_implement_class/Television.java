package exam_implement_class;

public class Television implements RemoteControll{
private int volume;
	
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControll.MAX_VOLUME) {
			this.volume= RemoteControll.MAX_VOLUME;
		}
		else if(volume<RemoteControll.MIN_VOLUME) {
			this.volume= RemoteControll.MIN_VOLUME;
		}
		else {
			this.volume=volume;
		}
		System.out.println("현재 tv 볼륨"+ volume);
	}
	@Override
	public void turnOff() {
		System.out.println("tv를 끕니다.");
	}@Override
	public void turnOn() {
		System.out.println("tv를 켭니다.");
	}
}
