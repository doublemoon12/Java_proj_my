package chap10.EX04;

class Animal3{	//�θ� Ŭ����, ��� Ŭ������ Object Ŭ������ ����Ѵ�.
	String name;
	int age;
	
	void cry(){
		System.out.println("������ ��ϴ�.");
	}

	@Override		//Object.toString�޼ҵ�� ��ü ��ü�� ����Ҷ� ȣ���� �ȴ�.
	public String toString() {	//��ü�� �ּҸ� ��� �մϴ�.[��Ű����.Ŭ������@��ü �޸��� �ؽ��ڵ�]
		
		return "�̸��� : " + name + " , ���̴� : " + age + "�Դϴ�";
	}
		
}

class Tiger3 extends Animal3{
	
	Tiger3(){}	//�⺻ ������: ������ �ʱ�ȭ ���� �Ҵ����� �ʰ� �ʱ�ȭ.
	
	Tiger3(String a, int b){	//������ : ��ü�� ������ �� �޸��� �ʱⰪ�� �Ҵ��� �� ���.
		super.name = a;			//super : �θ�(super)Ŭ����
		super.age = b;
	}
	
	
	@Override
	void cry() {
		//super.cry();		//superŰ����� �θ�Ŭ������ �޼ҵ带 ȣ��
							//this Ű����� �ڱ��ڽ��� ��ü
		System.out.println("ȣ���̴� ���� �ϰ� ��ϴ�.");
		
	}
	
}

class Cat3 extends Animal3 {
	
	Cat3(){}
	
	Cat3(String a, int b){
		super.name = a;
		super.age = b;
	}
	
	@Override
	void cry() {
		//super.cry();
		System.out.println("�����̴� �߿��ϰ� ��ϴ�.");
	}
	
}

class Dog3 extends Animal3{
	
	Dog3(){}
	
	Dog3(String a, int b){
		super.name = a;
		super.age = b;
	}
	
	@Override
	void cry() {
		//super.cry();
		System.out.println("�������� ¢���ϴ�.");
	}
	
}

public class Test02 {

	public static void main(String[] args) {
		
		Animal3 a3 = new Animal3();	//a3 ��ü ����
		
		System.out.println(a3);	//��ü ��ü�� ����� ���, ObjectŬ������ toString�޼ҵ尡 ȣ��ȴ�.
								//Object.toString() : ��ü�� �޸� �ּ��� �ؽ��ڵ带 ���
								//Chap10.Ex04.Animal3@32d2fa64 <== ��Ű����,��ü��@�ؽ��ڵ�
		System.out.println(a3.toString());
		
		//��ü ��ü�� ��� �ϸ� ��ü�� ObjectŬ������ toString�޼ҵ带 ȣ��
		System.out.println("======================");
		
		Animal3 t3 = new Tiger3();	//Tiger3�� Animal3�� ��ĳ����
		Animal3 c3 = new Cat3();
		Animal3 d3 = new Dog3();
		
		t3.cry();	//�θ��� cry()�� ȣ�� �� ��� �������̵��� Tiger3�� cry()ȣ��
		c3.cry();
		d3.cry();
		
		System.out.println("===============================");
		
		Animal3[] arr = {t3, c3, d3};
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].cry();
		}
		
		System.out.println("=============================");
		
		for(Animal3 k : arr) {
			k.cry();
		}
		
		System.out.println("============================");
		
		Animal3 aa3 = new Tiger3("ȣ����" , 5);
		Animal3 cc3 = new Cat3("������", 3);
		Animal3 dd3 = new Dog3("������", 6);
		
		System.out.println(aa3);	//��ü ��ü�� ��½�, �⺻�����δ� ��ü�� �޸� �ؽ��ڵ尡 ���
		System.out.println(cc3);	//Object�� toString()�żҵ带 ������
		System.out.println(dd3);
		
		System.out.println("==================================");
		
		Animal3[] arr2 = {aa3, cc3, dd3};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("==================================");
		
		for(Animal3 k : arr2) {
			System.out.println(k);
		}
		
		
	}
		
		
}