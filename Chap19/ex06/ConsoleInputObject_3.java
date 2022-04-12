package Chap19.ex06;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

//콘솔 인풋시 한글 처리	: 1-byte씩 읽으면 한글 처리를 하지 못한다. 배열로 읽어야 한글 처리 가능
//InputStream System.in


public class ConsoleInputObject_3 {

	public static void main(String[] args) throws IOException {

		InputStream is = System.in;		//한번만 선언 된다.

		System.out.println("한글을 입력 하세요");
		
		//2. n-byte 배열 읽기(byte[] 처음 위치에서 읽은 데이터 저장.
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1);	//\r\n포함
			//count1 : byteArray1에 저장된 값의 갯수
		
		String str1 = new String(byteArray1, 0, count1, Charset.defaultCharset());
		System.out.println(str1);
		System.out.println("배열의 방의 총 갯수 r과 n을 포함 : " + count1);
		System.out.println("=======================");
		System.out.println();
		
		
		//3. n-byte 단위 읽기(length 만큼 읽어 와서 byte[]배열의 offset위치에 저장해라.
		byte[] byteArray2 = new byte[9];
		int offset = 3;
		int length = 6;
		int count2 = is.read(byteArray2, offset, length);
		
		String str2 = new String(byteArray2, 0, offset + count2, Charset.defaultCharset());
		System.out.println(str2);
		
		
		
		
		
		
		
	}

}
