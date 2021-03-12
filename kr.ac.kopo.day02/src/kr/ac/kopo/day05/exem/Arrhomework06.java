package kr.ac.kopo.day05.exem;

import java.util.*;

/* 6. 숫자 맞추기 게임 구성

1 - 100 : 30
30보다 큰수입니다
기회는 4번 남았습니다
31 - 100 : 70
70보다 작은수입니다
기회는 3번남앗습니다
31 - 69 : 80
31 - 69 : 55 
55보다 큰수입니다
기회는 2번남앗습니다
56 - 69: 60
60보다 큰수입니다
기회는 1번남앗습니다
61 - 69 : 63
63보다 작은수입니다
기회는 0번남았습니다

아쉽습니다..기회를 다 소진하였습니다 
정답은 61입니다

*/

public class Arrhomework06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random(); // 맞춰야할 숫자
		Scanner sc = new Scanner(System.in);
		int random = r.nextInt(100) + 1;  // (0~99) + 1 => (1 ~ 100)
		
		for(int i = 4 ; i >= 0; i --) {
			System.out.println("");
			int num = sc.nextInt();
			if(num == random) {
				System.out.println("축하합니다 정답을 맞추셨습니다.");
				break;
			}else if(num!=random){
				
				
			
			}

		}
		
		
	}

}
