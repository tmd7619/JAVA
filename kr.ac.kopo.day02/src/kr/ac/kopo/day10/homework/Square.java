package kr.ac.kopo.day10.homework;

public class Square extends Shape {
	Square(){
		super();
		setName("정사각형");
	}
	
	@Override
	public void print(int num) {
		setWidth(getRandom());
		setCount(getWidth()*getWidth());	
		super.print(num);
	}
	
	
}
