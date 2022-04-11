package Chap18.EX07;

interface AA{
	int abc(String str);
}

public class RefOfInstanceMethod_Type_2_2 {

	public static void main(String[] args) {

		//�ν��Ͻ� �޼ҵ� ���� Type : �����޼ҵ� ����
		//1. �͸��̳�Ŭ����
		AA a1 = new AA() {
			@Override
			public int abc(String str) {
				return str.length();
			}
		};
		
		//2. ���� ǥ����
		AA a2 = (String str) -> {return str.length();};
		
		//3. �ν��Ͻ� �޼ҵ� ���� Type2
		AA a3 = String::length;			//String::lenght  ��ü��::�޼ҵ�
		
		System.out.println(a1.abc("�ȳ�"));
		System.out.println(a2.abc("������"));
		System.out.println(a3.abc("���߳���"));
		
		
		
		
	}

}
