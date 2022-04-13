package Chap19.ex08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * InputStreamReader	: byte 데이터를 char 포맷으로 변환하는 객체. <== 인코딩을 지정할 수 없다
 * 		//byte 포맷은 인코딩을 잘 지정해야 한다.
 * 		//char포맷으로 바꾸면 인코딩 타입을 신경쓸 필요가 없다.
 *  
 * 
 */

public class InputStreamReader_1 {

	public static void main(String[] args) {

		//1. 파일 객체 생성
		File isr = new File("src/Chap19/ex08/isr.txt");
		
		try (Reader reader = new FileReader(isr);) {	//FileReader는 인코딩 설정이 안됨
			int data;
			while((data = reader.read()) != -1) {	//MS949
				System.out.print((char)data);
			}
		} catch (Exception e) {}
		
		System.out.println();
		System.out.println("=======================");
		
		//2. FileInputStream + InputStreamReader를 이용한 파일 읽기
		//InputStreamReader (is, "UTF-8) byte ==> Char로 변환
		
		try(InputStream is = new FileInputStream(isr);
			InputStreamReader isr1 = new InputStreamReader(is, "UTF-8");) {	
			
			int data;
			while((data = isr1.read()) != -1){
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr1.getEncoding());
			
		} catch (Exception e) {}
		
		
		
	}

}
