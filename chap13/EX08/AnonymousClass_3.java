package chap13.EX08;

//Ŭ���� ���� �� ���� ���� ���/ �̻���� ��� �Ű������� ��ü�� ����

interface A{
	public abstract void abc();
}

//1. �ڽ�Ŭ������ ���� ����
class B implements A{
	@Override
	public void abc() {
	System.out.println("�Ű����� ����");	
	}
}

class C{		//cde�޼ҵ忡 ��ǲ������ A Ÿ���� ��ü a�� ��ǲ���� �޴´�.
	void cde(A a) {		//cde�޼ҵ带 ȣ���ϸ鼭 �Ű����� ������ AŸ���� ��ü�� �����Ѵ�.
		a.abc();
	}
}

public class AnonymousClass_3 {

	public static void main(String[] args) {

	//1���� ���	: Ŭ������ + ���� ������
	C c = new C();	
	
	A a = new B();	//Ŭ������(B), ���� ���� ����(a)	<===ù��° ���
	
	c.cde(a);		//�Ű������� ��üa�� �����ؼ� ������
	
	System.out.println("======================================");
	
	//2��° ���	: Ŭ������ + ���� ������x
	c.cde(new B());
	
	
	}

}
