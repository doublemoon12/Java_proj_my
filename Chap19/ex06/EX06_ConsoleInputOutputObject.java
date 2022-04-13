package Chap19.ex06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

//�ֿܼ��� 100byte���� �ѱ��� ��ǲ ���� ���� input.txt�� ���� ��, Charaset.Default
//input.txt���Ͽ��� ���� �о �ֿܼ� ���
//1. System.in			 	: �ֿܼ��� ��ǲ
//2. FileOutputStream 		: ��ǲ���� ���� ���Ͽ� ����.
//3. FileInputStream		: ����� ������ ������ �о����
//4. �ֿܼ� ���

public class EX06_ConsoleInputOutputObject {

	public static void main(String[] args) throws IOException {

		File inputFile = new File("src/Chap19/ex06/input.txt");
		
		InputStream is1 = System.in;
		OutputStream os1 = System.out;
		
		InputStream is2 = new FileInputStream(inputFile);
		OutputStream os2 = new FileOutputStream(inputFile);
		
		System.out.println("�ѱ۸� �Է� �ϼ���");
		
		byte[] arr1 = new byte[100];
		int count1 = is1.read(arr1);
		
		
		os2.write(arr1);
		os2.flush();
		os2.close();
		
		int count2;
		
		while((count2 = is2.read(arr1)) != -1) {
			System.out.println("����� ���� �ҷ�����");
			System.out.println(new String(arr1, Charset.defaultCharset()));
		}
		
		String str = new String(arr1, Charset.defaultCharset());
		str.getBytes(Charset.defaultCharset());
		os1.write(arr1);
		os1.flush();
		os1.close();
		
	}

}
