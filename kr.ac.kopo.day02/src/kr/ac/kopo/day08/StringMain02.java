package kr.ac.kopo.day08;

import java.util.Scanner;

public class StringMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hello world";
		System.out.println(str+"의 길이"+str.length()); // 공백포함
		System.out.println("0번째에 위치한 문자 : "+str.charAt(0)); // 인덱스 순서
		System.out.println("7번째에 위치한 문자 : "+str.charAt(7));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력 : ");
		char c = sc.nextLine().charAt(0);
		System.out.println(c);
	}
}
