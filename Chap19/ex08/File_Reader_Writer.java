package Chap19.ex08;
/*
 * Reader / Writer		: char���� �����, ���ڸ� ó�� �ϵ��� Ưȭ�� �߻�Ŭ����
 * 		���ڵ��� �Ű��� �� �ᵵ �ȴ�.
 * 		byte	: 1byte
 * 		char	: 2byte, UTF-16(�����ڵ�)�� ó��, ���� 2byte, �ѱ۵� 2byte, ��������, ������ �� ó��
 * 		
 * 		FileReader	: charset �����ɼ��� ����.
 * 
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class File_Reader_Writer {

	public static void main(String[] args) {
		
		//���� ��ü ����
		File rwFile = new File("src/Chap19/ex08/rwFile.txt");
		
		try(Writer writer = new FileWriter(rwFile);) {	//Writer : �߻� Ŭ����, FileWriter	: Writer�� ������ �ڽ� Ŭ����
			//OutputStream	: byte���� ���, �߻� Ŭ����, FileOutputStream, ����, ������, mp3 ��� ���ó��
			//Writer		: char���� ���, �߻� Ŭ����, FileWriter, ���ڸ� Ưȭ�ؼ� ó��
			
			writer.write("�ȳ��ϼ��� \n".toCharArray());
			writer.write("Hello \n");
			writer.write('A');
			writer.write("\r");
			writer.write("\n");
			writer.write("�ݰ����ϴ�", 2, 3);
			writer.flush();
			
		} catch (IOException e) {}
		
		//FileReader�� �̿��� ���� �б�(Default MS949)	<== Chartorset ���� �ɼ��� ����.
		
		try (Reader reader = new FileReader(rwFile);){
			int data;
			while((data = reader.read()) != -1){
				System.out.print((char)data);
			}
			
		} catch (IOException e) {}
		
		
	}

}