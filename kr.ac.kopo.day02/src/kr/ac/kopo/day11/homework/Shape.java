package kr.ac.kopo.day11.homework;

import java.util.Random;
import java.util.Scanner;

public abstract class Shape {
	private String name;
	private int width; // 가로길이
	private int length; // 세로길이 및 높이
	private int radius; // 반지름
	private int count; // 계산값

	Shape() { // 기본생성자 생성

	}

	public int getRandom() {				// 2 ~ 10 랜덤 값 불러오기
		Random r = new Random();
		int ranNum = r.nextInt(9) + 2;		// nextInt(x) : 0 ~ x 미만 
		return ranNum;
	}

//	public int getWidth() {		// 가로길이 호출
//		return this.width;
//	}
//
//	public int getRadius() {	// 반지름 호출
//		return this.radius;
//	}
//
//	public int getLength() {	// 세로길이 호출
//		return this.length;
//	}
//
//	public String getName() {	// 도형이름 호출
//		return this.name;
//	}
//
//	public int getCount() {		// 계산값 호출
//		return this.count;
//	}

	public void setWidth(int width) {	// 가로길이 수정
		this.width = width;
	}

	public void setLength(int length) {	// 세로길이 수정
		this.length = length;
	}
	
	public void setRadius(int radius) {	// 반지름 수정
		this.radius = radius;
	}

	public void setName(String name) {	// 도형이름 수정
		this.name = name;
	}

	public void setCount(int count) {	// 계산값 수정
		this.count = count;
	}

	
	public abstract void printShape();	// 추상메소드 생성
	
	public Shape print() {
		Scanner sc = new Scanner(System.in);
		System.out.print("도형을 선택하세요(1.직사각형, 2.정사각형, 3.삼각형, 4.원 => ");
		int num = sc.nextInt();
		sc.nextLine();
		
		Shape s = null;
		switch(num) {
		case 1:
			s = new Rectangle();
			break;
		case 2:
			s = new Square();
			break;
		case 3:
			s = new Triangle();
			break;
		case 4:
			s = new Circle();
			break;
		}
		if(s != null) {
			s.printShape();
		}else {
			System.out.println("다시 입력하세요");
		}
		return s;
	}

}
