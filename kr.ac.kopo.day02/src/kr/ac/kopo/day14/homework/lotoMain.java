package kr.ac.kopo.day14.homework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/*
 * 1. 로또 게임
게임수를 입력하세요 : 3
게임 1 : [2, 6, 13, 25, 20, 7]
게임 2 : [2, 9, 3, 7, 38, 13]
게임 3 : [40, 10, 38, 39, 42, 18]

로또추출 알고리즘 최소 4개이상
 */

public class lotoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
//		Set<String> set = new HashSet<>();
		
		System.out.print("게임수를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		LotoArray ar = new LotoArray();
		
		ar.array(num);
		
	
	
		
		
//		for(int i = 0 ; i <num; i ++) {
//			for(int j = 0; j< 6 ; j ++) {
//				
//			}
//		}
		
		
	}

}
