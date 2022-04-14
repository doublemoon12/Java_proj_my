package Chap19.ex08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/*
Application Default : MS949

Reader / Writer 의 하위 클래스를 사용하세요.

1. 콘솔에서 한글을 읽어서
	C:\Temp\a\aaa.txt (MS949)
	C:\Temp\b\bbb.txt (UTF-8)
	파일에 쓰세요.
	
	a, b 폴더는 Application에서 생성
	
2. 두 파일에서 읽은 내용을 콘솔에 깨짐 없이 출력	



*/

public class EX_Reader_Writer {

	public static void main(String[] args) {

		File fi1 = new File("C:\\Temp\\aaa.txt");
		File fi2 = new File("C:/Temp/bbb.txt");

		InputStream is1 = System.in;
		OutputStream os1 = System.out;

		byte[] arr1 = new byte[100];
		try {
			InputStreamReader isr = new InputStreamReader(is1, "MS949");
			OutputStream os = new FileOutputStream(fi1);
			OutputStreamWriter osw = new OutputStreamWriter(os, "MS949");

			int data;
			while ((data = isr.read()) != '\r') {
				osw.write(data);
				osw.flush();
			}
			osw.close();
		} catch (IOException e) {
		}

		byte[] arr2 = new byte[100];
		try {
			InputStreamReader isr = new InputStreamReader(is1, "MS949");
			OutputStream os = new FileOutputStream(fi2);
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");

			int data;
			while ((data = isr.read()) != '\r') {
				osw.write(data);
				osw.flush();
			}
			osw.close();
		} catch (IOException e) {
		}

		try (InputStream is = new FileInputStream(fi1); InputStreamReader isr1 = new InputStreamReader(is, "MS949");) {

			int data;
			while ((data = isr1.read()) != -1) {
				System.out.print((char) data);
			}

			System.out.println();

		} catch (Exception e) {
		}

		

		try (InputStream is = new FileInputStream(fi2); InputStreamReader isr1 = new InputStreamReader(is, "UTF-8");) {

			int data;
			while ((data = isr1.read()) != -1) {
				System.out.print((char) data);
			}

			System.out.println();

		} catch (Exception e) {
		}

	}

}
