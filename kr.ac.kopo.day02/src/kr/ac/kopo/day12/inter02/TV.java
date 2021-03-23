package kr.ac.kopo.day12.inter02;

public interface TV {		//  모든 인터페이스는 public 형태를 가진다
								// static 메서드 및 필드는 글씨가 기울어져있음
	int MAX_VOLUME_SIZE = 50;	// 최대 볼륨 크기를 50으로 지정
	int MIN_VOLUME_SIZE = 0;	// 인터페이스는 메모리 공간을 만들 수 없기 때문에, 변수로 만들 수가 없다
								// 따라서 상수형태로 만들어지며, public static final이 생략되있다
	
	void powerOn();				// 앞에 public abstract가 생략되있다.
	void powerOff();
	void channelUp();
	void channelDown();
	void soundUp();
	void soundDown();
	void mute();
	
}								