package chap10.EX04;

class Human{
	String name;
	int age;
	
	void eat() {
		System.out.println("사람이 먹습니다");
	}

	void sleep() {
		System.out.println("사람이 잠을 잡니다.");
	}
	
}

class Student extends Human{
	int studentID;
	void goToScool() {
		System.out.println("학생은 학교에 갑니다.");
	}
}

class Worker extends Human{
	int workerID;
	void goToCompany() {
		System.out.println("회사원은 직장에 갑니다.");
	}
}

public class Test01 {

	public static void main(String[] args) {

		Human h = new Human();
		h.name = "홍길동";
		h.age = 30;
		h.eat();
		h.sleep();
		
		Student s = new Student();
		s.name = "나다";
		s.eat();
		s.studentID = 3123;
		s.goToScool();
		
		Worker w = new Worker();
		w.name = "BTS";
		w.eat();
		w.workerID = 123;
		w.goToCompany();
		
		Human h1 = new Student();	//업캐스팅 : 자식 ==> 부모 타입으로 형변환
									//h에는 Human과 Student 타입 모두저장 ,Human만 접근가능
		h.name = "이순";
		h.eat();
		
		System.out.println("=============================");
		
		//다운 캐스팅 :부모 ==> 자식 으로 타입 변환, if조건을 사용한다.
		System.out.println(h1 instanceof Human);
		System.out.println(h1 instanceof Student);
		
		if(h1 instanceof Student) {		//반드시 instanceof를 사용 런타임 오류 방지위해)
			Student s2 = (Student) h1;
			s2.studentID = 3213;
			s2.goToScool();
		}
		
		if(h1 instanceof Worker) {
			Worker w4 = (Worker) h1;
			
		}//오류 발생안됨 실행할때 오류 발생
		
		
		
	}			

}
