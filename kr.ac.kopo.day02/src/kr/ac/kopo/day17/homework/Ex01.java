package kr.ac.kopo.day17.homework;

import java.io.File;

/*
 1. 탐색기 구현
------------------------------------------
	iodata 폴더 정보
-------------------------------------------
이름			종류		크기		마지막수정날짜
------------------------------------------
새폴더		폴더
새새폴더		폴더
a.txt		파일		3bytes		2021-05-25 11:22:12
b.txt		파일		25bytes
------------------------------------------
[M]새폴더  [R]이름변경  [D]삭제 [.]상위폴더이동 [move]하위폴더 이동 : move 새새폴더
------------------------------------------
	iodata/새새폴더 폴더 정보
-------------------------------------------
이름			종류		크기		마지막수정날짜
------------------------------------------
*/

public class Ex01 {
	
	public static void main(String[] args) {
		
			
			File dirObj = new File("iodata");
		
			System.out.println("--------------------------------------------");
			System.out.println("\t\t"+dirObj.getName()+" 폴더 정보\t\t");
			System.out.println("--------------------------------------------");
			System.out.println("이름\t종류\t크기\t마지막수정날짜");
			System.out.println("--------------------------------------------");
			String[] list = dirObj.list() ; 
			for(int i = 0 ; i < list.length ; i ++ ) {
				System.out.print(list[i]);
				System.out.println();
				
			}
			
		
		
		
	}
	

}
