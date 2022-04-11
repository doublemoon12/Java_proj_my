package Chap19.EX04;
/*
 * ASCII코드 값 출력 : 1byte = 8bit, 제일 처음비트는 부호 비트, 7bit
 * 	1 ~ 32비트 까지는 : 출력을 할 수 없는 특수한 코드, 예) null, 헤더의 시작, 경고음(7) 개행 10
 * 	127 : delete.
 * 
 * 	실제 출력 가능은 33번비트 ~ 126비트
 *  영문, 숫자, 특수 문자
 *  
 *  출력
 *  ===========================
 *  아스키코드 문자	 아스키코드 문자
 *  ===========================
 *  33		!		34	 &
 *  35		#		36	 $
 * 126
 *  
 */

public class Ascii_Code_Print {

	public static void main(String[] args) {
		
		System.out.println("출력");
		System.out.println("===========================\r\n"+ "아스키코드 문자	 아스키코드 문자\r\n"+ "===========================");
		for(int i = 33; i <= 126; i+=2) {
			System.out.print(i + "\t" + (char)i + "\t" + (i + 1) + "\t" + (char)(i + 1) + "\n");
		}
		
		
		
		
	}

}
