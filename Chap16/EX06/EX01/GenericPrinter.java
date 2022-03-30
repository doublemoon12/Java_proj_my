package Chap16.EX06.EX01;

//제너릭 클래스 : 다양한 타입을 사용할 수 있는 클래스

public class GenericPrinter<T extends Meterial> {	//다양한 재료로 프린팅하는 프린터(파우더, 플라스틱 등등)
					//T : 타입 제한, Meterial하위 클래스만 T 타입에 들어올 수 있다.
	private T material;		//material : 참조변수, 객체, 인스턴스

	public T getMaterial() {	//객체를 전송
		return material;
	}

	public void setMaterial(T material) {	//객체를 활성화
		this.material = material;
	}
	
	public String toString() {
		return material.toString();		//해당 객체의 toString()호출
	}
	
	public void printing() {	//메소드만 정의
		material.doPrinting();
	}
	
	
	
}
