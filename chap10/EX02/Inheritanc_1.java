package chap10.ex02;

class Aa{
	int m;
	void abc() {
		System.out.println("�θ�");
	}
}

class Bb extends Aa{
	int n;
	void bcd() {
		System.out.println("�ڽ�");
	}
}


public class Inheritanc_1 {

	public static void main(String[] args) {
		//Ÿ�� ĳ������ ���� ���� ���
		Bb b = new Bb();	//b�� Aa, Bb�� ���� �Ѵ�. Aa�� Bb�� �ʵ�� �޼ҵ� ��� ��밡��
		b.m = 10;	//�θ� �ʵ�
		b.n = 20;	//�ڽ� �ʵ�
		b.abc();	//�θ� �ʵ�
		b.bcd();	//�ڽ� �ʵ�
		
		//��ĳ���� : �ڽ� => �θ�	:Aa Ÿ�԰� Bb�� Ÿ�� ��� ���� ������ Aa�� ���� ����
		Aa a = new Bb();
		a.m = 100;
		//a.n = 200;
		
		Bb bb6 = (Bb) a;	//Aa ==> BbŸ������ �ٿ� ĳ����
		
	}

}
