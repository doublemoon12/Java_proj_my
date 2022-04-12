package chap10.ex01;

class Student_sub extends Student{
	//Student_sub는 Student를 상속받고 있다. Student의 피드와 메소드를 상속 받는다.
	//Student는 Person을 상속 받고 있다.
	
	//Student_sub는 Person의 필드와 메소드와 Student의 필드와 메소드를 모드 상속 받는다.
	
	
	void sub1() {
		System.out.println("Student_sub입니다.");
	}
	
}


	
class Student extends Person{	//대학생 클래스 
			//자식클래스는 부모 클래스의 필드, 메소드, 인어클래스를 그대로 상속받는다.
	int studentID;
	void goToScool() {
		System.out.println("자식 클래스의 Student 메소드 goToScool 호출");
	}
	
}
class Worker extends Person{	//직장인 클래스
	int workerID;	//사번
	void goToWork() {
		System.out.println("직장인 클래스의 메소드 호출");
	}
	
}
public class Person {	//상속 : 부모클래스의 (필드, 메소드, 내부 클래스)를 자식클래스에게 상속해 준다.

	String name;		//상속의 이점 : 1. 중복된 코드를 제거(코드의 재사용)
	int age;						//2. 코드가 간결해 진다. 3. 다형성(메소드 오버라이딩)
									//다형성 : 하나의 메소드 이름으로 여러형식으로 출력
	void eat() {
		System.out.println("부모 클래스의 eat()메소드 입니다.");
	}
	void sleep() {
		System.out.println("부모 클래스의 sleep() 메소드 입니다.");
	}
	
	public static void main(String[] args) {

		//1. Person객체 생성
		Person p = new Person();
		p.name = "김가";
		p.age = 23;
		p.eat();
		p.sleep();
		
		System.out.println("======================");
		
		//2. Student객체 생성
		Student s = new Student();	//Person클래스를 상속, Person클래스의 필드와 메소드를 상속
		//person클래스의 필드
		s.name = "이순신";
		s.age = 50;
		//Student클래스의 필드
		s.studentID = 5004;
		
		//Person클래스의 메소드
		s.eat();
		s.sleep();
		//Student클래스의 메소드
		s.goToScool();
		
		System.out.println("======================");
		
		//3. Worker객체 생성
		Worker w = new Worker();	//person클래스를 상속한다. Person클래스의 필드와 메소드 사용.
		
		//부모 클래스의 필드
		w.name = "나다";
		w.age = 30;
		//자식 클래스의 필드
		w.workerID = 2343512;
		
		//부모클래스의 메소드
		w.eat();
		w.sleep();
		//자식 클래스의 메소드
		w.goToWork();
		
		System.out.println("=========객체 생성시 타입 변환=========");
		
		Person p1 = new Person();	//Persin()은 Person이다(자식은 부모다)
		Person ps = new Student();	//업캐스팅, student는 person이다.
		//Student sp = new Person(); 	//성립 불가능
		Person pw = new Worker();	//업캐스팅
		//Worker wp = new Person();	//오류
		
		System.out.println("============================");
		
		Student_sub sub1 = new Student_sub();	//가능
		//클래스타입 객체명 자식클래스
		
			//Person 클래스의 필드와 메소드 사용가능
			sub1.name = "김김";
			sub1.age = 33;
			sub1.eat();
			sub1.sleep();
			//Student 클래스의 필드와 메소드
			sub1.studentID = 213123;
			sub1.goToScool();
			//Student_sub의 필드와 메소드
			//sub1.sub1 = "자식의 자식클래스";
			sub1.sub1();
			
		Person ps1 = new Student_sub();		//업캐스팅, Student_sub객체를 생성시 부모 데이터 타입으로 형 변환
			//Student_sub는 Person타입으로 업캐스팅, Person클래스 멤버만 사용가능
			ps1.name = "bts";
			ps.age = 30;
			ps.eat();
			ps.sleep();
		
		Student ss1 = new Student_sub();	//업캐스팅 : student_sub를 Student타입으로 업캐스팅
			//Person과 Student에 있는 필드와 메소드 모두사용
			//Person의 필드와 메소드
			ss1.name = "SES";
			ss1.age = 30;
			ss1.eat();
			ss1.sleep();
			//Student의 필스와 메소드
			ss1.studentID = 124124;
			ss1.goToScool();
		
		Student_sub ss2 = new Student_sub();
			ss2.name = "나다";
			ss2.age = 33;
			ss2.eat();
			ss2.sleep();
			ss2.studentID = 2323525;
			ss2.goToScool();
			ss2.sub1();
			
		//상속 관계에서 객체 생성시 부모 데이터 타입으로 업캐스팅 가능.
			//부모 데이터 타입으로 업캐스팅 된 경우 부모의 필드와 메소드만 사용가능
			
		Person ps4 = new Student_sub();
			//Student_sub객체 생성시 Person타입으로 업캐스팅(자동으로 변환됨)
			//Student_sub는 Person과 Student와 Student_sub의 모든 필드와 메소드를 포함하고있다
			//그중에서 Person클래스의 필드와 메소드만 접근가능7
		Student ss4 = new Student_sub();
			//Student_sub객체 생성시 Student타입으로 업캐스팅
			//Student_sub는 Person과 Student와 Student_sub의 모든 필드와 메소드를 포함하고있다
			//그중에서 Person, Student클래스의 필드와 메소드만 접근가능7
		Student ss5 = new Student_sub();
			//Student_sub객체 생성시 Student타입으로 적용
			//Student_sub는 Person과 Student와 Student_sub의 모든 필드와 메소드를 포함하고있다
			//그중에서 Person, Student, Student_sub 클래스의 필드와 메소드 접근가능7
		
		//다운 캐스팅 : 부모 데이터 타입으로 업캐스팅 된것을 자식 데이터 타입으로 변환(수동으로 변환)
		
		Student ps5 = (Student) ps4;	//ps4 (Person, Student, Student_sub)의 데이터 타입은 person
				//ps5는 Person, Student의 필드와 메소드 접근 가능
		ps5.name = "다운 캐스팅";
		ps5.age = 30;
		ps5.studentID = 2313123;	//Student필드와 메소드 사용 가능
		ps5.goToScool();			//Student의 메소드 사용
		
		Student_sub ps6 = (Student_sub) ps4;	//ps4는 Person데이터 타입에서 Student_sub로 다운 캐스팅
			//Student_sub로 다운캐스팅됨 (전부사용가능)
			ps6.name = "으아";
			ps6.age = 32;
			ps6.studentID =23123123;	//Student
			ps6.sub1();		//Student_sub
		
	}

}
