package Chap16.EX02;

//Object�� ����ؼ� 4���� ��ü�� ���� �ϰ� ��� �غ���
//���ʸ��� ����Ͽ� 4���� ��ü�� ���� �ϰ� ��� �غ���
class Student{
	String name;
	String id;
	int pass;
	
	Student(String name, String id, int pass){
		this.name = name;
		this.id = id;
		this.pass = pass;
	}
	
	public void method() {
		System.out.println(name + ", " + id + ", " + pass);
	}
	
	@Override
	public String toString() {
		return name + ", " + id + ", " + pass;
	}
}


class Professor{
	String name;
	int year;
	String email;
	
	Professor(String name, int year, String email){
		this.name = name;
		this.year = year;
		this.email = email;
	}
	
	public void method() {
		System.out.println(name + ", " + year + ", " + email);
	}
	
	@Override
	public String toString() {
		return name + ", " + year + ", " + email;
	}
}

class Tiger{
	String name;
	String run;
	
	Tiger(String name, String run){
		this.name = name;
		this.run = run;
	}
	
	public void method() {
		System.out.println(name + ", " + run);
	}
	
	@Override
	public String toString() {
		return name + ", " + run;
	}
}

class Banana{
	String name;
	String color;
	int price;
	
	Banana(String name, String color, int price){
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public void method() {
		System.out.println(name + ", " + color + ", " + price);
	}
	
	@Override
	public String toString() {
		return name + ", " + color + ", " + price;
	}
}

class All{
	private Object object = new Object();

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
}

class All2<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class EX_UsingObject {

	public static void main(String[] args) {

		All all1 = new All();
		all1.setObject(new Student("�̼���", "lee", 1234));
		System.out.println((Student)all1.getObject());
		
		All all2 = new All();
		all2.setObject(new Professor("�Ż��Ӵ�", 10 , "sin@aaa.com"));
		System.out.println((Professor)all2.getObject());
		
		All all3 = new All();
		all3.setObject(new Tiger("ȣ����", "�޸��ϴ�."));
		System.out.println((Tiger)all3.getObject());
		
		All all4 = new All();
		all4.setObject(new Banana("�ٳ���", "�����", 1000));
		System.out.println((Banana)all4.getObject());
		
		System.out.println("=================================");
		
		All2<Student> stu = new All2();
		stu.setT(new Student("�ڰ�", "bak", 123456));
		stu.getT().method();
		
		All2<Professor> pro = new All2();
		pro.setT(new Professor("����", 10, "na@naver.com"));
		pro.getT().method();
		
		All2<Tiger> tiger = new All2();
		tiger.setT(new Tiger("ȣ����", "�޸���"));
		tiger.getT().method();
		
		All2<Banana> bana = new All2();
		bana.setT(new Banana("�ٳ���", "�����", 3000));
		bana.getT().method();
		
	}

}
