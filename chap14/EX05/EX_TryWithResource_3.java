package chap14.EX05;

//�ڵ� ���ҽ�(��ü) ����

//�ʵ忡 �� �Ҵ�, ������ ȣ��� �ʵ��� ���� �ο�
class Abc implements AutoCloseable{
	String name;
	int StudentID;
	int kor;
	int eng;
	int math;
	double avg;		// ��հ��
	
	Abc(String name, int StudentID, int kor, int eng, int math){
		this.name = name;
		this.StudentID = StudentID;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	@Override
	public void close() throws Exception {
		this.avg = (double)(kor + eng + math)/3; 
		System.out.println("�̸� : " + name + ", ��ȣ : " + StudentID + ", ���� : " + kor + ", ���� : "+ eng + ", ���� : " + math + ", ��� : " + avg);
		
		if(name != null) {
			name = null;
			StudentID = 0;
			kor = 0;
			eng = 0;
			math = 0;
			avg = 0;
			System.out.println("�� �ʱ�ȭ");
			System.out.println("�̸� : " + name + ", ��ȣ : " + StudentID + ", ���� : " + kor + ", ���� : "+ eng + ", ���� : " + math + ", ��� : " + avg);
		}
	}
	
	
}


public class EX_TryWithResource_3 {

	public static void main(String[] args) {
		//1. ��ü�� ��� �ʵ带 �ʱ�ȭ �ϰ� �ڵ����� close();
		try(Abc abc1 = new Abc("�谡", 1234, 73, 88, 92);){
			
		}catch(Exception e){
			System.out.println("��¼��");
		}
		
		System.out.println("=====================================");
		
		//2. �������� ��� �ʵ� �ʱ�ȭ �ϰ� close(), finally{}
		Abc abc2 = null;
		try {
			abc2 = new Abc("����", 5678, 79, 89, 62);
		}catch(Exception e){
			
		}finally {
			if(abc2.name != null) {
				try {
					abc2.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		
		
		
	}

}
