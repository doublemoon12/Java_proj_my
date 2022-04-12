package Chap19.ex06;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

//한글을 톤솔에 출력. 1-byte로 출려시 한글 출력X

public class ConsoleOutputObject_2 {

	public static void main(String[] args) throws IOException {

		OutputStream os = System.out;		//콘솔에 출력... byte로 콘솔에 값을 던져야 한다.
		
		//2. n-byte출력(byte[]배열에 처음부터 끝까지 데이터 쓰기
		byte[] byteArray1 = "안녕하세요".getBytes(Charset.defaultCharset());
		
		os.write(byteArray1);
		os.write('\n');
		os.flush();
		
		//3. n-byte출력(byte[]의 offset부터 length개의 byte데이터 쓰기)
		byte[] byteArray2 = "반갑습니다".getBytes(Charset.defaultCharset());
		
		os.write(byteArray2, 6, 4);
		
		os.flush();
		os.close();
		
		
		
		
		
		
	}

}
