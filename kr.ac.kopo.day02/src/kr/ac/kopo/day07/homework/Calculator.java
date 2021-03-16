package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class Calculator {
	
	void cal(int num1, int num2) {
		System.out.println(num1 + " + " + num2 + " = "+(num1+num2));
		System.out.println(num1 + " - " + num2 + " = "+(num1-num2));
		System.out.println(num1 + " * " + num2 + " = "+(num1*num2));
		System.out.println(num1 + " + " + num2 + " = "+(num1+num2));
		System.out.println(num1 + " / " + num2 + " = "+(double)(num1/num2));
	}
	
	void cal(int num1) {
		boolean a = true;
		for(int i = 2 ; i < num1 ; i++ ) {
			if(num1 % i ==0) {
				a = false;
				break;
			}
		}
		System.out.println(num1+ " 소수체크 : "+a);
	}

	int getCal(String msg) {					
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
}
