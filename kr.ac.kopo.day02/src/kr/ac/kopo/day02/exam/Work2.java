package kr.ac.kopo.day02.exam;

import java.util.Scanner;

public class Work2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("반지름을 입력 :");
		int num = sc.nextInt();
		
		final double pie = 3.14 ;
		
		System.out.println("반지름이 "+num+"이면, 원둘레는"+2*num*pie+"이고,원넓이는"+num*num*pie);
	}

}
