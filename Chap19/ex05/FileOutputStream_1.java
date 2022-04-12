package Chap19.ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//InputStream		: 추상 클래스 <== FileInputStream을 구현한 클래스	<== 읽어올때
//OutputStream		: 추상 클래스 <== FileOutputStream을 구현한 클래스	<== 쓰기
//FileInputStream	: byte() 단위 데이터 읽기.
//FileOutPutStream	: byte() 단위 데이터 쓰기.

//Windows 콘솔, 메모장 Enter를 넣으면
//Mac	: \n


public class FileOutputStream_1 {

	public static void main(String[] args) throws IOException {
		
		
		//1. 입력 파일 생성(존재하지 않음)
		File outFile = new File("src/Chap19/ex05/FileOutputStream_1.txt");
		
		//2. 1-byte 쓰기
		OutputStream os1 = new FileOutputStream(outFile);
			//FileOutStream에 존재하지 않는 파일을 넣으면 실행시 생성됨.
			//FileInputStream경로에 파일이 존재 해야됨, 예외 발생
		
		
		os1.write('J');							//write : IOException
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r');	//13	엔터	생략 가능
		os1.write('\n');	//10	엔터	
		
			//중요	: write()는 메모리(버퍼)에 쓰기, 버퍼가 꽉차면 파일에 쓰기
			//		: flush()는 버퍼에 저장된 내용을 파일에 강제로 쓰기할때 사용
		
		os1.flush();	//버퍼가 꽉 차지 않더라도 강제로 파일에 쓰기를 한다.	<== 생략 가능
		os1.close();	//close() 호출시 flush() 먼저 작동됨.
		
		//2. n-byte 단위 쓰기(byte[]의 offset부터 length개의 byte데이터 쓰기
		
		OutputStream os2 = new FileOutputStream(outFile);	//덮어 쓰기
							//FileOutputStream(File o, Boolean append)
		byte[] byteArray1 = "Hello!!".getBytes();		//String --> byte로 변환, getBytes();
		
		os2.write(byteArray1);
		os2.write('\n');		//	\r은 생략가능, \n만 넣어도 된다.	
		
		os2.flush();
		os2.close();
		
		//3. n-byte 단위쓰기(byte[]의 offset부터 length개의 byte데이터 쓰기
		
		OutputStream os3 = new FileOutputStream(outFile, true);
		byte[] byteArray2 = "Better the last smile than the first laughter".getBytes();
		os3.write(byteArray2, 7, 8);	//write일때는 3byte뒤에서 8byte읽어서 저장
										//주의 read일때는 반대로 처리
		os3.flush();
		os3.close();
		
		
		
		
	}

}
