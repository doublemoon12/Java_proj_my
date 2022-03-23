package Chap06_07.EX06;

//객체의 필드에 값을 할당하는 방식 : 3가지
	//1. 필드에 직접 값을 부여하는 방식							<==객체를 생성 후
	//2. setter를 통해서 객체에 필드에 값을 부여.(컨트롤이 된다)		<==객체를 생성 후 
	//3. 생성자를 통해서 객체의 필드 값을 부여(컨트롤 된다.)			<==객체를 생성 할 떄 초기값으로 필드에 값을 할당 

class Aa{	//1. 객체생성후 직접 필드에 값 할당
	String name;	//이름 저장
	int age;		//나이 저장	
	String mail;	//메일 주소
	
	void print() {
		System.out.println("name : " + name + ", age : " + age + ", mail : " + mail);
	}
}

class Bb{	//2. setter를 통해서 객체의 필드에 값을 할당
	String name;	//이름 저장
	int age;		//나이 저장	
	String mail;	//메일 주소

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	void print() {
		System.out.println("name : " + name + ", age : " + age + ", mail : " + mail);
	}
}

class Cc{	//3. 생성자를 통해서 객체의 필드에 값을 할당
	String name;	//이름 저장
	int age;		//나이 저장	
	String mail;	//메일 주소
	
	/*Cc(String name, int age, String mail){
		this.name = name;
		this.age = age;
		this.mail = mail;
	}
	*/
	void print(String name, int age, String mail) {
		this.name = name;
		this.age = age;
		this.mail = mail;
		System.out.println("name : " + name + ", age : " + age + ", mail : " + mail);
	}
}
public class FieldOfValue {

	public static void main(String[] args) {
		
		//1. 객체의 필드에 직접 값을 할당
		Aa aa = new Aa();		//객체를 생성후 값을 할당
		aa.name = "홍길동";
		aa.age = 28;
		aa.mail = "aaa@aaa.com";
		aa.print();
		
		//2. 객체의 setter를 통해서 필드에 값을 할당
		Bb bb = new Bb();		//객체를 생성후 값을 할당
		bb.setName("아무개");
		bb.setAge(30);
		bb.setMail("bbb@bbb.com");
		bb.print();
		
		//3. 생성자를 통해서 필드에 값을 할당.(객체를 생성할떄 필드의 값을 초기화)
		Cc cc = new Cc();
		cc.print("누구개", 30, "ccc@ccc.com");
		
	}

}
