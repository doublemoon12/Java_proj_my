package kosmo_kmj;

public class Print {

	public static void main(String[] args) {
		System.out.println("화면 출력"); //자바의 한라인 주석
		/* 여러라인의 
		 * 주석*/
		System.out.println("화면" + " 출력"); //"+"문자열일때 연결 연산자로 사용
		System.out.println(3.8); //정수, 실수를 출력할때는 ""를 넣지 않는다.
		System.out.println(3+5); // +는 정수나, 실수 일때 더하기로 사용
		System.out.println("3" + "5"); //+문자열로 인식해 연결
		System.out.println("화면 : " + 3);
		System.out.println("화면 " + 3 + 5);
		System.out.println(3 + 5 + "화면");
		System.out.println("화면" + 3);
	}

}
