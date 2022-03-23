package chap10.EX04;

class Human{
	String name;
	int age;
	
	void eat() {
		System.out.println("����� �Խ��ϴ�");
	}

	void sleep() {
		System.out.println("����� ���� ��ϴ�.");
	}
	
}

class Student extends Human{
	int studentID;
	void goToScool() {
		System.out.println("�л��� �б��� ���ϴ�.");
	}
}

class Worker extends Human{
	int workerID;
	void goToCompany() {
		System.out.println("ȸ����� ���忡 ���ϴ�.");
	}
}

public class Test01 {

	public static void main(String[] args) {

		Human h = new Human();
		h.name = "ȫ�浿";
		h.age = 30;
		h.eat();
		h.sleep();
		
		Student s = new Student();
		s.name = "����";
		s.eat();
		s.studentID = 3123;
		s.goToScool();
		
		Worker w = new Worker();
		w.name = "BTS";
		w.eat();
		w.workerID = 123;
		w.goToCompany();
		
		Human h1 = new Student();	//��ĳ���� : �ڽ� ==> �θ� Ÿ������ ����ȯ
									//h���� Human�� Student Ÿ�� ������� ,Human�� ���ٰ���
		h.name = "�̼�";
		h.eat();
		
		System.out.println("=============================");
		
		//�ٿ� ĳ���� :�θ� ==> �ڽ� ���� Ÿ�� ��ȯ, if������ ����Ѵ�.
		System.out.println(h1 instanceof Human);
		System.out.println(h1 instanceof Student);
		
		if(h1 instanceof Student) {		//�ݵ�� instanceof�� ��� ��Ÿ�� ���� ��������)
			Student s2 = (Student) h1;
			s2.studentID = 3213;
			s2.goToScool();
		}
		
		if(h1 instanceof Worker) {
			Worker w4 = (Worker) h1;
			
		}//���� �߻��ȵ� �����Ҷ� ���� �߻�
		
		
		
	}			

}
