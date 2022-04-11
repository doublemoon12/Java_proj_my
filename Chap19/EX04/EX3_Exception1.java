package Chap19.EX04;
/*
 * 1. is1 <== InputStream ��ü	(�����η� ���� : -MS949.txt)	����ó��	
 * 2. is2 <== InputStream ��ü	(����η� ���� : -UTF-8.txt)	����ó��(try - with resource�� ����ó��)
 * 				close()�� �ڵ����� ó��
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class EX3_Exception1 {

	public static void main(String[] args) {

		int data = 0;

		File f1 = new File("C:\\kmj\\JAVA\\src\\Chap19\\EX04\\Exception-MS949.txt");
		File f2 = new File("src\\Chap19\\EX04\\Exception-UTF-8.txt");

		InputStream is1 = null;
		
		byte[] arr = new byte[100];

		try {
			is1 = new FileInputStream(f1); // FileNotFoundException
			while ((data = is1.read(arr)) != -1) { // IOException
				String str2 = new String(arr, 0, data, Charset.forName("MS949"));
				//String(byte�迭, offset, length, "encoding")
				System.out.print(str2);
			}
		} catch (IOException e1) {
			System.out.println("���� �߻�");
		} finally {
			if (is1 != null) {		//is1 �� null�� �ƴҶ� ��ü�� �޸𸮿��� ����
				try {
					is1.close();
				} catch (IOException e) {
					System.out.println("���� �߻�");
				}
			}
		}
		System.out.println();
		System.out.println("===========UTF-8===========");
		byte[] arr2 = new byte[100];
		try (InputStream is2 = new FileInputStream(f2)) {
			//try(with resource : ��ü ����, RAM�� ��� <== close() �ڵ����� ó�� AutoCloseable�� close() ������ Ŭ���� �̾���Ѵ�.
			while ((data = is2.read(arr)) != -1) {
				String str1 = new String(arr, Charset.forName("UTF-8"));
				//String(byte�迭, offset, length, "encoding")
				System.out.print(str1);
			}
		} catch (IOException e) {
			System.out.println("���� �߻�");
		}
		
		
		
		
		
		

	}
}
