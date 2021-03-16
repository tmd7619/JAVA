package kr.ac.kopo.day07.homework;


/*
 * 2. 사칙연산을 수행하는 Calculator 클래스 작성
 정수 : 12
 정수 : 5
 12 + 5 = 17
 12 - 5 = 7
 12 * 5 = 60
 12 / 5 = 2.4
 12 소수체크 : false
 5 소수체크 : true
 */

import java.util.Scanner;

public class Methodhomework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator ca = new Calculator();
		
		int num1 = ca.getCal("첫번째 정수 입력 : ");
		int num2 = ca.getCal("두번째 정수 입력 : ");
		
		ca.cal(num1, num2);					// 사칙연산
		
		ca.cal(num1);						//  소수체크						
		ca.cal(num2);
		
	}

}
