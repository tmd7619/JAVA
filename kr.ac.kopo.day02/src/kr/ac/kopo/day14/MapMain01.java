package kr.ac.kopo.day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * Map : Key, value의 쌍으로 구성된 데이터의 집합, 키에대한 중복x 순서 x 
 * 구현 클래스 : HashMap, TreeMap
 * 
 */


public class MapMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Key : ID , value : 비밀번호
		Map<String , String > map = new HashMap<>();
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("패스워드 변경서비스입니다");
		System.out.println("ID를 입력하세요 : ");
		String id = sc.nextLine();
		if(!map.containsKey(id)) {
			System.out.println("입력하신 ID ["+id+"]는 존재하지 않습니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
		System.out.println("현재 패스워드를 입력하세요 : ");	 //  System.exit(0)로 인해 else 구문 기능과 똑같다.
		String password = sc.nextLine()	;
		if(!map.get(id).equals(password)) { // == 로 비교하면 안됨! ( ==로하게 되면 주소값 비교로 하게됨)
			System.out.println("패스워드가 잘못되었습니다");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
		
		System.out.println("변경할 패스워드를 입력하세요 : "); // .equals 가 true일때
		String newPassword = sc.nextLine()	;
		map.put(id, newPassword);
		
		System.out.println("패스워드가 변경되었습니다.");
		
		// map 출력은 어떻게? ==> entrySet()   
		// 실제 map이 가지고 있는 key, value값은 Map의 inner class인 Entry가 가지고 있음 // 클래스 앞에 $표시가 있으면 inner클래스 
		// 따라서 map의 데이터 출력은 Entry의 키밸류 값을 set으로 변환하여 출력한다.
		System.out.println("<< 전체 회원 정보 출력 >>");
//		Set<Map.Entry<String, String>> entrySet = map.entrySet(); // import java.util.Map.Entry를 통해 Map 생략 가능
		Set<Entry<String, String>> entrySet = map.entrySet();
		for(Entry<String, String> e : entrySet) {
			System.out.println("ID : "+e.getKey()+", PASSWORD : "+e.getValue());
		}
		
		
		Iterator ite = map.entrySet().iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		Set<String> keys =  map.keySet();
		for(String key : keys) {
			System.out.println("ID : " + key + ", PASSWORD : " + map.get(key));
		}
	}

}




