package chap12.EX02;

//interface ������ Ŭ����,
	//Overriding : �ϼ��� �޼ҵ带 ���� �����ϴ� ��.
	//Implements : �̿ϼ��� �޼ҵ带 �ϼ���Ű�°�
	//extends	 : �θ�Ŭ������ ����� ��ӹ޾Ƽ� ����� Ȯ��

interface AA{
	void cry();		//�߻� �޼ҵ�, public abstract ����
	void run();
}

class BB implements AA{ //BBŬ������ AA�������̽��� �̿ϼ��� �޼ҵ带 ���� �Ѵ�.

	@Override
	public void cry() {
		System.out.println("�߿�");
	}

	@Override
	public void run() {
		System.out.println("��½");
	}	
	
}
public class Interface_2 {

	public static void main(String[] args) {
		
	}

}
