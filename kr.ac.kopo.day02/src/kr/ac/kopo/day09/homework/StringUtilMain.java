package kr.ac.kopo.day09.homework;

public class StringUtilMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		StringUtil util = new StringUtil();
	
		// 메소드 및 문자열
		System.out.println(util.isUpperChar('A'));					// 1번
		System.out.println(util.isLowerChar('A')); 					// 2번
		System.out.println(util.max(23,24));						// 3번
		System.out.println(util.min(25,26));						// 4번
		System.out.println(util.reverseString("가나다라마바사")); 	// 5번
		System.out.println(util.toUpperString("abcdefg")); 			// 6번
		System.out.println(util.toLowerString("ABCDEFG")); 			// 7번
		
		// 문자열
		System.out.println(StringUtil.checkChar("Hello World Java", 'o')); // 1번
		System.out.println(StringUtil.checkChar("Hello World Java", 'W'));
		
		System.out.println(StringUtil.removeChar("Hello World Java",'l')); // 2번
		System.out.println(StringUtil.removeChar("Hello World Java",'o'));
	

			
	}

}
