

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int nu  = 0;	//스캐너로 번호를 인풋받는 변수
		
		do {
			System.out.println("================================================================");
			System.out.println(" 1. 19단 출력 | 2. 홀수단만 출력 | 3. 3의 배수단만 출력 | 4. 프로그램 종료");
			System.out.println("================================================================");
			System.out.println("번호를 입력해 주세요>>>");
			nu = sc.nextInt();
			if(nu == 1) {	//이중 for문을 사용해서 스캐너에서 1번을 선택했을때 if안에 19단 출략
				for(int i = 19; i < 20; i++) {
					for(int j = 1; j < 10; j++) {
						int n = i * j;
						System.out.println(i + " * " + j + " = " + n);
					}
				}
			}else if(nu == 2) {	//이중 for문으로 홀수단만 출력
				for(int i = 1; i < 20; i++) {
					for(int j = 1; j < 20; j++) {
						if(i % 2 == 1) {
						int m = i * j;
						System.out.println(i + " * " + j + " = " + m);
						}
					}
				}
			}else if(nu == 3) {	//3의 배수단만 출력
				for(int i = 1; i < 20; i++) {
					for(int j = 1; j < 20; j++) {
						if(i % 3 == 0) {
						int m = i * j;
						System.out.println(i + " * " + j + " = " + m);
						}
					}
				}
			}else if(nu == 4) {	//프로그램 종료
					break;
			}
		}while(run);
		
		//스캐너 클로즈
		
		Scanner close;
		
		System.out.println("프로그램을 종료합니다.");
		
	}

}
