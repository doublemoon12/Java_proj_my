package Chap19.ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

//FileOutputStream을 사용해서 한글 처리

public class FileOutPutStream_2 {

	public static void main(String[] args) throws IOException {

		//1. 저장할 파일 생성
		File outFile = new File("src/Chap19/EX05/FileOutput2.txt");	//기본적으로 이클립스의 default charactorSet으로 저장.

		//2. n-byte 단위 쓰기 처리(byte[]의 처음부터 끝까지 쓰기) <== 한글을 처리
		OutputStream os2 = new FileOutputStream(outFile);
		byte[] byteArray1 = "안녕하세요".getBytes(Charset.forName("MS949"));		//String ==> byte[]에 저장 : getBytes()
			//한자 2byte씩 처리됨. 총 10byte
		os2.write(byteArray1);
		os2.write('\n');
		
		os2.flush();
		os2.close();
		
		//3. n-byte쓰기(byte[]의 offset부터 length개의 바이트 데이터 쓰기
		
		OutputStream os3 = new FileOutputStream(outFile, true);		//이어서 쓰기
		byte[] byteArray2 = "반갑습니다.".getBytes(Charset.forName("MS949"));
		//byte[] byteArray2 = "반갑습니다." getBytes(Charset.defaultCharset())	//기본 charset으로 가져오기
		os3.write(byteArray2, 4, 6);
			//write(byte배열, offset, length)
		
		//영어, 숫자, 특수문자 <== ASCII 코드로 1byte
		
		os3.flush();
		os3.close();
		
		
		
	}

}
