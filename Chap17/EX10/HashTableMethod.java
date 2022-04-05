package Chap17.EX10;

//Map<k,V> : K <= key, V <= Value �������� �����͸� ����.
	//Key�� �ߺ��� �� ����. <== Set���� ����.	index�� �ƴϴ�, index 0 ���� �Ҵ�, JVM�Ҵ�.
	//Value�� �ߺ��� ���� ������ ����.

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableMethod {

	public static void main(String[] args) {

		Map<Integer,String> hTable1 = new HashMap<>();
		
		//1. put(K key, V value) : ���� ������.
		hTable1.put(2, "���ٶ�");
		hTable1.put(1, "������");
		hTable1.put(3, "�ٶ�");	//Ű�� �ߺ��Ǽ� ���� �� �� ����. ���� ���� ��� ������ ���� �����ȴ�.
		//hMap1.put(3, "������");
		System.out.println(hTable1);
		
		//2. putAll(�ٸ��ɰ�ü) : �ٸ� ���� �����ؼ� ���.
		Map<Integer, String> hTable2 = new Hashtable();
		hTable2.putAll(hTable1);
		System.out.println(hTable2);
		
		//3. replace(K key, V value); key�� ����� ���� value�� ����
		hTable2.replace(1, "������");
		hTable2.replace(4, "����");	//key4�� �������� �ʴ´�. �۵��� �ȵ�(���ܵ� �ƴ϶� �߻��ȵ�)
		System.out.println(hTable2);
		
		//4. replace(K key, V oldValue, V newValue)	: oldValue�� newValue�� ����
		hTable2.replace(1, "������", "������");
		hTable2.replace(2, "�ٴٴ�", "������");	//key�� value�� ��Ȯ�� ��ġ�ؾ� ������.
		
		System.out.println(hTable2);
		
		//5. get(Object key)	: Map�� ���� �����ö�. Key�� �־���� Key�� �Ҵ�� Value�� ���.
		System.out.println(hTable2.get(1));	//���� 1�� index�� �ƴ϶� key
		System.out.println(hTable2.get(2));
		System.out.println(hTable2.get(3));
		
		//6. containsKey(Object key); �ʿ� �ش�Ű�� �����ϴ��� Ȯ��
		System.out.println(hTable2.containsKey(1));
		System.out.println(hTable2.containsKey(5));
		
		//7. containsKey(Object key); �ʿ� �ش簪�� �����ϴ��� Ȯ��
		System.out.println(hTable2.containsValue("������"));
		System.out.println(hTable2.containsValue("������"));
		
		//8. Set<K> keySet() : Ű�� ����
		Set<Integer> keySet = hTable2.keySet();	//hTable2�� ����� keySet�� ����
		System.out.println(keySet);
		
		//9.Set<Map.Entry<K,V>>	entrySet()	: Ű�� ���� ���� ����
		Set<Map.Entry<Integer, String>> entrySet = hTable2.entrySet();
		System.out.println(entrySet);
		
		//10. size(); �� ����
		System.out.println(hTable2.size());
		
		//11. remove(Object key)	<= �ش�Ű�� �־ value�� ����.
		hTable2.remove(1);
		hTable2.remove(4);
		System.out.println(hTable2);
		
		//12. remove(Object key, Object value) 	: key�� value�� ��Ȯ�ϰ� ��ġ�Ҷ� ����
		hTable2.remove(2, "���ٶ�");
		hTable2.remove(3, "�ٴٴ�");
		System.out.println(hTable2);
		
		//13. clear() : ��� ����
		hTable2.clear();
		System.out.println(hTable2);
		
		
		
	}

}
