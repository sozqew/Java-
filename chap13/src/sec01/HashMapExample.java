package sec01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);	//중복이 되어 overwrite
		System.out.println("총 Entry 수: " + map.size());	//3
		
		//객체 찾기
		System.out.println("\t홍길동: " + map.get("홍길동"));	//95
		System.out.println();
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();	// key 값만 iterator
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);	// 값을 꺼내옴
			System.out.println("\t" + key + ": " + value);
		}
		System.out.println();
		
		//객체 삭제
		map.remove("홍길동");	//key 값으로 entry 객체를 제거
		System.out.println("총 Entry 수: " + map.size()); //2
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();	//key 와 value 모두 iterator
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();		//키 가져오기
			Integer value = entry.getValue();	//값 가져오기
			System.out.println("\t" + key + ": " + value);
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수: " + map.size()); // 0
	}
}
