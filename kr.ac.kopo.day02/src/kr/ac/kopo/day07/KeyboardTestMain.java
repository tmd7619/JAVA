package kr.ac.kopo.day07;

import java.util.Scanner;

public class KeyboardTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2= sc.nextInt();
		
		
		//  첫번째 입력때, 10 234 를 입력하면 두번째 정수 물음에 입력을 받지 않고 
		// 	버퍼에 있는 숫자를 가져옴 
		
		
		System.out.print("정수입력 : ");
		int num3 = sc.nextInt();			// 정수형은 버퍼에 ln을 남기기 때문에,
		
		System.out.print("문자열을 입력 : ");
		String num4= sc.nextLine();
		
		
	}

}
