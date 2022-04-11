package Chap19.EX04;
/*
 * A ~ Z 까지의 아스키 코드 값 출력
 * 
 * A, 65
 * B, 66
 * 
 */


public class Charator_EX02 {
	public static void main(String[] args) {

		for(int i = 65; i <= 90; i++) {
			System.out.println((char)(i) + ", " + i);
		}
		
		System.out.println("===============");
		
		for(int i = 97; i <= 122; i++) {
			System.out.println((char)(i) + ", " + i);
		}
		
	}
}
