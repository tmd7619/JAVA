package kr.ac.kopo.day11.homework;

public class Circle extends Shape {

	Circle() {
		setName("원");
	}

	@Override
	public void print(int num) {
		setRadius(getRandom());
		setCount(getRadius() * getRadius());
		super.print(num);
	}
}
