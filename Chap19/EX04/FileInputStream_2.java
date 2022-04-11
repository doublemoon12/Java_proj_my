package Chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream_2 {

	public static void main(String[] args) throws IOException {

		// 1. 입력 파일 생성
		File inFile = new File("src\\Chap19\\EX04\\FileinPutStream1.txt");

		// 2. 1) byte단위 읽기

		InputStream is1 = null; // 객체선언 ,Finally 블락에서 close

		try {
			is1 = new FileInputStream(inFile);
			int data;
			while ((data = is1.read()) != -1) { // 영문만 있으므로 read() 메소드만 사용, 한글일 경우 read(byte배열)
				System.out.print((char) data);
			}
		} catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다.");
		} finally {
			if (is1 != null)
				try {
					is1.close();
				} catch (IOException e) {

				}
		}
		System.out.println();
		System.out.println("=====try(whith resource){}로 구현하기=======");

		try (InputStream is1_1 = new FileInputStream(inFile);) {
			int data;
			while ((data = is1_1.read()) != -1) { // 영문만 있으므로 read() 메소드만 사용, 한글일 경우 read(byte배열)
				System.out.print((char) data);
			}
		} catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다.");
		}
		
		System.out.println();
		System.out.println("========");
		
		//3. 2) n-byte단위로 읽기(byte[]의 처음 위치에서부터 읽은 데이터 저장): 여러 바이트를 동시에 읽어서 처리속도가 빠름.
		
		InputStream is2 = new FileInputStream(inFile);
		
		byte[] byteArray1 = new byte[9];
		
		int count1;
		while((count1 = is2.read(byteArray1)) != -1) {	//-1은 파일의 마지막까지.
					//is2.read() : 1byte씩 읽는다.		한글 처리를 못한다.
					//is2.read(byteArray1) : 9byte씩 읽는다. byteArray1에 저장
					//count1 : 9, 9, 2
			for(int i = 0; i < count1; i++) {
				System.out.print((char)byteArray1[i]);
			}
			System.out.println(" : count1 = " + count1);
		}
		/*
		System.out.println();
		System.out.println("=========================");
		String str = new String(byteArray1, Charset.forName("MS949));
		*/
		is2.close();
		
		System.out.println("=======================");
		
		//3. 2_1) n-byte 단위로 읽어서 한글 처리 배열 단위로 읽어서 한글 처리.
		InputStream is3 = new FileInputStream(inFile);
		byte[] byteArray2 = new byte[100];
		
		int count2;
		
		while((count2 = is3.read(byteArray2)) != -1) {
			System.out.println(new String(byteArray2, Charset.forName("MS949")));
		}
		is3.close();
		System.out.println("========================");
		
		//4. 3) n-byte 단위로 읽어서 저장. offset, length 사용.
		
		InputStream is4 = new FileInputStream(inFile);
		byte[] byteArray4 = new byte[9];
		
		int offset = 3;
		int length = 6;
		int count4 = is4.read(byteArray4, offset, length);	//length만큼 앞에서 읽어와서 byteArray4에 offset 위치에 저장해라.
		
		for(int i = 0; i < offset + count4; i++) {
			System.out.print((char)byteArray4[i]);
		}
		
		is4.close();
		
		
		
	}
}
