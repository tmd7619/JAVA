package kr.ac.kopo.day13.homework;

import java.util.Calendar;

public class SpecificYear implements Date {

	@Override
	public void printyear(int year) {
//		Calendar c = Calendar.getInstance();
//		int lastday = c.getActualMaximum(Calendar.DATE); // 해당 월 마지막 날짜
//		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK); // 해당 날짜의 요일
//		c.set(Calendar.YEAR, year); // 입력받은 year를 year로 설정
//		for (int i = 1; i <= 12; i++) {
//			System.out.println("<< " + year + "년 " + i + "월 >>");
//			System.out.println("    일     월     화     수    목    금    토");
//			System.out.println(c.get(Calendar.DAY_OF_WEEK));
//			for(int i = )
//			
//		}

		}

	@Override
	public void printmonth(int year, int month) {
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);
		int lastday = c.getActualMaximum(Calendar.DATE); // 해당 월 마지막 날짜
		int dayOsWeek = c.get(Calendar.DAY_OF_WEEK); // 해당 날짜의 요일
		
			System.out.println("<< " + year + "년 " + month + "월 >>");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
//			System.out.println(c.get(Calendar.DAY_OF_WEEK));
		for(int i = 1; i < c.get(Calendar.DAY_OF_WEEK);i++) {
			System.out.print("\t");
//			dayOsWeek++;
			
		}
		for(int i = 1; i<=lastday;i++) {
			System.out.print(i+"\t");
			if(dayOsWeek % 7 == 0 ) {
				System.out.println();
			}
			dayOsWeek++;
//			System.out.println(dayOsWeek);
		}
		System.out.println();
	}
	
}
