package Ex;

class Student{
	int studentID;
	String name;
	int kor;
	int eng;
	
	Student(int studentID, String name, int kor, int eng){
		this.studentID = studentID;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(this.studentID == ((Student)obj).studentID) {
			return true;
		}else {
			return false;
		}
	
	}
	
}

public class Quiz_04 {

	public static void main(String[] args) {

		Student s1 = new Student(123, "구가", 88, 58);
		Student s2 = new Student(456, "김가", 90, 46);
		Student s3 = new Student(789, "이가", 89, 90);
		Student s4 = new Student(123, "나가", 95, 99);
		
		//studentID가 같은경우 같은 학생이다 라고 출력
		
		
		System.out.println(s1.equals(s4)); 		//true
		System.out.println(s2.equals(s3));		//false
		if(s1.equals(s4)) {
			System.out.println("같은 학생이다");
		}else {
			System.out.println("다른 학생이다");
		}
		
		if(s2.equals(s3)) {
			System.out.println("같은 학생이다");
		}else {
			System.out.println("다른 학생이다");
		}
		
	}

}
