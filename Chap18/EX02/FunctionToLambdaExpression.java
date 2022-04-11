package Chap18.EX02;

//���ٽ� ����  


//�Ʒ� 4���� �������̽��� ���ٽ����� ó���� ���� : �Լ��� �������̽� 

@FunctionalInterface
interface A {			//�Է�X, ����X
	void method1(); 
}

@FunctionalInterface
interface B { 			//�Է�0, ����X
	void method2(int a); 
}

@FunctionalInterface
interface C {			//�Է�X, ����0
	int method3();
}

@FunctionalInterface
interface D{			//�Է�0, ����0
	double method4 (int a, int b); 
}


public class FunctionToLambdaExpression {
	public static void main(String[] args) {
		
		//�������̽��� �������� �ʴ� �Լ��� ���� --> ���ٽ� 
		
		//1. �Է�x, ����x 
		//1-1 : �͸� �̳�Ŭ������ ó�� 
		A a1 = new A() {
			@Override
			public void method1() {
				System.out.println("�޼ҵ� 1 - 1");		
			}
		};
		
		a1.method1();
		
		//1-2. ���ٽ����� ó�� 
			//���ٽ��� ���� Ÿ��, �޼ҵ��̸� ���� ����. 
			//(��ǲ) ->  {������} ; 
		A a2 = () -> {System.out.println("�޼ҵ� 1 - 2");};    //��ü 
		A a3 = () -> System.out.println("�޼ҵ� 1 - 3");  	 //�����ο� �� ���θ� �����Ҷ� { }; �� ���� ���� 
		
		a2.method1();
		a3.method1();
		
		//2. �Է� 0, ���� x 
		//2-1 �͸��̳�Ŭ������ ó�� 
		B b1 = new B() {
			public void method2(int a) {
				System.out.println("�޼ҵ� 2 - 4 : " +  a);
			};
		};
		
		b1.method2(0);
		
		//2-2 ���ٽ� ǥ��  (���� �����Ѱ��� �ִ��� ���� �ؼ� ǥ��) 
		B b2 = (int a) -> { System.out.println("�޼ҵ� 2 - 4 : " + a);};  //��ü ���� 
		B b3 = (a) -> { System.out.println("�޼ҵ� 2 - 5 : " + a);};  //�Է¸Ű� ������ Ÿ���� �������� 
		B b4 = (a) ->  System.out.println("�޼ҵ� 2 - 5 : " + a);  //���๮�� �Ѷ����϶� , { };
		B b5 = a ->  System.out.println("�޼ҵ� 2 - 6 : " + a);  //�Է¸Ű������� �ϳ��϶� () ���� ����
		
	
		b2.method2(1);
		b3.method2(2);
		b4.method2(3);
		b5.method2(4);
		
		//3. �Է�x, ����0 
		//3-1. �͸��̳�Ŭ���� 
		C c1 = new C() {
			public int method3() {
				return 4; 
			};
		}; 
		
	    System.out.println("�������� ���� : " + c1.method3());
		
		//3-2. ���ٽ����� ǥ�� 
	    
	    C c2 = () -> { return 5; };			//��ü ����
	    C c3 = () -> 6;			//������ �� �������� ����� ��� : return�� ���� ����, �ݵ�� �߰�ȣ�� �Բ� ����  
 
	    System.out.println("�������� ���� : " + c2.method3());
	    System.out.println("�������� ���� : " + c3.method3());
	    
	    //4. �Է� 0, ���� 0 
	    //4-1. �͸� �̳� Ŭ���� 
	    
	    D d1 = new D() {
	    	public double method4(int a, int b) {
	    		return a + b; 
	    	};
	    };
	    
	    System.out.println( "�μ��� ���� : " + d1.method4(1, 2)); 
	    
	    //4-2. ���ٽ����� ó�� 
	    D d2 = (int a, int b) -> {return a + b; };	//��ü ǥ��
	    D d3 = (a, b) -> {return a + b; };			//��ǲ Ÿ���� ���� ���� , 
	    D d4 = (a, b) -> a + b;						//������ �ϳ��϶� ���� ����, �߰�ȣ�� �ݵ�� ���� ���� {}; 				
	    
	    System.out.println("�μ��� ���� : " + d2.method4(3,4));
	    

	}

}
