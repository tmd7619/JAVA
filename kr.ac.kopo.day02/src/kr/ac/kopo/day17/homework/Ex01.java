package kr.ac.kopo.day17.homework;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

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

	public void search() {

		// 파일 최종 수정일 날짜 형식
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		File dir = new File("iodata");

		String fn = null; // 파일 이름
		String fk = null; // 파일 종류
		long fs; // 파일 크기
		String flm = null; // 파일 최종 수정 날짜

		System.out.println("--------------------------------------------");
		System.out.println("\t\t" + dir.getName() + " 폴더 정보\t\t");
		System.out.println("--------------------------------------------");
		System.out.println("이름\t종류\t크기\t마지막수정날짜");
		System.out.println("--------------------------------------------");
		File[] list = dir.listFiles();
		for (File f : list) {
			fn = f.getName(); // 파일 이름 저장

			if (f.isDirectory()) { // 디렉토리일 경우, fk에 디렉토리로 저장
				fk = "디렉토리";
			} else { // 아닐경우 파일로 져장
				fk = "파일";
			}
			fs = f.length(); // 파일 사이즈 저장

			flm = sdf.format(new Date(f.lastModified()));

			System.out.println(fn + "\t" + fk + "\t" + fs + "byte(s)\t" + flm);
		}
		System.out.println("--------------------------------------------");
	}

	public void newDir() {

	}

	public void chgName() {

	}

	public void delFile() {

	}

	public void upDir() {

	}

	public void downDir() {

	}

}