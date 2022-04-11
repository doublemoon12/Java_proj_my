package Chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream_2 {

	public static void main(String[] args) throws IOException {

		// 1. �Է� ���� ����
		File inFile = new File("src\\Chap19\\EX04\\FileinPutStream1.txt");

		// 2. 1) byte���� �б�

		InputStream is1 = null; // ��ü���� ,Finally �������� close

		try {
			is1 = new FileInputStream(inFile);
			int data;
			while ((data = is1.read()) != -1) { // ������ �����Ƿ� read() �޼ҵ常 ���, �ѱ��� ��� read(byte�迭)
				System.out.print((char) data);
			}
		} catch (IOException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		} finally {
			if (is1 != null)
				try {
					is1.close();
				} catch (IOException e) {

				}
		}
		System.out.println();
		System.out.println("=====try(whith resource){}�� �����ϱ�=======");

		try (InputStream is1_1 = new FileInputStream(inFile);) {
			int data;
			while ((data = is1_1.read()) != -1) { // ������ �����Ƿ� read() �޼ҵ常 ���, �ѱ��� ��� read(byte�迭)
				System.out.print((char) data);
			}
		} catch (IOException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		}
		
		System.out.println();
		System.out.println("========");
		
		//3. 2) n-byte������ �б�(byte[]�� ó�� ��ġ�������� ���� ������ ����): ���� ����Ʈ�� ���ÿ� �о ó���ӵ��� ����.
		
		InputStream is2 = new FileInputStream(inFile);
		
		byte[] byteArray1 = new byte[9];
		
		int count1;
		while((count1 = is2.read(byteArray1)) != -1) {	//-1�� ������ ����������.
					//is2.read() : 1byte�� �д´�.		�ѱ� ó���� ���Ѵ�.
					//is2.read(byteArray1) : 9byte�� �д´�. byteArray1�� ����
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
		
		//3. 2_1) n-byte ������ �о �ѱ� ó�� �迭 ������ �о �ѱ� ó��.
		InputStream is3 = new FileInputStream(inFile);
		byte[] byteArray2 = new byte[100];
		
		int count2;
		
		while((count2 = is3.read(byteArray2)) != -1) {
			System.out.println(new String(byteArray2, Charset.forName("MS949")));
		}
		is3.close();
		System.out.println("========================");
		
		//4. 3) n-byte ������ �о ����. offset, length ���.
		
		InputStream is4 = new FileInputStream(inFile);
		byte[] byteArray4 = new byte[9];
		
		int offset = 3;
		int length = 6;
		int count4 = is4.read(byteArray4, offset, length);	//length��ŭ �տ��� �о�ͼ� byteArray4�� offset ��ġ�� �����ض�.
		
		for(int i = 0; i < offset + count4; i++) {
			System.out.print((char)byteArray4[i]);
		}
		
		is4.close();
		
		
		
	}
}