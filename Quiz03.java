

class Student{
					//�ڹٴ� ���� ����� �Ұ�, �ڹ��� ��� Ŭ������ ObjectŬ������ �ڼ��� �ȴ�.
						//ObjectŬ�������� ������ �ʵ峪 �޼ҵ带 ���� �� ���ִ�.
	String name;	//�л��̸�
	int studentID;	//�й�
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	
	void hobby() {
		System.out.println("�� �л��� ��̴� �Դϴ�.");
	}

	@Override
	public String toString() {		//ObjectŬ������ �޼ҵ�, ��ü ��ü�� ����Ҷ�, ������ ���� ������ [��Ű����.Ŭ������@�ؽ��ڵ�]���´� 
		//sum = kor + eng + math; ����!!
		//avg = (double)sum / 3;
		return "�̸� : " + name + " , �й� : " + studentID + " , ���� : " + kor + " , ���� : " + eng + " , ���� : " + math + " , �հ� : " + sum + " , ��� : " + avg;
	}
	
	
}

class S_ö�� extends Student{

	S_ö��(){}
	
	@Override
	void hobby() {
		System.out.println("ö���� ��̴� ���� �Դϴ�.");
	}
	
	S_ö��(String a, int b, int c, int d, int e){		//������ : 1. Ŭ���� ��� ����, 2. ����Ÿ���� ����� �Ѵ�.
		super.name = a;
		super.kor = b;
		super.eng = c;
		super.math = d;
		super.studentID = e;
		
		super.sum = kor + eng + math;
		super.avg = (double) sum / 3;	//or super.avg = sum / 3.0
	}
}

class S_���� extends Student{

	S_����(){}
	
	@Override
	void hobby() {
		System.out.println("������ ��̴� ���� �Դϴ�.");
	}
	
	S_����(String a, int b, int c, int d, int e){
		super.name = a;
		super.kor = b;
		super.eng = c;
		super.math = d;
		super.studentID = e;
		
		super.sum = kor + eng + math;
		super.avg = (double) sum / 3;
}
}

class S_���� extends Student{

	S_����(){}
	
	@Override
	void hobby() {
		System.out.println("������ ��̴� � �Դϴ�.");
	}
	
	S_����(String a, int b, int c, int d, int e){
		super.name = a;
		super.kor = b;
		super.eng = c;
		super.math = d;
		super.studentID = e;
		
		super.sum = kor + eng + math;
		super.avg = (double) sum / 3;
	}
}

public class Quiz03 {

	public static void main(String[] args) {
		
		Student ss1 = new S_ö��("ö��", 80, 90, 83, 123);
		Student ss2 = new S_����("����", 65, 75, 82, 456);
		Student ss3 = new S_����("����", 95, 95, 91, 789);
		
		Student[] arr2 = {ss1, ss2, ss3};
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
			arr2[i].hobby();
		}
		
		System.out.println("===============================");
		
		for(Student k : arr2) {
			System.out.println(k);
			k.hobby();
		}
		
		
	}

}

