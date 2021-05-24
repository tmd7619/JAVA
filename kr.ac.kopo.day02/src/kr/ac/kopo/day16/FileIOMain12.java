package kr.ac.kopo.day16;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileIOMain12 {

	
	public static void write() {
		
		UserVO user = new UserVO("홍길동",26,"010-1111-2222","서울시 서초구");
		UserVO user2 = new UserVO("구길동",23,"010-2323-2222", "경기도 광명시 철산구");
		UserVO user3 = new UserVO("박길동",25,"010-5533-2323","서울시 송파구");
		
		
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(user);
		list.add(user2);
		list.add(user3);
		
		FileOutputStream fos = new FileOutputStream("iodata/UserVO.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
	}
	
	
	public static void main(String[] args) {
		write();
		
	}
}
