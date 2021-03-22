package kr.ac.kopo.day11.homework;

public class Rectangle extends Shape {
	
	Rectangle(){
		setName("직사각형");
	}
	
	@Override
	public void printShape() {
		setWidth(getRandom());
		setLength(getRandom());
		setCount(getWidth()*getLength());	
		super.print();
	}
}
