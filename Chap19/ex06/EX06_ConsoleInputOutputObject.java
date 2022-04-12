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
		OutputStream os = System.out;
		
		OutputStream os1 = new FileOutputStream(inputFile);
		
		System.out.println("�ѱ۸� �Է� �ϼ���");
		
		byte[] arr1 = new byte[100];
		int count1 = is1.read(arr1);
		
		is1.close();
		
		os1.write(arr1);
		os1.write('\n');
		
		byte[] arr2 = "��ƽ��ϴ�".getBytes(Charset.defaultCharset());
		
		os.write(arr2);
		os.write('\n');
		
		os1.flush();
		os1.close();
		
		
		
	}

}
