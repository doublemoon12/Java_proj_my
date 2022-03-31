package Chap17.EX01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// java.lang 패키지의 클래스들은 import가 필요 없다.
// 그외의 클래스들은 import가 필요하다.

/*
 * 컬렉션 	: 동일한 자료형을 저장. 방의 크기가 동적으로 변화. 
 * 배열		: 동일한 자료형을 저장. 방의 크기가 고정 되어있다. 배열 생성시 방의 크기를 지정, 방의 크기는 수정 불가.
 * 
 * List<E> 	: 인터페이스, 제너릭 인터페이스 : 다양한 데이터 타입을 사용 가능
 * 			: 인덱스(방번호)를 가지고 있다. 방의 크기는 동적으로 변한다.
 * 		- 
 * 		- ArrayList<E>	: 싱글 스레드 환경에서 사용. 검색은 빠르나 값을 추가하거나 삭제할때는 느리다.
 * 		- Vector<E>		: 멀티 스레드 환경에서 사용. 모든 메소드가 동기화 되어있다.
 * 		- LinkedList<E>	: 검색은 느리나 값을 추가하거나 삭제할때 빠르다.
 */
 

public class ArrayList_1 {

	public static void main(String[] args) {
		//1. 배열
		String[] array = new String[] {"가", "나", "다", "라", "마", "바", "사"};	//방의 크기를 지정하면 안된다.
		System.out.println(array.length);
		array[2] = null;
		array[5] = null;
		System.out.println(array.length);
		
		//1) Array.toString(배열변수)
		System.out.println(Arrays.toString(array));	
		
		//2) for문을 사용해서 출력
		for(int i = 0; i < array.length; i++) {
			if(i == array.length -1) {	//마지막 방 번호에서는 , 를 출력하지 마라.
				System.out.println(array[i]);
			}else {
				System.out.print(array[i] + ", ");
			}
		}
		//3) Enhanced for문을 사용해 출력
		for(String k : array) {
			System.out.print(k + ", ");	
		}
		
		System.out.println();
		System.out.println("=============================");
		
		//2. List : 인터페이스, 객체생성을 할 수 없다, 타입은 지정가능
		List<String> aList1 = new ArrayList<String>();
		List<String> aList2 = new ArrayList<>();
		List<String> aList3 = new ArrayList();
		
		//List에서 방의 갯수 출력 : aList.size();	<=== List
		System.out.println(aList1.size());	//방의 크기는 : 0
		
		//List에 값 할당 하기 : aList.add(값)
		aList1.add("가");aList1.add("나");aList1.add("다");aList1.add("라");aList1.add("마");aList1.add("바");aList1.add("사");
		//List에 저장된 데이터의 갯수 구하기 : aList.size();
		System.out.println(aList1.size());
		System.out.println();
		
		//List에 저장된 값을 제거 : aList.remove("삭제할 내용")
		aList1.remove("다");
		aList1.remove("바");
		System.out.println(aList1.size());
		
		
		//List는 index를 가지고 있다.(for문으로 처리)
		for(int i = 0; i < aList1.size(); i++) {	//aList.size() : 방의 갯수 출력
			if(i == aList1.size() -1) {	//마지막 방 번호에서는 , 를 출력하지 마라.
				System.out.println(aList1.get(i));
			}else {
				System.out.print(aList1.get(i) + ", ");
			}
		}
		//Enhanced for문을 사용하여 출력
		for(String k : aList1) {
			System.out.print(k + ", ");
		}
		
		System.out.println();
		
		//객체의 toString()을 호출해서 출력
		System.out.println(aList1);		//List는 toString메소드가 재정의 되어있다.
		
	}

}
