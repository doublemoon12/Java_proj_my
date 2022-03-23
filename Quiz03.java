

class Student{
					//자바는 다중 상속이 불가, 자바의 모든 클래스는 Object클래스의 자손이 된다.
						//Object클래스에서 정의한 필드나 메소드를 재사용 할 수있다.
	String name;	//학생이름
	int studentID;	//학번
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	
	void hobby() {
		System.out.println("각 학생의 취미는 입니다.");
	}

	@Override
	public String toString() {		//Object클래스의 메소드, 객체 자체를 출력할때, 재정의 하지 않으면 [패키지명.클래스명@해쉬코드]나온다 
		//sum = kor + eng + math; 질문!!
		//avg = (double)sum / 3;
		return "이름 : " + name + " , 학번 : " + studentID + " , 국어 : " + kor + " , 영어 : " + eng + " , 수학 : " + math + " , 합계 : " + sum + " , 평균 : " + avg;
	}
	
	
}

class S_철수 extends Student{

	S_철수(){}
	
	@Override
	void hobby() {
		System.out.println("철수의 취미는 낚시 입니다.");
	}
	
	S_철수(String a, int b, int c, int d, int e){		//생성자 : 1. 클래스 명과 동일, 2. 리턴타입이 없어야 한다.
		super.name = a;
		super.kor = b;
		super.eng = c;
		super.math = d;
		super.studentID = e;
		
		super.sum = kor + eng + math;
		super.avg = (double) sum / 3;	//or super.avg = sum / 3.0
	}
}

class S_영희 extends Student{

	S_영희(){}
	
	@Override
	void hobby() {
		System.out.println("영희의 취미는 게임 입니다.");
	}
	
	S_영희(String a, int b, int c, int d, int e){
		super.name = a;
		super.kor = b;
		super.eng = c;
		super.math = d;
		super.studentID = e;
		
		super.sum = kor + eng + math;
		super.avg = (double) sum / 3;
}
}

class S_영식 extends Student{

	S_영식(){}
	
	@Override
	void hobby() {
		System.out.println("영식의 취미는 운동 입니다.");
	}
	
	S_영식(String a, int b, int c, int d, int e){
		super.name = a;
		super.kor = b;
		super.eng = c;
		super.math = d;
		super.studentID = e;
		
		super.sum = kor + eng + math;
		super.avg = (double) sum / 3;
	}
}

public class Quiz03 {

	public static void main(String[] args) {
		
		Student ss1 = new S_철수("철수", 80, 90, 83, 123);
		Student ss2 = new S_영희("영희", 65, 75, 82, 456);
		Student ss3 = new S_영식("영식", 95, 95, 91, 789);
		
		Student[] arr2 = {ss1, ss2, ss3};
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
			arr2[i].hobby();
		}
		
		System.out.println("===============================");
		
		for(Student k : arr2) {
			System.out.println(k);
			k.hobby();
		}
		
		
	}

}

