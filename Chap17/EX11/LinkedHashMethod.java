package Chap17.EX11;

//Map<k,V> : key는 중복되지 않는다. <== Set으로 관리된다.
//HashMap vs LinkedHashMap
	//HashMap<K,V>	: 입력과 출력이 다를 수 있따. 출력이 랜덤하게 출력.
	//LinkedHashMap<K,V>	: Key는 링크 되어 있다. 앞뒤값의 정보를 가진다.

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMethod {

	public static void main(String[] args) {

		Map<Integer,String> lhMap1 = new LinkedHashMap<>();
		
		//1. put(K key, V value) : 값을 넣을때.
		lhMap1.put(2, "나다라");
		lhMap1.put(1, "가나다");
		lhMap1.put(3, "다라마");	//키는 중복되서 저장 될 수 없다. 값을 넣을 경우 기존의 값이 수정된다.
		//hMap1.put(3, "가가가");
		System.out.println(lhMap1);
		
		//2. putAll(다른맴객체) : 다른 맵을 복사해서 사용.
		Map<Integer, String> hTable2 = new Hashtable();
		hTable2.putAll(lhMap1);
		System.out.println(hTable2);
		
		//3. replace(K key, V value); key에 저장된 값을 value로 수정
		hTable2.replace(1, "가가가");
		hTable2.replace(4, "라라라");	//key4는 존재하지 않는다. 작동이 안됨(예외도 아니라 발생안됨)
		System.out.println(hTable2);
		
		//4. replace(K key, V oldValue, V newValue)	: oldValue를 newValue로 수정
		hTable2.replace(1, "가가가", "나나나");
		hTable2.replace(2, "다다다", "나나나");	//key와 value가 정확히 일치해야 수정됨.
		
		System.out.println(hTable2);
		
		//5. get(Object key)	: Map의 값을 가져올때. Key를 넣어줘야 Key에 할당된 Value를 출력.
		System.out.println(hTable2.get(1));	//주의 1은 index가 아니라 key
		System.out.println(hTable2.get(2));
		System.out.println(hTable2.get(3));
		
		//6. containsKey(Object key); 맵에 해당키가 존재하는지 확인
		System.out.println(hTable2.containsKey(1));
		System.out.println(hTable2.containsKey(5));
		
		//7. containsKey(Object key); 맵에 해당값이 존재하는지 확인
		System.out.println(hTable2.containsValue("나나나"));
		System.out.println(hTable2.containsValue("하하하"));
		
		//8. Set<K> keySet() : 키만 추출
		Set<Integer> keySet = hTable2.keySet();	//hTable2에 저장된 keySet을 추출
		System.out.println(keySet);
		
		//9.Set<Map.Entry<K,V>>	entrySet()	: 키와 값의 셋을 추출
		Set<Map.Entry<Integer, String>> entrySet = hTable2.entrySet();
		System.out.println(entrySet);
		
		//10. size(); 총 갯수
		System.out.println(hTable2.size());
		
		//11. remove(Object key)	<= 해당키를 넣어서 value를 삭제.
		hTable2.remove(1);
		hTable2.remove(4);
		System.out.println(hTable2);
		
		//12. remove(Object key, Object value) 	: key와 value가 정확하게 일치할때 삭제
		hTable2.remove(2, "나다라");
		hTable2.remove(3, "다다다");
		System.out.println(hTable2);
		
		//13. clear() : 모두 삭제
		hTable2.clear();
		System.out.println(hTable2);
		
		
		
	}

}
