package kr.ac.kopo.day10;

public class Manager01 {

	int no;
	String name;
	int salary;
	String grade;
	Employee[] empList;		// 관리사원 목록 저장목적으로 생성한다
	
	Manager01(int no , String name, int salary, String grade, Employee[] empList){
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	}
	
	void info() {
		System.out.println("관리자 번호 : "+no+" 관리자 이름 : "+name+" 연봉 : "+salary+" 직급 : "+grade);
		System.out.println("===========================");
		System.out.println("\t<관리사원 목록>");
		for(Employee e : empList){
			e.info();
		}
		System.out.println("===========================");
	}
}
