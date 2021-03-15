package kr.ac.kopo.day06;

// 실행클래스 

// 자동초기화 int는 0, String은 NULL;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c  = new Car();
		
		c.name = "소나타";
		c.price = 3200;
		c.company = "현대";
		
		Car c2 = new Car();
		c2.name = "K5";
		c2.price = 3000;
		c2.company = "기아";
		
	}

}
