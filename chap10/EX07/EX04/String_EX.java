package chap10.EX07.EX04;

class A {
	String name;
	A(String name){
		this.name = name;
	}
	@Override
	public String toString() {
	return name;
	}
}

public class String_EX {

	public static void main(String[] args) {

		String s0 = new String("�ȳ�");
		
		String s1 = "�ȳ�";	//String�� ���� ����
		
		System.out.println(s1);		//String�� ��ü�� ����� ��  
		System.out.println(s0);
		
		A a = new A("�ȳ�");
		System.out.println(a);
		
		
		
	}

}
