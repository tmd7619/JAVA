package kr.ac.kopo.day11;

import java.util.Scanner;

public class Menu {

	public int selectMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("프린터를 선택하세요(1.LG 2.삼성) => ");
		int no = sc.nextInt();
		
		return no;
	}
	
	public void choice() {
		int type = selectMenu();
		print(type);
	}
	
	public void print(int no) {
		switch(no){
		case 1:
			System.out.println("LG 선택");
			break;
		case 2:
			System.out.println("삼성 선택");
			break;
		}
	}
}
