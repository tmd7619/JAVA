package kr.ac.kopo.day11.homework;

import java.util.Random;
import java.util.Scanner;

public abstract class Shape {


	public int getRandom() {				// 2 ~ 10 랜덤 값 불러오기
		Random r = new Random();
		int ranNum = r.nextInt(10) + 1;		// nextInt(x) : 0 ~ x 미만 
		return ranNum;
	}
	
	public abstract void printShape();	// 추상메소드 생성
	
	public static void print() {
		Scanner sc = new Scanner(System.in);
		System.out.print("도형을 선택하세요(1.직사각형, 2.정사각형, 3.삼각형, 4.원 => ");
		int num = sc.nextInt();
		sc.nextLine();
		
		Shape s = null;
		switch(num) {
		case 1:
			s = new Rectangle();		// 묵시적 형변환
			s.printShape();
			break;
		case 2:
			s = new Square();
			s.printShape();
			break;
		case 3:
			s = new Triangle();
			s.printShape();
			break;
		case 4:
			s = new Circle();
			s.printShape();
			break;
		}

		}

}
