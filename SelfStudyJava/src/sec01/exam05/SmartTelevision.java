package sec01.exam05;

import sec01.exam01.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable{
	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME)
	}

}
