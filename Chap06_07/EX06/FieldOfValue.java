package Chap06_07.EX06;

//��ü�� �ʵ忡 ���� �Ҵ��ϴ� ��� : 3����
	//1. �ʵ忡 ���� ���� �ο��ϴ� ���							<==��ü�� ���� ��
	//2. setter�� ���ؼ� ��ü�� �ʵ忡 ���� �ο�.(��Ʈ���� �ȴ�)		<==��ü�� ���� �� 
	//3. �����ڸ� ���ؼ� ��ü�� �ʵ� ���� �ο�(��Ʈ�� �ȴ�.)			<==��ü�� ���� �� �� �ʱⰪ���� �ʵ忡 ���� �Ҵ� 

class Aa{	//1. ��ü������ ���� �ʵ忡 �� �Ҵ�
	String name;	//�̸� ����
	int age;		//���� ����	
	String mail;	//���� �ּ�
	
	void print() {
		System.out.println("name : " + name + ", age : " + age + ", mail : " + mail);
	}
}

class Bb{	//2. setter�� ���ؼ� ��ü�� �ʵ忡 ���� �Ҵ�
	String name;	//�̸� ����
	int age;		//���� ����	
	String mail;	//���� �ּ�

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	void print() {
		System.out.println("name : " + name + ", age : " + age + ", mail : " + mail);
	}
}

class Cc{	//3. �����ڸ� ���ؼ� ��ü�� �ʵ忡 ���� �Ҵ�
	String name;	//�̸� ����
	int age;		//���� ����	
	String mail;	//���� �ּ�
	
	/*Cc(String name, int age, String mail){
		this.name = name;
		this.age = age;
		this.mail = mail;
	}
	*/
	void print(String name, int age, String mail) {
		this.name = name;
		this.age = age;
		this.mail = mail;
		System.out.println("name : " + name + ", age : " + age + ", mail : " + mail);
	}
}
public class FieldOfValue {

	public static void main(String[] args) {
		
		//1. ��ü�� �ʵ忡 ���� ���� �Ҵ�
		Aa aa = new Aa();		//��ü�� ������ ���� �Ҵ�
		aa.name = "ȫ�浿";
		aa.age = 28;
		aa.mail = "aaa@aaa.com";
		aa.print();
		
		//2. ��ü�� setter�� ���ؼ� �ʵ忡 ���� �Ҵ�
		Bb bb = new Bb();		//��ü�� ������ ���� �Ҵ�
		bb.setName("�ƹ���");
		bb.setAge(30);
		bb.setMail("bbb@bbb.com");
		bb.print();
		
		//3. �����ڸ� ���ؼ� �ʵ忡 ���� �Ҵ�.(��ü�� �����ҋ� �ʵ��� ���� �ʱ�ȭ)
		Cc cc = new Cc();
		cc.print("������", 30, "ccc@ccc.com");
		
	}

}
