package chap10.ex01;

class Student_sub extends Student{
	//Student_sub�� Student�� ��ӹް� �ִ�. Student�� �ǵ�� �޼ҵ带 ��� �޴´�.
	//Student�� Person�� ��� �ް� �ִ�.
	
	//Student_sub�� Person�� �ʵ�� �޼ҵ�� Student�� �ʵ�� �޼ҵ带 ��� ��� �޴´�.
	
	
	void sub1() {
		System.out.println("Student_sub�Դϴ�.");
	}
	
}


	
class Student extends Person{	//���л� Ŭ���� 
			//�ڽ�Ŭ������ �θ� Ŭ������ �ʵ�, �޼ҵ�, �ξ�Ŭ������ �״�� ��ӹ޴´�.
	int studentID;
	void goToScool() {
		System.out.println("�ڽ� Ŭ������ Student �޼ҵ� goToScool ȣ��");
	}
	
}
class Worker extends Person{	//������ Ŭ����
	int workerID;	//���
	void goToWork() {
		System.out.println("������ Ŭ������ �޼ҵ� ȣ��");
	}
	
}
public class Person {	//��� : �θ�Ŭ������ (�ʵ�, �޼ҵ�, ���� Ŭ����)�� �ڽ�Ŭ�������� ����� �ش�.

	String name;		//����� ���� : 1. �ߺ��� �ڵ带 ����(�ڵ��� ����)
	int age;						//2. �ڵ尡 ������ ����. 3. ������(�޼ҵ� �������̵�)
									//������ : �ϳ��� �޼ҵ� �̸����� ������������ ���
	void eat() {
		System.out.println("�θ� Ŭ������ eat()�޼ҵ� �Դϴ�.");
	}
	void sleep() {
		System.out.println("�θ� Ŭ������ sleep() �޼ҵ� �Դϴ�.");
	}
	
	public static void main(String[] args) {

		//1. Person��ü ����
		Person p = new Person();
		p.name = "�谡";
		p.age = 23;
		p.eat();
		p.sleep();
		
		System.out.println("======================");
		
		//2. Student��ü ����
		Student s = new Student();	//PersonŬ������ ���, PersonŬ������ �ʵ�� �޼ҵ带 ���
		//personŬ������ �ʵ�
		s.name = "�̼���";
		s.age = 50;
		//StudentŬ������ �ʵ�
		s.studentID = 5004;
		
		//PersonŬ������ �޼ҵ�
		s.eat();
		s.sleep();
		//StudentŬ������ �޼ҵ�
		s.goToScool();
		
		System.out.println("======================");
		
		//3. Worker��ü ����
		Worker w = new Worker();	//personŬ������ ����Ѵ�. PersonŬ������ �ʵ�� �޼ҵ� ���.
		
		//�θ� Ŭ������ �ʵ�
		w.name = "����";
		w.age = 30;
		//�ڽ� Ŭ������ �ʵ�
		w.workerID = 2343512;
		
		//�θ�Ŭ������ �޼ҵ�
		w.eat();
		w.sleep();
		//�ڽ� Ŭ������ �޼ҵ�
		w.goToWork();
		
		System.out.println("=========��ü ������ Ÿ�� ��ȯ=========");
		
		Person p1 = new Person();	//Persin()�� Person�̴�(�ڽ��� �θ��)
		Person ps = new Student();	//��ĳ����, student�� person�̴�.
		//Student sp = new Person(); 	//���� �Ұ���
		Person pw = new Worker();	//��ĳ����
		//Worker wp = new Person();	//����
		
		System.out.println("============================");
		
		Student_sub sub1 = new Student_sub();	//����
		//Ŭ����Ÿ�� ��ü�� �ڽ�Ŭ����
		
			//Person Ŭ������ �ʵ�� �޼ҵ� ��밡��
			sub1.name = "���";
			sub1.age = 33;
			sub1.eat();
			sub1.sleep();
			//Student Ŭ������ �ʵ�� �޼ҵ�
			sub1.studentID = 213123;
			sub1.goToScool();
			//Student_sub�� �ʵ�� �޼ҵ�
			//sub1.sub1 = "�ڽ��� �ڽ�Ŭ����";
			sub1.sub1();
			
		Person ps1 = new Student_sub();		//��ĳ����, Student_sub��ü�� ������ �θ� ������ Ÿ������ �� ��ȯ
			//Student_sub�� PersonŸ������ ��ĳ����, PersonŬ���� ����� ��밡��
			ps1.name = "bts";
			ps.age = 30;
			ps.eat();
			ps.sleep();
		
		Student ss1 = new Student_sub();	//��ĳ���� : student_sub�� StudentŸ������ ��ĳ����
			//Person�� Student�� �ִ� �ʵ�� �޼ҵ� ��λ��
			//Person�� �ʵ�� �޼ҵ�
			ss1.name = "SES";
			ss1.age = 30;
			ss1.eat();
			ss1.sleep();
			//Student�� �ʽ��� �޼ҵ�
			ss1.studentID = 124124;
			ss1.goToScool();
		
		Student_sub ss2 = new Student_sub();
			ss2.name = "����";
			ss2.age = 33;
			ss2.eat();
			ss2.sleep();
			ss2.studentID = 2323525;
			ss2.goToScool();
			ss2.sub1();
			
		//��� ���迡�� ��ü ������ �θ� ������ Ÿ������ ��ĳ���� ����.
			//�θ� ������ Ÿ������ ��ĳ���� �� ��� �θ��� �ʵ�� �޼ҵ常 ��밡��
			
		Person ps4 = new Student_sub();
			//Student_sub��ü ������ PersonŸ������ ��ĳ����(�ڵ����� ��ȯ��)
			//Student_sub�� Person�� Student�� Student_sub�� ��� �ʵ�� �޼ҵ带 �����ϰ��ִ�
			//���߿��� PersonŬ������ �ʵ�� �޼ҵ常 ���ٰ���7
		Student ss4 = new Student_sub();
			//Student_sub��ü ������ StudentŸ������ ��ĳ����
			//Student_sub�� Person�� Student�� Student_sub�� ��� �ʵ�� �޼ҵ带 �����ϰ��ִ�
			//���߿��� Person, StudentŬ������ �ʵ�� �޼ҵ常 ���ٰ���7
		Student ss5 = new Student_sub();
			//Student_sub��ü ������ StudentŸ������ ����
			//Student_sub�� Person�� Student�� Student_sub�� ��� �ʵ�� �޼ҵ带 �����ϰ��ִ�
			//���߿��� Person, Student, Student_sub Ŭ������ �ʵ�� �޼ҵ� ���ٰ���7
		
		//�ٿ� ĳ���� : �θ� ������ Ÿ������ ��ĳ���� �Ȱ��� �ڽ� ������ Ÿ������ ��ȯ(�������� ��ȯ)
		
		Student ps5 = (Student) ps4;	//ps4 (Person, Student, Student_sub)�� ������ Ÿ���� person
				//ps5�� Person, Student�� �ʵ�� �޼ҵ� ���� ����
		ps5.name = "�ٿ� ĳ����";
		ps5.age = 30;
		ps5.studentID = 2313123;	//Student�ʵ�� �޼ҵ� ��� ����
		ps5.goToScool();			//Student�� �޼ҵ� ���
		
		Student_sub ps6 = (Student_sub) ps4;	//ps4�� Person������ Ÿ�Կ��� Student_sub�� �ٿ� ĳ����
			//Student_sub�� �ٿ�ĳ���õ� (���λ�밡��)
			ps6.name = "����";
			ps6.age = 32;
			ps6.studentID =23123123;	//Student
			ps6.sub1();		//Student_sub
		
	}

}
