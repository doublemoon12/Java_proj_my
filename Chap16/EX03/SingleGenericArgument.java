package Chap16.EX03;

//Object		: ��� ��ü�� ������ �� ������, �ٿ�ĳ������ �ʿ��ϴ�, ĳ���ý� ���ܰ� �߻��� �� �ִ�.(���� Ÿ�� üũ)
//Generic class	: �ϳ��� Ŭ�������� �پ��� ������ Ÿ���� ó�� �� �� �ִ�.
	//Generic Ÿ�� ���� : T(Ÿ��), K(Key), V(Value), N(Number, ����), E(Element, ����)
		//A ~ Z ���� ���Ƿ� ���� �� �ִ�.
		//wrapperŬ������ �� �� �ִ�. : �⺻Ÿ���� ��üȭ ���� ���� Ŭ�����̴�.
			//int (�⺻Ÿ��) ==> Integer(��ü), boolean ==> Boolean, char ==> Charter, double ==> Double, float ==> Float
			//byte ==> Byte, short ==> Short, long ==> Long, 
//Generic class
class MyClass<T>{
	private T t;
	
	public T get() {		//getter : �ʵ��� ���� ������
		return t;
	}
	public void set(T t) {	//setter : �ʵ��� ���� �Ҵ�
		this.t = t;
	}
	
}
	


public class SingleGenericArgument {

	public static void main(String[] args) {
		//1. Generic class ��ü ����	�ڷ���<String>�� �Է�
		MyClass<String> mc1 = new MyClass<String>();
		mc1.set("�ȳ�");
		System.out.println(mc1.get());
		
		//2. Generic class ��ü ����	�ڷ���<Ineger>�� �Է�
		MyClass<Integer> mc2 = new MyClass<Integer>();	//wrapper Ŭ������ �Ҵ� ��� �Ѵ�.
		mc2.set(100);
		System.out.println(mc2.get());
		
		//3. Generic class ��ü ����	�ڷ���<Double>�� �Է�
		MyClass<Double> mc3 = new MyClass();	//�������� �ڷ����� ���� ����
		mc3.set(100.33);
		System.out.println(mc3.get());
		
		//4. ���� Ÿ�� üũ(������ �ܰ迡�� ������ �������)
		MyClass<Boolean> mc4 = new MyClass<Boolean>();
		mc4.set(true);
		mc4.set(false);
		//mc4.set("�ȳ�");	//���� Ÿ�� üũ, ����ÿ� ������ ���� ������
		
		
		
		
	}

}
