package kr.ac.kopo.day12;

import java.util.Random;

public class ExceptionMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main start...");
		
		Random r = new Random();
		int num  = r.nextInt(3); // 0 ~ 2 사이의 난수 발생
		System.out.println("num : "+ num);
		
		try {
		System.out.println(10/num); 
		} catch(ArithmeticException ae) {	// ae: 17줄에 발생한 예외를 ae변수가 알고있음	
//		} catch(NullPointExcetion ae) {		// 다른예외는 잡을 수 없음
//			System.out.println("이유 : "ae.getMessage()); // 예외 메세지 내용 출력
			ae.printStackTrace();  	        // 
		}
		System.out.println("main end...");	
	}

}
