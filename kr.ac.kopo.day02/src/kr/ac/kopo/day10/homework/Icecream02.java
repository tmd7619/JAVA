package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class Icecream02 {
	private String name; // 아이스크림 이름 및 개수
	private int num; // 아이스크림 가격
	static private int totalNum; // 판매된 아이스크림 총 개수
	static private int totalSum; // 아이스크림 총 판매액
	static private int totalPerson; // 총 사람수

	Scanner sc = new Scanner(System.in);

	Icecream02() {
		System.out.println("아이스크림 판매점에 오신걸 환영합니다");
	}

	public String getName() {			// name을 불러오는 함수
		return name;	
	}

	public int getNum() {				// price및 개수를 불러오는 함수
		return num;
	}
	
	public int getTotalNum() {			// totalNum을 불러오는 함수
		return totalNum;
	}

	public int getTotalSum() {			// totalSum을 불러오는 함수
		return totalSum;
	}

	public int getTotalPerson() {		// totalPerson을 불러오는 함수	
		return totalPerson;
	}

	public void setIce(String n, int p) {
		this.name = n;
		this.num = p;
	}
	
	public void setTotal(int totalNum, int totalSum) {	// 총개수, 총합, 총인원을 수정하는 함수
		Icecream02.totalNum = totalNum;
		Icecream02.totalSum += totalSum;		// totalSum을 더한 값을 totalSum에 대입
		Icecream02.totalPerson++;
	}


	

}
