package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class Work4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수를 입력 :");
		int num = sc.nextInt();
		System.out.print("두번째 정수를 입력 :");
		int num2 = sc.nextInt();

		// if구문
		
		if (num2 == 0) {

			System.out.printf("%d가 %d의 배수인지 판단결과 : false\n", num, num2);
			
		} else if (num % num2 == 0 && num2 != 0){
			System.out.printf("%d가 %d의 배수인지 판단결과 : true\n", num, num2);
			System.out.printf("%d가 %d의 배수인지 판단결과 : 참\n", num, num2);
		} else {
			System.out.printf("%d가 %d의 배수인지 판단결과 : false\n", num, num2);

		}
		
		// 조건연산자
		
		System.out.println("정수 " + num + "이" + num2 + "의 배수 여부 판단 :" 
				+ (num2 > 0 && num % num2 == 0 ) );
		System.out.println("정수 " + num + "이" + num2 + "의 배수 여부 판단 :" 
				+ (num2 > 0 && num % num2 == 0 ? "참" : "거짓" ) );

	}
}