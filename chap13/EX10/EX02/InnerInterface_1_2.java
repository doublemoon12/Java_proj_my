package chap13.EX10.EX02;

class Abc{		//1. ��ü ������ �ʵ忡 ���� �� �Ҵ�. 
				//2. �����ڸ� ���� ���Ҵ�. 
				//3. setter�� ���� �� �Ҵ�
	
	Def d;	//��ü ����
	
	Abc(){}	//�����ڸ� ����
	Abc(Def d){
		this.d = d;
	}
	
	public void setDef(Def d) {	//setter�� ���� �� �Ҵ�
		this.d = d;
	}
	
	interface Def{
		void run();
		void fly();
	}
	
	void ghi() {
		d.run();
		d.fly();
	}
	
}



public class InnerInterface_1_2 {

	public static void main(String[] args) {

		Abc a = new Abc();
		a.d = (Abc.Def)new Abc.Def(){

			@Override
			public void run() {
				System.out.println("�������� �޸���");
			}

			@Override
			public void fly() {
				System.out.println("�������� ���� ���Ѵ�");
			}
		};
		a.ghi();
		
		System.out.println("==============================");
		
		Abc a1 = new Abc(
				new Abc.Def() {
					
					@Override
					public void run() {
						System.out.println("����̵� �޸���");
					}
					
					@Override
					public void fly() {
						System.out.println("����̵� ���� ���Ѵ�");
					}
				}
				);
		a1.ghi();
		
		System.out.println("=============================");
		
		Abc a2 = new Abc();
		a2.setDef(new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("�������� �޸� �� �ֽ��ϴ�.");
			}
			
			@Override
			public void fly() {
				System.out.println("�������� ������ �ֽ��ϴ�");
			}
		});
		a2.ghi();
	}

}
