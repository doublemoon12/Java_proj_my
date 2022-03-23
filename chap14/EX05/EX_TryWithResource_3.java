package chap14.EX05;

//자동 리소스(객체) 제거

//필드에 값 할당, 생성자 호출시 필드의 값을 부여
class Abc implements AutoCloseable{
	String name;
	int StudentID;
	int kor;
	int eng;
	int math;
	double avg;		// 평균계산
	
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
		System.out.println("이름 : " + name + ", 번호 : " + StudentID + ", 국어 : " + kor + ", 영어 : "+ eng + ", 수학 : " + math + ", 평균 : " + avg);
		
		if(name != null) {
			name = null;
			StudentID = 0;
			kor = 0;
			eng = 0;
			math = 0;
			avg = 0;
			System.out.println("값 초기화");
			System.out.println("이름 : " + name + ", 번호 : " + StudentID + ", 국어 : " + kor + ", 영어 : "+ eng + ", 수학 : " + math + ", 평균 : " + avg);
		}
	}
	
	
}


public class EX_TryWithResource_3 {

	public static void main(String[] args) {
		//1. 객체의 모든 필드를 초기화 하고 자동으로 close();
		try(Abc abc1 = new Abc("김가", 1234, 73, 88, 92);){
			
		}catch(Exception e){
			System.out.println("어쩌구");
		}
		
		System.out.println("=====================================");
		
		//2. 수동으로 모든 필드 초기화 하고 close(), finally{}
		Abc abc2 = null;
		try {
			abc2 = new Abc("나가", 5678, 79, 89, 62);
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
