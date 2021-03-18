package kr.ac.kopo.day08;

public class StringMain05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 123;
//		String strNum = num + "";
		String strNum = String.valueOf(num);   // 정수를 포함하여 다양한 타입들을 문자열로 바꿔줌
		System.out.println(strNum+10);		   // strNum이 문자열이라 123+10 = 133이 아닌 12310이 출력
		
		System.out.println(String.valueOf(true)+false);
		
	}

}
