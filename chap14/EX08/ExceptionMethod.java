package chap14.EX08;

//�޼ҵ��� throws�� ����, ����, ���� main����
	//main�޼ҵ���� ������ �Ȱ�� ������ ���â�� ���� ���α׷� ����.
	//main �޼ҵ�� ���� ó�� ���� �ʴ´�.

class AA{
	public void abc() throws NumberFormatException {
		bcd();
	}
	public void bcd() throws NumberFormatException {
		cde();
	}
	public void cde() throws NumberFormatException {
		int num = Integer.parseInt("10A");	//Exception�߻�
	}
	
}


public class ExceptionMethod {

	public static void main(String[] args) throws NumberFormatException {

		//1. ��ü����
		AA aa = new AA();
		
		//2.�޼ҵ� ȣ��
		try {
			aa.abc();	//���࿹��(������ �ܰ迡���� ������ ����.)
		}catch(NumberFormatException e) {
			
			//e.printStackTrace(); //������ �ڼ��� ������ ���
		}
	
		System.out.println("���α׷� ����");
	
	
	}
}
