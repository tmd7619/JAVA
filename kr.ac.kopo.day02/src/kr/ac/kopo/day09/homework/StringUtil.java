package kr.ac.kopo.day09.homework;

import java.util.Scanner;

public class StringUtil {
	Scanner sc = new Scanner(System.in);

	private char inputChar;
	private int inputNum;
	private int inputNum02;
	private String inputString;
	
	StringUtil(){
		
	}
	
	boolean isUpperChar(char inputChar) {			// 대문자면 true 반환하는 메소드
		this.inputChar = inputChar;
		if(this.inputChar>=65 && this.inputChar<=90) {
			return true;
		} else{
			return false;
		}
	}
	
	boolean isLowerChar(char inputChar) {			// 소문자면 true 반환하는 메소드
		this.inputChar = inputChar;
		if(this.inputChar>=97 && this.inputChar<=122) {
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
		StringBuilder ans = new StringBuilder();
		for(int i = str.length()-1; i >= 0 ; i--) {
			ans.append(str.charAt(i));
		}
	
		return ans;
	}
	
	
	
	
	
}
