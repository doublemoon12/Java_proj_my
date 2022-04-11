package Chap18.EX03;

import java.util.Scanner;

//1. ��ĳ�ʸ� ����ؼ� double �� �μ��� ��ǲ �޽��ϴ�. 
//2. ���1. ���ٽ��� ����ؼ� ��ǲ���� �ΰ��� +, - , *, / , ��Ģ������ �����ؼ� ���. 
//3. ���2. �������̽��� ������ �ڽ� ��ü ����ؼ� ��ǲ���� �ΰ��� +, - , *, / , ��Ģ������ �����ؼ� ���. 
//4. ���3. �͸��̳�Ŭ������ ����ؼ� ��ǲ���� �ΰ��� +, - , *, / , ��Ģ������ �����ؼ� ���. 
//5. ArithmeticException ó�� : 0 ���� ������ ���� �߻� �̵ǹǷ� ���� ó�� , int (0) ,  double <== �ش� ������ �ƴ�. 

//�Ϸ�ð� : 13:10�� ���� , p.jangwoo@gmail.com, ����Բ��� ����. 


@FunctionalInterface
interface Arithmetic {
	void arithmeticOpr(double a, double b); 
}

//2��° 
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
		System.out.println("�� �Ǽ��� ������ �����ؼ�  �Է� �ϼ���>>");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		//1. ���ٽ� : �������̽��� �߻�޼ҵ带 �͸� �̳� Ŭ������ �����Ѱ��� ���ǥ���̴�. 
		
		Arithmetic a1 = (x,y) -> { System.out.println("a + b :"+ (x + y) +  " , " + "a - b :" + (x - y) +
				" , " + "a * b : " + (x * y ) + " , " + " a / b : " + (x / y) );};
		
		a1.arithmeticOpr(a, b);
		
		//2. �������̽��� ������ Ŭ���� ������ �޼ҵ� ȣ��
		
		Arithmetic a2 = new ArithmeticImpl(); 
		a2.arithmeticOpr(a, b);
		
		//3. �͸� �̳� Ŭ������ ��� 
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
