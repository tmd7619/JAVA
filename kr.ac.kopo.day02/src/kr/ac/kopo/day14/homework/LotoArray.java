package kr.ac.kopo.day14.homework;

import java.util.Random;

public class LotoArray {
	
	Random r = new Random();
	
	// 배열의 개수를 num*6 로 생성해서, 순서대로 숫자 넣은다음 6개 단위로 짜르기
	
	public void array(int num) {
		int[] intArr = new int[num*6];
		for(int i = 0 ; i < num*6; i ++) {
			intArr[i] = r.nextInt(45)+1;	
		}
	}
	
	
	public void print()

}
