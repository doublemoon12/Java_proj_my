package Chap19.ex07;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamExample_2 {

	public static void main(String[] args) {

		// 1. File ��ü����.
		File outFile1 = new File("src\\Chap19\\ex07\\printStream3.txt");
		File outFile2 = new File("src\\Chap19\\ex07\\printStream4.txt");

		try(OutputStream os1 = new FileOutputStream(outFile1);
				PrintStream ps = new PrintStream(os1);) {
				ps.println(5.8);
				ps.print(3 + "�ȳ�" + 122345 + "\n");	//����� ���� ����(x)
				ps.printf("%d �� ȣ��Ǿ����ϴ�", 7);	//"%d" : int���� ȣ��
				ps.printf("%s %f", "�ȳ�" , 5.8);		//%s : String ȣ��, %f : doubleȣ��
				
				
			} catch (IOException e) {}
		
		try(OutputStream os1 = new FileOutputStream(outFile1);
				PrintStream ps = new PrintStream(os1);) {
				int count;
				byte[] byteArray = new byte[100];
				

				
			} catch (IOException e) {}
		
		
	}

}
