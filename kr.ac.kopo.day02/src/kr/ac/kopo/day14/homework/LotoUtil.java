package kr.ac.kopo.day14.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LotoUtil {
	private Random r = new Random();

	LotoUtil() {
		System.out.println("로또번호를 돌려봅시다");
	}

	private int printRandom() {
		Scanner sc = new Scanner(System.in);

		System.out.print("게임수를 입력하세요 : ");
		int gameNum = sc.nextInt();
		sc.nextLine();
		return (gameNum);
	}

	public void arrayUtli() {

		int gameNum = printRandom();

		int i = 1;
		while (i <= gameNum) { // 게임수까지 while문 실행
			int[] intArr = new int[6]; // i++ 할때마다 배열초기화
			loop1: for (int j = 0; j < intArr.length; j++) {
				int random = r.nextInt(45) + 1; // 배열에 넣을때마다 random값 초기화
				intArr[j] = random; // 인덱스에 random값 넣기
				for (j = 0; j < intArr.length; j++) {
					if (intArr[j] == random) { // 각 인덱스 값과 랜덤값이 똑같으면
						continue loop1; // loop1으로 돌아가기 (중복값 제거)
					}
				}
			}
			System.out.println("게임 " + i + " : " + Arrays.toString(intArr));
			i++;
		}
	}

	public void arrayListUtli() {
		int gameNum = printRandom();

		int i = 1;
		while (i <= gameNum) {
			List<Integer> list = new ArrayList<>();
//			Integer[] arr = list.toArray(new Integer[gameNum*6]);
			while (true) {
				int random = r.nextInt(45) + 1;
				if (!list.contains(random)) { // random 값이 없으면,
					list.add(random); // random 값 추가 (중복제거)
				}

				if (list.size() % 6 == 0) { // 리스트 원소개수가 6개가 되면,
					Integer[] intArr = list.toArray(new Integer[6]); // 크기가 6인 배열로 변환
					System.out.println("게임 " + i + " : " + Arrays.toString(intArr)); // 출력
					break;
				}
			}
			i++;
		}
	}

	public void setUtil() {
		int gameNum = printRandom();
		int i = 1;
		while (i <= gameNum) {
			Set<Integer> set = new HashSet<>();
			while (true) {
				set.add(r.nextInt(45) + 1);

				if (set.size() == 6) {
					Iterator<Integer> ite = set.iterator();
					Object[] arr = set.toArray();
					System.out.println("게임 " + i + " : " + Arrays.toString(arr));
					break;
				}
			}
			i++;
		}
	}

	public void twoDimensionUtil() {
		int gameNum = printRandom();
		int cnt = 0;
		Object[][] arr;

		for (int i = 0; i < gameNum; i++) {
			Set<Integer> set = new HashSet<>();
			while (true) {
				set.add(r.nextInt(45) + 1);
					arr = set.toArray(new Object[cnt][0]);
					System.out.print(arr[cnt][0]);
					break;
				}
			}
//			System.out.print("게임 : ");
//			for(int j = 0 ; j < arr[cnt].length; j++) {
//				System.out.print(arr[cnt][j]);
//			}
//			cnt++;
		}

}
