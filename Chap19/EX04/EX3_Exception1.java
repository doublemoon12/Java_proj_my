package Chap19.EX04;
/*
 * 1. is1 <== InputStream 객체	(절대경로로 접근 : -MS949.txt)	예외처리	
 * 2. is2 <== InputStream 객체	(상대경로로 접근 : -UTF-8.txt)	예외처리(try - with resource로 예외처리)
 * 				close()를 자동으로 처리
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class EX3_Exception1 {

	public static void main(String[] args) {

		int data = 0;

		File f1 = new File("C:\\kmj\\JAVA\\src\\Chap19\\EX04\\Exception-MS949.txt");
		File f2 = new File("src\\Chap19\\EX04\\Exception-UTF-8.txt");

		InputStream is1 = null;
		
		byte[] arr = new byte[100];

		try {
			is1 = new FileInputStream(f1); // FileNotFoundException
			while ((data = is1.read(arr)) != -1) { // IOException
				String str2 = new String(arr, 0, data, Charset.forName("MS949"));
				//String(byte배열, offset, length, "encoding")
				System.out.print(str2);
			}
		} catch (IOException e1) {
			System.out.println("예외 발생");
		} finally {
			if (is1 != null) {		//is1 이 null이 아닐때 객체를 메모리에서 제거
				try {
					is1.close();
				} catch (IOException e) {
					System.out.println("예외 발생");
				}
			}
		}
		System.out.println();
		System.out.println("===========UTF-8===========");
		byte[] arr2 = new byte[100];
		try (InputStream is2 = new FileInputStream(f2)) {
			//try(with resource : 객체 생성, RAM을 사용 <== close() 자동으로 처리 AutoCloseable의 close() 구현한 클래스 이어야한다.
			while ((data = is2.read(arr)) != -1) {
				String str1 = new String(arr, Charset.forName("UTF-8"));
				//String(byte배열, offset, length, "encoding")
				System.out.print(str1);
			}
		} catch (IOException e) {
			System.out.println("예외 발생");
		}
		
		
		
		
		
		

	}
}
