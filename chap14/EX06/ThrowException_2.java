package chap14.EX06;

//�Ϲ� ����(checked Exception)		: ������ �ܰ迡�� ���ܰ� �߻�
	//1. ���� ó���ϴ� ���
	//2. throws�� ���� ��Ű�� ���

	//main�޼ҵ忡 throws�� �� ��� , Exception�� �߻��� ��� ������ ����� �ְ� ������

public class ThrowException_2 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		//���������� ������ ���� �մϴ�. ClassNotFoundException�� �߻����� �ʴ´�.
		Class cls1 = Class.forName("java.lang.Object");
		
		//������ �������� �ʴ� ���. ClassNotFoundException�� �߻��ȴ�.
		Class cls2 = Class.forName("java.lang.Object00");
		
	}

}
