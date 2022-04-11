package Chap18.EX03;

import java.util.Scanner;

//1. 스캐너를 사용해서 double 의 두수를 인풋 받습니다. 
//2. 방법1. 람다식을 사용해서 인풋받은 두값을 +, - , *, / , 사칙연산을 구현해서 출력. 
//3. 방법2. 인터페이스를 구현한 자식 객체 사용해서 인풋받은 두값을 +, - , *, / , 사칙연산을 구현해서 출력. 
//4. 방법3. 익명이너클래스을 사용해서 인풋받은 두값을 +, - , *, / , 사칙연산을 구현해서 출력. 
//5. ArithmeticException 처리 : 0 으로 나누면 예외 발생 이되므로 예외 처리 , int (0) ,  double <== 해당 사항이 아님. 

//완료시간 : 13:10분 까지 , p.jangwoo@gmail.com, 팀장님께도 전송. 


@FunctionalInterface
interface Arithmetic {
	void arithmeticOpr(double a, double b); 
}

//2번째 
class ArithmeticImpl implements Arithmetic{
	@Override
	public void arithmeticOpr(double a, double b) {
		System.out.println("a + B :"+ (a + b) +  " , " + "a - b :" + (a - b) +
				" , " + "a * b : " + (a * b ) + " , " + " a / b : " + (a / b) );
		
	}
}


public class ArithmeticOperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("두 실수를 공백을 구분해서  입력 하세요>>");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		//1. 람다식 : 인터페이스의 추상메소드를 익명 이너 클래스로 생성한것의 약식표현이다. 
		
		Arithmetic a1 = (x,y) -> { System.out.println("a + b :"+ (x + y) +  " , " + "a - b :" + (x - y) +
				" , " + "a * b : " + (x * y ) + " , " + " a / b : " + (x / y) );};
		
		a1.arithmeticOpr(a, b);
		
		//2. 인터페이스를 구현한 클래스 생성후 메소드 호출
		
		Arithmetic a2 = new ArithmeticImpl(); 
		a2.arithmeticOpr(a, b);
		
		//3. 익명 이너 클래스로 출력 
		Arithmetic a3 = new Arithmetic() {
			@Override
			public void arithmeticOpr(double a, double b) {
				System.out.println("a + B :"+ (a + b) +  " , " + "a - b :" + (a - b) +
						" , " + "a * b : " + (a * b ) + " , " + " a / b : " + (a / b) );
				
			}
		}; 
		
		a3.arithmeticOpr(a, b);
		
		
	}

}
