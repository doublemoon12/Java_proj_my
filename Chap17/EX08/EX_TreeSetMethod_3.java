package Chap17.EX08;

import java.util.Comparator;
import java.util.TreeSet;

//이름과 나이를 입력했을때 이름기준 오름차순으로 출력 하도록 구현. TreeSet에 name 컬럼을
//1. Comparable<E>의 compare()메소드 재정의
	//기존의 객체수정이 필요
//2. Comparator<E>의 compare()구현
	//기존의 객체를 수정없이 구현
class Abc{
	String name;	//<<정렬컬럼, 오름차순 정렬>> 홍길동, 이순신, 강감찬
	int age;
	
	public Abc(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}
}

class Abc_T implements Comparable<Abc_T>{
	String name;	//<<정렬컬럼, 오름차순 정렬>> 홍길동, 이순신, 강감찬
	int age;
	
	public Abc_T(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}
	@Override
	public int compareTo(Abc_T o) {
		return age;
	}
	
}

public class EX_TreeSetMethod_3 {

	public static void main(String[] args) {

		TreeSet<Abc_T> abc_T = new TreeSet();
		Abc_T a3 = new Abc_T("홍길동", 20);
		Abc_T a1 = new Abc_T("강감찬", 30);
		Abc_T a2 = new Abc_T("이순신", 40);
		
		
		abc_T.add(a1);
		abc_T.add(a2);
		abc_T.add(a3);
		
		System.out.println(abc_T);
		
		TreeSet<Abc> abc = new TreeSet<Abc>(new Comparator<Abc>() {

			@Override
			public int compare(Abc o1, Abc o2) {
					return 1;
				}
		});
		Abc a4 = new Abc("홍길동", 20);
		Abc a5 = new Abc("강감찬", 30);
		Abc a6 = new Abc("이순신", 40);
		
		
		abc.add(a4);
		abc.add(a5);
		abc.add(a6);
		
		System.out.println(abc);
	}

}

