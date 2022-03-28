package chap13.EX10.EX02;

class Abc{		//1. 객체 생성후 필드에 직접 값 할당. 
				//2. 생성자를 통해 값할당. 
				//3. setter를 통해 값 할당
	
	Def d;	//객체 생성
	
	Abc(){}	//생성자를 통함
	Abc(Def d){
		this.d = d;
	}
	
	public void setDef(Def d) {	//setter을 통해 값 할당
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
				System.out.println("강아지는 달린다");
			}

			@Override
			public void fly() {
				System.out.println("강아지는 날지 못한다");
			}
		};
		a.ghi();
		
		System.out.println("==============================");
		
		Abc a1 = new Abc(
				new Abc.Def() {
					
					@Override
					public void run() {
						System.out.println("고양이도 달린다");
					}
					
					@Override
					public void fly() {
						System.out.println("고양이도 날지 못한다");
					}
				}
				);
		a1.ghi();
		
		System.out.println("=============================");
		
		Abc a2 = new Abc();
		a2.setDef(new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("독수리는 달릴 수 있습니다.");
			}
			
			@Override
			public void fly() {
				System.out.println("독수리는 날수도 있습니다");
			}
		});
		a2.ghi();
	}

}
