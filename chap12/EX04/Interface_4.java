package chap12.EX04;

//�������̽� ��ӽ� �ڽ� Ŭ���� ���� ������ ����
	//�������̽��� �޼ҵ带 ���� �Ҷ� �ݵ�� public�� ����ؾ� �Ѵ�.
interface A {
	public abstract void abc();
}

class F implements A{	//F Ŭ������ �ϼ��� �޼ҵ尡 �����Ǿ� �־�� �Ѵ�.

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}	
	
}

interface B{	//public abstract�� ���� �Ǿ���.
	void abc();
}

class C implements A{
	public void abc() {	//A�������̽��� abc()�� �������̵��ؼ� ������ �޼ҵ�
					//�ڽ��� �θ𺸴� ���������ڰ� ���ų� �о�� �Ѵ�.
	}
}

class D implements B{
	public void abc() {		//�������̽��� �޼ҵ带 ������ ���� �ݵ�� public ���������ڸ� ����ؾ� ����.
	}
}

class E implements B{

	@Override
	public void abc() {
		
	}
	
}
public class Interface_4 {

	public static void main(String[] args) {

	}

}
