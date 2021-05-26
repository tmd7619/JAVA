package kr.ac.kopo.day17.homework;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

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

	Scanner sc = new Scanner(System.in);
	private String fileName;
	private String loc ;
	private int cnt = 0 ;
	
	
	
	public void search() {

		// 파일 최종 수정일 날짜 형식
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		File dir = null;
		
		if(cnt == 0 ) { // 
			loc = "iodata";
		dir = new File(loc);
		}else if (cnt == 1) {
			dir = new File(loc);
		} else if (cnt == 2) {
			dir = new File(loc);
		}
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
		while (true) {
			System.out.print("만드실 디렉토리 명을 입력하세요 : ");
			fileName = sc.nextLine();
			File newDirObj = new File("iodata/" + fileName);
			if (!newDirObj.exists()) {
				newDirObj.mkdir();
				System.out.println(fileName + "명의 디렉토리가 생성되었습니다.");
				break;
			} else if (newDirObj.exists()) {
				System.out.println("이미 존재하는 디렉토리 명입니다. 다시 입력하세요.");
				System.out.println();
			}
		}
	}

	public void chgName() {
		while (true) {
			System.out.println("======================================================");
			System.out.print("파일 명을 입력해주세요. : ");
			fileName = sc.nextLine();
			System.out.print("변경할 파일 명을 입력하세요. : ");
			String chgName = sc.nextLine();
			File chgFileObj = new File("iodata/" + fileName);
			if (chgFileObj.exists()) {
				boolean bool = chgFileObj.renameTo(new File("iodata/" + chgName));
				if (bool) {
					System.out.println(chgName + " 명으로 변경이 완료되었습니다.");
					break;
				} else {
					System.out.println("이미 동일한 파일명이 존재합니다. 다시 입력하세요.");
					System.out.println("===================================================");
				}
			} else {
				System.out.println("파일이 존재하지 않습니다. 다시 입력하세요.");
				System.out.println("===================================================");
			}
		}
	}

	public void delFile() {
		while (true) {
			System.out.println("======================================================");
			System.out.print("삭제할 파일 or 디렉토리 명을 입력하세요 : ");
			fileName = sc.nextLine();
			File delFileObj = new File("iodata/" + fileName);
			if (delFileObj.exists()) {
				if (delFileObj.isDirectory()) { // 디렉토리일 경우,
					File[] file = delFileObj.listFiles(); // File 배열 생성
					for (int i = 0; i < file.length; i++) { // 배열에 저장된 모든 파일 제거
						file[i].delete();
						delFileObj.delete();
					}
					System.out.println(fileName + "  디렉토리와 디렉토리 내 모든 파일이 삭제되었습니다.");
					break;

				} else {
					delFileObj.delete();
					System.out.println(delFileObj + " 파일이 삭제되었습니다.");
					break;
				}
			} else {
				System.out.println("파일이 존재하지 않습니다. 다시 입력해주세요.");
			}

		}

	}

	public void upDir() {
		
		loc = "iodata" ; // 상위폴더로 위치 변경
		cnt = 1;
	}

	public void downDir(String input) {
		
		loc = loc + "/" + input;
		File downFileObj = new File(loc);
		
		if(downFileObj.isDirectory()) {
			System.out.println("dir");
		}
		
		File[] fList = downFileObj.listFiles();
		
		
		System.out.println(downFileObj.getName());
		
		if(fList == null) {
			System.out.println("정보 x");
			return;
		}
		
		if(fList.length == 0) {
			System.out.println("정보 X");
			return;
		}
		
		for(int i = 0; i < fList.length; i++) {
			System.out.println(fList[i].getName());
		}
		
		
		cnt = 2;
		
		
	}

}