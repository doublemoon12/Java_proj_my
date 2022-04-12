package chap10.ex05.ex02;

class A{
	String name;
	A(String name){
		this.name = name;
	}
}

class B{
	String name;
	B(String name){
		this.name = name;
	}
	@Override							//b1.equals(b2)
	public boolean equals(Object obj) {		//��ü�� �Ű������� ���� �� ObjectŸ������ �ڵ����� ��ĳ����
		if(this.name == ((B)obj).name) {	//BŸ������ �ٿ�ĳ������ �� ��ü�� name�ʵ� ���� ��.
			return true;
		}else {
			return false;
		}
	}
}

public class ObjectMethod_Equals {

	public static void main(String[] args) {
		
		A a1 = new A("�ȳ�");
		A a2 = new A("�ȳ�");
		
		/*�ΰ�ü ��(==, equals())
			== : �⺻ Ÿ���� ��� ���� ���Ͽ� true, false�� ����
			   : ���� Ÿ���� ��� ��ä�� ������ ��
			equals() : �⺻������ objectŬ������ equals()�� ��ü�� ������ ��
				��ü ������ Ư�� �ʵ��� ���� ���ϱ� ���ؼ� ������ �ؼ� ����Ѵ�.
		*/
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		
		System.out.println("==========================");
		
		B b1 = new B("�ȳ�");
		B b2 = new B("�ȳ�");
		
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		
	}

}
