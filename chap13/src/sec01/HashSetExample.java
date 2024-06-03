package sec01;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		//추가
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");	// set 클래스 객체는 중복을 허용하지 않아 무시가 됨
		set.add("iBATIS");
		
		//검색
		int size = set.size();
		System.out.println("총 객체 수: " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		//삭제
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체 수: " + set.size());
		
		iterator = set.iterator();
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear();
		if(set.isEmpty()) { System.out.println("비어 있음"); }
	}
}
