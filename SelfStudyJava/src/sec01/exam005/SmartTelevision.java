package sec01.exam005;

import sec01.exam01.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
	public void turnOn() {
		System.out.println("Tv On");
	}
	public void turnOff() {
		System.out.println("TV Off");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl.Max_)
	}
}