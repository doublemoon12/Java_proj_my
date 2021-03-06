package Chap16.Ex04;

//제너릭 클래스 : 매개변수 (Argument : 2개) 
class KeyValue<K,V>{
	private K key;
	private V value;
	
	//getter : 필드의 값을 가져옴, setter : 필드의 값을 할당
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	
}

public class TwoGenericArgument {

	public static void main(String[] args) {

		KeyValue<String, Integer> kv1 = new KeyValue<String, Integer>();
		//KeyValue<String, Integer> kv1 = new KeyValue();	생성자에서는 생략 가능하다
		kv1.setKey("사과");
		kv1.setValue(1000);
		System.out.println(kv1.getKey() + " : " + kv1.getValue());
		
		System.out.println("==============================");
		
		KeyValue<Integer, String> kv2 = new KeyValue();
		kv2.setKey(404);
		kv2.setValue("Not Found(요청한 페이지를 찾을 수 없습니다.)");
		System.out.println(kv2.getKey() + " : " + kv2.getValue());
		
		System.out.println("==============================");
		
		KeyValue<String, Double> kv3 = new KeyValue();
		kv3.setKey("평균값");
		kv3.setValue(55.555);
		System.out.println(kv3.getKey() + " : " + kv3.getValue());
		
		System.out.println("==============================");
		
		//중요 : 특정 타입을 사용하지 않을 경우 Void키를 사용한다, 메소드에서 리턴이 없을때 사용
		KeyValue<String, Void> kv4 = new KeyValue();
		kv4.setKey("키 값만 사용");
		//kv4.setValue(1111); 		//Void를 사용 했기때문에 사용불가
		System.out.println(kv4.getKey());
		
		
	}

}
