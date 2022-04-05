package Chap17.EX08;

import java.util.Comparator;
import java.util.TreeSet;

//TreeSet의 잇점 : 1. 중복저장 되지 않는다. 2. 오름차순 정렬되어서 입력이 된다. 3. 정렬되어 출력(오름차순), 4. 검색기능을 사용, 5. 특정범위의 값을 추출, 6. asc(오름차순 정렬), desc(내림차순 정렬)
				//
//TreeSet에 일반 객체를 저장할 경우, 특정 필드를 크기비교하는 기준필드가 존재해야한다.
	//1. Comparable<E> 인터페이스의 compareTo() : TreeSet에 일반 객체를 저장할때 일반객체의 특정 필드를 재정의해야 한다.
	//기존의 클래스를 수정해서 사용
	//2. Comparable<E> 인터페이스의 compare()를 재정의 함.
	//기존의 객체를 수정하지 않고 사용할떄
	//TreeSet<E> 객체를 생성할때 생성자에 Comparator<E> 인터페이스를 구현한 익명 객체를 생성.
	//3. 익명 내부객체를 사용해서 처리하는 방법.

class MyClass{
	int data1;
	int data2;
	
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	@Override
	public String toString() {
		return data1 + " " + data2;
	}
}
//Comparable<E> 인터페이스를 구현한 클래스 생성
class MyComparableClass implements Comparable<MyComparableClass>{
	int data1;
	int data2;
	
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	@Override
	public int compareTo(MyComparableClass o) {	//객체의 크기비교 기준을 설정하는 메소드, <<TreeSet에서 사용>>	(음수, 0, 양수)
		//오름차순 처리 방식
		/*if(this.data1 < o.data1) {			//this.data1 기준값이 작을경우 : -1
			return -1;
		}else if(this.data1 == o.data1) {	//this.data1 기준값이 같을경우 : 0
			return 0;
		}else {								//this.data1 기준값이 클경우 : 1
			return 1;
		}
		*/
		//내림차순 처리 방식
		if(this.data1 < o.data1) {			//this.data1 기준값이 작을경우 : 1
			return 1;
		}else if(this.data1 == o.data1) {	//this.data1 기준값이 같을경우 : 0
			return 0;
		}else {								//this.data1 기준값이 클경우 : -1
			return -1;
		}
	}
	
	
	@Override
	public String toString() {
		return data1 + ", " + data2;
	}
}

public class TreeSetMethod_2 {

	public static void main(String[] args) {

		//Wrapper 클래스는 comparable<E> 인터페이스의 compareTo()를 재정의 하고 있다.
			//Wrapper클래스의 값을 TreeSet에 넣으면 정렬되어 저장.
		
		//1. Integer wrapper클래스의 크기 비교
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
		Integer intValue1 = new Integer(20);	//큰값
		//Integer intValue1 = 3;
		Integer intValue2 = new Integer(10);	//작은값
		
		treeSet1.add(intValue1);	
		treeSet1.add(intValue2);	
		
		System.out.println(treeSet1);	//오름차순 정렬 출력
		
		//2. String wrapper클래스의 크기 비교.
		TreeSet<String> treeSet2 = new TreeSet<String>();
		String str1 = new String("가나");		//작은값
		//String str1 = "가나";
		String str2 = new String("다라");		//큰값
		
		treeSet2.add(str1);		//treeSet2.add()를 사용해서 객체를 저장할 경우 값의 크기를 비교하는 필드가 정의가 되어있어야 한다.
		treeSet2.add(str2);		//Comparable<E> 인터페이스의 compareTo()가 재정의 되어야 한다.
		System.out.println(treeSet2);
		
		//3. MyClass가 TreeSet에 저장이 될까?(저장되지 못한다)Comparable<E> 인터페이스의 compareTo()가 재정의 되어야 한다.
//		TreeSet<MyClass> treeSet3 = new TreeSet<MyClass>();
//		MyClass myClass1 = new MyClass(2, 5);
//		MyClass myClass2 = new MyClass(3, 3);
//		
//		treeSet3.add(myClass1);
//		treeSet3.add(myClass2);
//		
//		System.out.println(treeSet3);
		
		//4. 방법 1) MyCompareableClass 객체 크기 비교.
		//컴파일 다시필요
		TreeSet<MyComparableClass> treeSet4 = new TreeSet();
		MyComparableClass m1 = new MyComparableClass(2, 5);
		MyComparableClass m2 = new MyComparableClass(5, 3);
		MyComparableClass m3 = new MyComparableClass(4, 3);
		
		
		treeSet4.add(m1);
		treeSet4.add(m2);
		treeSet4.add(m3);
		System.out.println(treeSet4);
		
		System.out.println();
		
		//5. 방법 2) 기존의 객체를 수정하지 않고 TreeSet에 저장할 경우.
		//TreeSet생성자 내부에 Comparator<E> 인터페이스를 정의해서 익명 객체로 구현
		TreeSet<MyClass> treeSet5 = new TreeSet<MyClass>(new Comparator<MyClass>() {
			//Comparator<MyClass>를 구현한 익명 자식클래스 블락
			@Override
			public int compare(MyClass o1, MyClass o2) {	//오름 차순 정렬(data1컴럼을 기준으로 처리)
				if(o1.data1 < o2.data1) {
					return -1;
				}else if(o1.data1 == o2.data2) {
					return 0;
				}else {
					return 1;
				}
			}
		});
		
		MyClass myClass1 = new MyClass(2,5);
		MyClass myClass2 = new MyClass(3,3);
		
		treeSet5.add(myClass1);
		treeSet5.add(myClass2);
		
		System.out.println(treeSet5);
		
		
		
		
	}

}
