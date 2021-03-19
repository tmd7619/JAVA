package kr.ac.kopo.day10.homework;

import java.util.Scanner;

import kr.ac.kopo.day07.homework.t.Icecream;

public class IcecreamMarket02 {

	Icecream02[] iceArr; // Icecream 타입의 iceArr 배열 선언
	Scanner sc = new Scanner(System.in);

	Icecream02 ice = new Icecream02();
	
	public void buyIcecream() {
		buy();
		info();
	}

	public void buy() {
		while (true) {
			System.out.print("아이스크림 몇개 구입할래? : ");
			int icecnt = inputInt();
			System.out.println(icecnt + "개 구입 확인했습니다.");
			this.iceArr = new Icecream02[icecnt];
			for (int i = 0; i < iceArr.length; i++) {
				System.out.println((i+1) + "번");
				System.out.println("아이스크림명 : " + inputName());
				System.out.print("아이스크림가격 : " + inputInt());
				iceArr[i] = new Icecream02();
				iceArr[i].setIce(inputName(), inputInt());	// icecnt 만큼 iceArr배열에 이름과 가격을 넣기
				ice.setTotal(icecnt,inputInt());									// 1명이 구매한 아이스크림 개수와 가격 총합을 totalNum과 totalSum에 넣기
			}
			System.out.print("계속구매할래?(Y/N) => ");
			if(sc.nextLine()=="Y" || sc.nextLine()=="y") {
				continue;
			}else {
				break;
			}
			
		}
	}
	public void info() {
		System.out.println("총 "+ice.getTotalPerson()+"의 고객이 아이스크림을 구매했습니다.");
		System.out.println("판매된 아이스크림 총 개수 : "+ice.getTotalNum());
		System.out.println("총 판매액 : "+ice.getTotalSum());
	}


	public int inputInt() {
		int p = ice.getNum();
		p = sc.nextInt(); 
		sc.nextLine();
		return p;
	}

	public String inputName() {
		System.out.print("아이스크림명 : ");
		String n = ice.getName();
		n = sc.nextLine();
		return n;
	}
}
