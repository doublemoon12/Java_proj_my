package Chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

// FileInputStream
// is1	: MS949 �ѱ۷� �б� ó��, try (with resource)	, ���� ó��.
// is2	: UTF-8 �ѱ� �б� ó��, try ����ó��


public class EX04_FileInputStream_2 {

	public static void main(String[] args) {
		
		File file1 = new File("src\\Chap19\\EX04\\files\\file-ms949.txt");
		
		byte[] arr1 = new byte[100];
		
		int num1;
		
		try(InputStream is1 = new FileInputStream(file1);) {
			while((num1 = is1.read(arr1)) != -1) {
				System.out.println(new String(arr1, Charset.forName("MS949")));
			}
		} catch (IOException e) {
			System.out.println("���� �߻�");
		}
		
		System.out.println("======================");
		
		
		File file2 = new File("src\\Chap19\\EX04\\files\\file-utf-8.txt");
		InputStream is2 = null;
		
		 byte[] arr2 = new byte[100];
		 
		 int num2;
		 
		 try {
			 is2 = new FileInputStream(file2);
			while((num2 = is2.read(arr2)) != -1) {
			String str = new String(arr2, Charset.forName("UTF-8"));
			System.out.println(str);
			 }
		} catch (IOException e) {
			System.out.println("���� �߻�");
		}finally {
			if(is2 != null) {
				try {
					is2.close();
				} catch (IOException e) {
					System.out.println("���� �߻�");
				}
			}
		}
		
		
		
		
		
	}

}
