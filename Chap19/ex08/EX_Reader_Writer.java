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

Reader / Writer �� ���� Ŭ������ ����ϼ���.

1. �ֿܼ��� �ѱ��� �о
	C:\Temp\a\aaa.txt (MS949)
	C:\Temp\b\bbb.txt (UTF-8)
	���Ͽ� ������.
	
	a, b ������ Application���� ����
	
2. �� ���Ͽ��� ���� ������ �ֿܼ� ���� ���� ���	



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
