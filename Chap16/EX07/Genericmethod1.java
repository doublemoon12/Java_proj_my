package Chap16.EX07;

//제너릭 클래스 : 클래스를 선언 할때 타입변수를 선언 해준다 <T>, 객체를 생성시 T에 적용할 타입을 지정

//제너릭 메소드 : 일반 클래스 내부에 메소드 선언시 제너릭 타입변수를 사용.

class Genericmethod{	//일반 클래스
	public <T> T method1(T t) {		//제너릭 메소드 : 1개
		return t;
	}
	
	public <T> boolean method2(T t1, T t2) {	//제너릭 메소드 : 1개
		return t1.equals(t2);					//두 값을 비교 true, false리턴
	}											//기본 자료형일때는 값을 비교. 참조 자료형일때는 객체의 주소를 비교
												//String일 경우, 값을 비교
	public<K, V> void method3(K k, V v) {	//제너릭 메소드 : 2개
		System.out.println(k + " : " + v);
	}
	
	public<K, V> void method4() {
		System.out.println("매개 변수가 인풋값으로 없는경우 오류");
	}
	
}

public class Genericmethod1 {

	public static void main(String[] args) {
		//1. 일반 클래스 객체를 생성후 제너릭 메소드 호출
		Genericmethod gm = new Genericmethod();
		
		String str1 = gm.<String>method1("안녕");
		String str2 = gm.method1("안녕");		//타입을 알 수 있는 경우 생략 가능(매개변수로 값이 들어갈때 생략가능)
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("============================");
		
		Integer i = gm.<Integer>method1(100);
		Integer i2 = gm.<Integer>method1(200);
		System.out.println(i);
		System.out.println(i2);
		
		boolean b1 = gm.<Boolean>method1(true);
		boolean b2 = gm.<Boolean>method1(true);
		System.out.println(b1);
		System.out.println(b2);
		
		Boolean d1 = gm.<Double>method2(2.55, 2.55);
		Boolean d2 = gm.<Double>method2(2.55, 2.45);
		System.out.println(d1);
		System.out.println(d2);
		
		gm.<String, Integer>method3("국어", 90);
		gm.method3("영어", 80); 		//매개변수로 인풋되는 데이터 타입을 추정할 수 있는경우 생략 가능
		
		gm.<Integer, String>method3(500, "서버 에러 입니다");
		gm.method3((404), "파일을 찾을수 없습니다");
		
		gm.method4();
		
	}

}
