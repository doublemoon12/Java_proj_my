package chap10.EX04;

//MethodOverriding
	// 1. �ݵ�� ��Ӱ��迡���� �޼ҵ� �������̵��� ���� �ȴ�.
	// 2. �θ� Ŭ�������� ����� �޼ҵ带 �ڽ� Ŭ�������� ���Ӱ� ���� �ؼ� ����ϴ°�.
	// 3. @Override��� ������̼�(@)�� ����ϸ� �޼ҵ� �����ǽ� ������ ���� �� �ִ�.
	// 4. �ñ״��İ� ���ƾ��Ѵ�. (�޼ҵ��, �Ű����� Ÿ��, �Ű����� ����)
	// 5. �޼ҵ��� ���� �����ڰ� ���ų� �о�� �Ѵ�.

class A{
	void print() {
		System.out.println("A Ŭ����");
	}
}

class B extends A{
	//@Override	//�޼ҵ� �������̵��� �ݵ�� �θ��� �޼ҵ带 ������ �ϵ��� ����
				//@Override ������̼��� ������� ���� ��� : ��Ÿ�� ���ų� ���Ŀ� ���� ���� ���
				//������ �޼ҵ�� ���ǵ�.
	void print() {
		System.out.println("B Ŭ����");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		//1. AŸ��
		A aa = new A();
		aa.print();			//AŬ������ print() ���
		
		//2. BŸ�� 
		B bb = new B();
		bb.print();			//BŬ������ print() ���
		
		//3. AŸ������ ��ĳ����	<=== B�� ��ĳ�����ؼ� AŸ������ �θ�
		A ab = new B();
		ab.print();			//BŬ������ print() ���
		//�߿�
			//ab.print()�� AŬ������ print()�� ȣ���ϸ� ���� ���ε��� ���� BŬ������ print()�� ��� 
		
	}

}
