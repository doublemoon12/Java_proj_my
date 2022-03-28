package chap14.EX07;

//Exception 	- Checked Exception - ������ ����, �ݵ�� ����ó��
//				- unChecked Exception, Runtime Exception - ����ÿ� ����,
//���� ó�� ���	- try catch - �ڽ��� ���� ���ܸ� ó��
//				- throws - ���� ó���� �̷�� ��, �޼ҵ� ������� ���ܸ� �޼ҵ� ȣ��� ȣ���ϴ� �ʿ� �̷�°�.
//				- throw	- ��ܸ� ���� �߻�

//���� �޼����� ���ܸ� ó���ϴ°��

//1. Exception�� �߻��Ǵ� �޼��� ���ο��� �ڽ��� ���� ���ܸ� ó���� ���
class A{
	void abc() {
		bcd();		//bcd(); ȣ��
	}
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object");//�Ϲݿ���	(ClassNotFoundException)
			Thread.sleep(1000); 	//ms : 1000(1��)			//�Ϲݿ���
		} catch (ClassNotFoundException | InterruptedException e) {
		
		}	
				//Class.forname		: �����ε� - �����Ͻÿ� üũ���� �ʰ� �����Ҷ� ��ü�� �����ϴ��� Ȯ��.
					//����� Ŭ���� ������ �����Ҽ��� �ְ� �������� �������� �ֱ⋚���� ����ó���� �ؾ��Ѵ�.
	}
}

//2. Throws�� ����ؼ� Exception�� �̷�� ���
class B{
	void abc() {
		try {
			bcd();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//bcd()�޼ҵ带 ȣ���ϴ� ���� ���ܸ� �̷��.
	void bcd() throws ClassNotFoundException, InterruptedException {
		Class cls = Class.forName("java.lang.Object");//�Ϲݿ���	(ClassNotFoundException)
		Thread.sleep(1000); 	//ms : 1000(1��)			//�Ϲݿ���
	}
}


public class ThrowsException_3 {

	public static void main(String[] args) {

		
		
	}

}
