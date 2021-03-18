package kr.ac.kopo.day09.homework;

/*
 * 알파벳 아스키 코드 A-65  Z-90  a-97  z-122
 *	65<= char <=90 이면 대문자, 97<= char <= 122 이면 소문자이다. 			
 * 소문자 -> 대문자로 변환하려면, char에 32를 빼주고, 반대일 경우, 32를 더해준다.
 */


public class StringUtil {
	private char inputChar;
	private int inputNum;
	private int inputNum02;
	private String inputString;	
	
	boolean isUpperChar(char inputChar) {			// 대문자면 true 반환하는 메소드
		this.inputChar = inputChar;
		if(this.inputChar>=65 && this.inputChar<=90) { // 	65<= char <=90  //대문자
			return true;
		} else{
			return false;
		}
	}
	
	boolean isLowerChar(char inputChar) {			// 소문자면 true 반환하는 메소드
		this.inputChar = inputChar;
		if(this.inputChar>=97 && this.inputChar<=122) { // 97<= char <= 122 //소문자
			return true;
		} else{
			return false;
		}
	}
	
	int max(int inputNum, int inputNum02) {
		this.inputNum = inputNum;
		this.inputNum02 = inputNum02;
		if(this.inputNum>this.inputNum02) {
			return this.inputNum;
		} else {
			return this.inputNum02;
		}
	}
	int min(int inputNum, int inputNum02) {
		this.inputNum = inputNum;
		this.inputNum02 = inputNum02;
		if(this.inputNum<this.inputNum02) {
			return this.inputNum;
		} else {
			return this.inputNum02;
		}
	}
	StringBuilder reverseString(String str) {
		this.inputString = str;
		StringBuilder reverseStr = new StringBuilder();
		for(int i = str.length()-1; i >= 0 ; i--) {
			reverseStr.append(str.charAt(i));
		}
	
		return reverseStr;
	}
	
	StringBuilder toUpperString(String str) {
		this.inputString = str;
		StringBuilder UpperStr = new StringBuilder();
		for(int i = 0 ; i < str.length(); i ++) {
			int a = str.charAt(i)-32;				// char에서 32를 뺸 값이 대문자	
			UpperStr.append((char)a);
		}
		return UpperStr;
	}
	StringBuilder toLowerString(String str) {
		this.inputString = str;
		StringBuilder loweStr = new StringBuilder();
		for(int i = 0 ; i < str.length(); i ++) {
			int a = str.charAt(i)+32;			   // char에서 32를 더한 값이 소문자
			loweStr.append((char)a);
		}
		return loweStr;
	}
	
	public static int checkChar(String strData, char ch) {
		int cnt = 0;
		for(int i = 0 ; i < strData.length();i++) {
			if(strData.charAt(i)==ch) {
				cnt++;
			}
		}
		
		return cnt;
	}
	public static StringBuilder removeChar(String oriStr, char delChar) {
		StringBuilder removeStr  = new StringBuilder();
 		for(int i = 0 ; i < oriStr.length();i++) {
			if(oriStr.charAt(i)!=delChar) {
				removeStr.append(oriStr.charAt(i));
			}
 		}
 		return removeStr;
	}
	
}
