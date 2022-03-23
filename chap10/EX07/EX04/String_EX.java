package chap10.EX07.EX04;

class A {
	String name;
	A(String name){
		this.name = name;
	}
	@Override
	public String toString() {
	return name;
	}
}

public class String_EX {

	public static void main(String[] args) {

		String s0 = new String("안녕");
		
		String s1 = "안녕";	//String은 참조 변수
		
		System.out.println(s1);		//String은 객체를 출력할 때  
		System.out.println(s0);
		
		A a = new A("안녕");
		System.out.println(a);
		
		
		
	}

}
