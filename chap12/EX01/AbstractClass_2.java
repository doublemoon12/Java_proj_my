package chap12.EX01;

//2. �߻�޼ҵ带 ����ϴ� 2��° ��� : �ڽ� ��ü���� �͸� Ŭ������ Ȱ���ϴ� ���
	//1���� �ӽ������� ����ҋ�, �̺�Ʈ ó��
	//���� : �ڽ�Ŭ���� ������ ���� �ʴ´�. �ӽ����λ��
	//���� : �������� ��ü�� �����ؾ��� ��� �ڵ尡 �����.
abstract class AAA{
	abstract void abc();	//�߻�޼ҵ�
}

class DDD extends AAA{

	@Override
	void abc() {
		// TODO Auto-generated method stub
		
	}
	
}


public class AbstractClass_2 {

	public static void main(String[] args) {
		
		AAA ddd = new DDD();
		
		//1. �͸� ��ü ����
		AAA aaa = new AAA() {	//�͸� ��ü�� Ȱ���� �߻�޼ҵ带 Ŭ���� �������� ����
			void abc() {
				System.out.println("��� 2�� : ��ü���� ���� �͸�Ŭ������ �߻� �޼ҵ� ����");
			}
		};
		
		AAA aaa1 = new AAA(){		//�߻�Ŭ������ ��ü�����Ұ�, �͸� Ŭ���� ������ �޼ҵ� ������ �ؼ� ���
			void abc() {
				System.out.println("��� 2��");
			}
		};
		
		AAA aaa2 = new AAA(){
			void abc() {
				System.out.println("��� 2��");
			}
		};
		
		
		//2. �޼ҵ� ȣ��
		aaa.abc();
		aaa1.abc();
		
	}

}
