package kr.ac.kopo.day05.exem;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 2. 다음과 같은 결과를 보이는 프로그램 작성
	짝수 몇개 입력: 5
	홀수 몇개 입력 :4
	
	num1 : 12
	num2 : 9
	num3 : 67
	num4 : 20
	num5 : 9
	num6 : 31
	num7 : 24
	num8 : 5
	num8 : 11
	num8 : 10
	num9 : 6
	
	<PRINT> 
	12 20 24 10 6 31 9 67 9
 * 
 */

public class Arrhomework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("짝수 몇개 입력 :");
		int num = sc.nextInt(); // arr 짝수 개수
		System.out.println("홀수 몇개 입력 :");
		int num2 = sc.nextInt(); // arr 홀수 개수
		int[] arr = new int[num+num2];
		
		for(int i = 1 ; i <= arr.length ; i++) {
			System.out.println("num"+i +" : ");
			int num3 = sc.nextInt();
			if(num3 % 2==0 && i<=num) {
				arr[i-1]=num3;
				} else if(num3 % 2 !=0 && i<=num2){
					arr[arr.length-i] = num3;
					
				}
			}
			
			System.out.println(Arrays.toString(arr));
				
		
	}
}


