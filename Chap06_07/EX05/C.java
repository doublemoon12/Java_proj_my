package Chap06_07.ex05;

public class C {	//다른 패키지에서 import가능
	
	//필드에 부여되는 접근 제어자
	private String company = "현대자동차";	//회사명
	String model;	//자동차 모델(default가 들어가있다)
	protected String color;	//색
	public int maxspeed;	//속도
	
	
	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public void print() {
		System.out.println("company : " + company + ", model : "+ model + ", color : "+ color + ", maxspeed : " + maxspeed + "km");
		
	}
	

}
