package Chap19.ex06;

import java.io.IOException;
import java.io.InputStream;

//Windows : 콘솔, 메모자에서 Enter	: \r\n	, \r 생략이 될 수 있다. write('\n')

public class ConsoleInputObject_2 {

	public static void main(String[] args) throws IOException {

		InputStream is = System.in;		//is를 통해서 인풋을 받겠다.
			//System.in은 한페이지네에서 한번만 올 수 있다.
		//InputStream is2 = System.in;
		System.out.println("영문만 입력 하세요");
		
		//1. 1-byte단위 읽기
		int data;
		while((data = is.read()) != '\r') {	
			System.out.print((char)data);
		}
		is.read();			//버퍼에 \n이 남아있어 처리해 줘야 한다. 그렇지 않으면 다음 read()에서 \n이 들어가버림
		
		System.out.println();
		System.out.println();
		System.out.println("===========================");
		
		//2. n-byte읽기 (byte[]의 처음 위치에서 읽은 데이터 저장)
		byte[] byteArray1 = new byte[100];		//콘솔에서 배열에 저장될때, \r\n까지 들어간다.
		int count1 = is.read(byteArray1);	//count1은 100, 100, 30, -1
			//count1 배열에서 읽은 값의 갯수를 저장.
		
		for(int i = 0; i < count1; i++) {
			System.out.print((char)byteArray1[i]);
			System.out.println(" : count1 = " + count1);
		}
		
		int count2;
		
		count2 = is.read(byteArray1);		//배열 내부에 \r\n이 들어간다.
		System.out.println(new String(byteArray1, 0, count2));
		
//		while((count2 = is.read(byteArray1)) != '\r') {
//			System.out.println(new String(byteArray1));
//		}
		
		//is.read(); <==배열 내부에\r\n으로 들어감
		System.out.println("======================");
		
		//3. n-byte 단위로 읽고(length 만큼 읽어 들여서 byte[] offset위치에 저장
		
		byte[] byteArray2 = new byte[8];
		int offset = 3;
		int length = 5;
		int count3 = is.read(byteArray2, offset, length);
		
		for(int i = 0; i < offset + length; i++) {
			System.out.print((char)byteArray2[i]);
		}		
		is.close(); 	//중간에 close()하면 다시 호출 불가능
		
	}

}
