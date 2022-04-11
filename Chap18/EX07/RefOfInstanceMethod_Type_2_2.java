package Chap18.EX07;

interface AA{
	int abc(String str);
}

public class RefOfInstanceMethod_Type_2_2 {

	public static void main(String[] args) {

		//인스턴스 메소드 참조 Type : 정적메소드 참조
		//1. 익명이너클래스
		AA a1 = new AA() {
			@Override
			public int abc(String str) {
				return str.length();
			}
		};
		
		//2. 람다 표현식
		AA a2 = (String str) -> {return str.length();};
		
		//3. 인스턴스 메소드 참조 Type2
		AA a3 = String::length;			//String::lenght  객체명::메소드
		
		System.out.println(a1.abc("안녕"));
		System.out.println(a2.abc("누구야"));
		System.out.println(a3.abc("나야나다"));
		
		
		
		
	}

}
