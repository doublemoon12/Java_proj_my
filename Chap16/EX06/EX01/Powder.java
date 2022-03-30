package Chap16.EX06.EX01;

public class Powder extends Meterial{
	
	public void doPrinting() {
		System.out.println("파우더 재료로 출력합니다.");
	}
	@Override
	public String toString() {
		return "재료는 파우더 입니다";
	}
	

}
