package kr.ac.kopo.day10;

class One{
	One(){
		System.out.println("One 생성자 호출....");
	}
}

class Two extends One{					// One 클래스를 상속받다.
	Two(){
//      super();						// super가 생략되어있음. => 자동으로 One 생성자 생성
		System.out.println("Two 생성자 호출....");
	}
}

class Three extends Two{
	Three(){
//		super();							// 여기서 super()는 Two클래스(부모클래스)를 가르킴
		System.out.println("Three 생성자 호출...");
	}
}




public class ExtendsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Three();				
	}

}
