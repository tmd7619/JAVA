package kr.ac.kopo.day11.homework;

public class Rectangle extends Shape {

	@Override
	public void printShape() {
		int width = super.getRandom();
		int length = super.getRandom();
		System.out.print("가로 " + width + " 세로 " + length + "의 직사각형의 면적은 " + (width * length) + "입니다");

	}
}
