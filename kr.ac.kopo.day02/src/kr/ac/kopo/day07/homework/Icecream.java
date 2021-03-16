package kr.ac.kopo.day07.homework;

import java.util.Scanner;

public class Icecream {

	int getIce(String msg) {
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	String info(int cnt) {
		Scanner sc = new Scanner(System.in);

		System.out.println("*** " + (cnt + 1) + "번째 아이스크림 구매정보 ***");
		System.out.print("아이스크림 명 : ");
		String icename = sc.nextLine();
		System.out.print("아이스크림가격 : ");
		int iceprice = sc.nextInt();
		sc.nextLine();
		String iceList = icename + "\t" + Integer.toString(iceprice);
		return iceList;
	}
	
	
}
