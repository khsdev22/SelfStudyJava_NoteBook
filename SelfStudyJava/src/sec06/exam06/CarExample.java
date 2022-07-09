package sec06.exam06;

public class CarExample {
	
	public static void main(String[] args) {
		Car myCar = new Car();
		
		// 잘못된 속도 변경
		myCar.setSpeed(-50); // private로 되어있기때문에, setter를 통해 속도를 변경해야한다.
		
//		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		// 올바른 속도 변경
		
		myCar.setSpeed(300);
		
//		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		// 멈춤
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
	}

}
