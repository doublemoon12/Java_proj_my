package chap10.EX04;

//�޼ҵ� �������̵��� ���� �����ڿ��� ����
	//�ڽ��� Ŭ�������� �θ��� �޼ҵ带 ������ �� ��� ���� �����ڴ� �θ�� ���Ŵ� �о�� �Ѵ�.

class Aaa{
	protected void abc() {}
}

class Bbb extends Aaa{
	@Override
	public void abc() {}
	
}

class B2 extends Aaa{
	@Override
	protected void abc() {}
}

class B3 extends Aaa{
	//@Override
	//void abc() {}	//���� : �������̵� �� �޼ҵ忡 ���� ������ ����(�θ𺸴� ���������ڰ� ���ų� �о�� �Ѵ�.)
}

class B4 extends Aaa{
	//@Override
	//private void abc() {}	//���� : �������̵� �� �޼ҵ忡 ���� ������ ����
}


public class MethodOverriding_3 {

	public static void main(String[] args) {

		
		
	}

}
