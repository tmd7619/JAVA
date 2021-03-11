package kr.ac.kopo.day03.exem;


/*	5)
*	*****
*	-****
*	--***
*   ---**
*   ----*
*   ---**
*   --***
*   -****  
*	*****
*/

public class ExamMain5_3 {

	public static void main(String[] args) {
		
		int space = 0, star = 5;
		for(int i =1 ; i <= 9 ; i++) {
			for(int j =1 ; j <= space ; j++) {
				System.out.print("-");
			}
			for(int j =1; j <= star; j ++ ) {
				System.out.print("*");
			}
			System.out.println();
			
			if(i<=4) {			// 4인 이유는 이미 i=5일때, space를 위에서 찍었기 때문에 5-1 =4 
				space++;
				star--;
			} else {
				space--;
				star++;
			}
		}
	}
}
