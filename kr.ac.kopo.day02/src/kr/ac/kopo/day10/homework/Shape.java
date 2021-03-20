package kr.ac.kopo.day10.homework;
/*
 * 
 * 2. 다음의 결과를 보이는 프로그램을 작성

		도형을 선택하세요(1. 직사각형, 2. 정사각형, 3.삼각형, 4.원) => 1
		직사각형 선택시
		   Random하게 2 ~ 10사이의 정수 2개를 추출
		   가로 3, 세로 2의 직사각형 면적은 6입니다
		   
		도형을 선택하세요(1. 직사각형, 2. 정사각형, 3.삼각형, 4.원) => 2
		정사각형 선택시
		   Random하게 2 ~ 10사이의 정수 1개를 추출
		   가로 5의 정사각형 면적은 25입니다
 * 
 * 
 */

import java.util.Scanner;

public class Shape {
	
	private int width;					// 가로길이 
	private int length;					// 세로길이 및 높이
	private int radius;					// 반지름
	private final double PIE = 3.14;
	
	Scanner sc = new Scanner(System.in);
	
	Shape(){		// 기본생성자 생성
		
	}
	
	public int getWidth() {
		return this.width;
	}
	public int getLength() {
		return this.length;
	}
	public double getPie() {
		return this.PIE;
	}
	
	void select() {
		System.out.print("도형을 선택하세요(1.직사각형, 2.정사각형, 3.삼각형, 4.원 => ");
		int num = sc.nextInt();
		
	}
	
	

}
