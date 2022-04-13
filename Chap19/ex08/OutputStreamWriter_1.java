package Chap19.ex08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

//InputStreamReader		: byte ==> char	, charset(MS949, UTf-8)�����ؼ� ������ �о� �� �� �ִ�.
//OutputStreamWriter	: byte ==> char, charset(MS949, UTf-8)�����ؼ� ������ ���� �� �� �ִ�.

public class OutputStreamWriter_1 {

	public static void main(String[] args) {

		//1. FileWriter�� ���ؼ� ������ ����(Default : MS949)
		File osw1 = new File("src\\Chap19\\ex08\\osw1.txt");
		File osw2 = new File("src\\Chap19\\ex08\\osw2.txt");
		
		try(Writer writer = new FileWriter(osw1);) {
			writer.write("OutputStreamWriter1 ���� ���� �Դϴ�. \n".toCharArray());
			writer.write("�ѱ۰� ������ ��� ���� �Ǿ� �ֽ��ϴ�.");
			writer.write('\n');
			writer.write("Good Bye !!!!! \n\n");
			writer.flush();
			
		} catch (IOException e) {}
		
		
		//2. FileWriter�� ����ؼ� (Default : MS949 ===> UTF-8���Ͼ���)
		
		try(OutputStream os = new FileOutputStream(osw2);
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");){
			
			osw.write("OutputStreamWriter1 ���� ���� �Դϴ�. \n".toCharArray());
			osw.write("�ѱ۰� ������ ��� ���� �Ǿ� �ֽ��ϴ�.");
			osw.write('\n');
			osw.write("Good Bye !!!!! \n\n");
			osw.flush();
			
		} catch (IOException e) {}
		
		
		
		
		
		
	}

}
