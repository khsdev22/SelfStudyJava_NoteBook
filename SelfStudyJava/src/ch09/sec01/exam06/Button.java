package ch09.sec01.exam06;

public class Button {
	
	OnClickLisener listener; // <- 인터페이스 타입 필드
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener{
		void onClick();
	}

}
