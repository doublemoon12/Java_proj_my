package Chap16.EX07;

//���ʸ� �޼ҵ� ���ο��� ��� ������ �޼ҵ� : ObjectŬ������ �޼ҵ常 ��� ���� �ϴ�.

class A{
	public<T> void method(T t) {
		//System.out.println(t.length()); 	//t.length() : String Ŭ�������� ���ڼ��� �������ش�.(���Ұ�)
		System.out.println(t.equals("�ȳ�"));//t.equals�� ObjectŬ������ �޼ҵ��̹Ƿ� ��밡��
	}										
}

public class AvailableMethodInGenericMethod {

	public static void main(String[] args) {

		A a = new A();
		a.<String>method("�ȳ�");
		
		
	}

}
