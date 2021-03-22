package kr.ac.kopo.day11.homework;

public class Triangle extends Shape {

	@Override
	public void printShape() {
		int width = super.getRandom();
		int height = super.getRandom();
		System.out.print("가로 " + width + " 높이 " + height + "의 삼각형의 면적은 " + (width * height) + "입니다");

	}
}
