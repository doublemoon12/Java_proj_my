package Chap19.ex07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

//PrintStream	: Filter Stream(�߰� ����� �����ϴ� Stream), ��� ��Ʈ���� �ʿ�.
	//�پ��� ������� ��¿� Ưȭ�� ��Ʈ���̴�, flush()�� ȣ������ �ʾƵ� �ڵ����� ����
	//println(), print(), printf()
	//���� ���, �ܼ���¤�


public class PrintStreamExample {

	public static void main(String[] args) {

		//1. File ��ü����.
		File outFile1 = new File("src\\Chap19\\ex07\\printStream1.txt");
		File outFile2 = new File("src\\Chap19\\ex07\\printStream2.txt");
		
		//2. PrintStream(FileOutputStream(File))
		
		try(OutputStream os1 = new FileOutputStream(outFile1);
			PrintStream ps = new PrintStream(os1);) {
			ps.println(5.8);
			ps.print(3 + "�ȳ�" + 122345 + "\n");	//����� ���� ����(x)
			ps.printf("%d �� ȣ��Ǿ����ϴ�", 7);	//"%d" : int���� ȣ��
			ps.printf("%s %f", "�ȳ�" , 5.8);		//%s : String ȣ��, %f : doubleȣ��
			//ps.flush() <== �ڵ����� ȣ��
			
		} catch (IOException e) {}
		
		//3.printStream(File)
		try (PrintStream ps = new PrintStream(outFile2);){
				ps.println(5.8);
				ps.print(3 + "�ȳ�" + 122345 + "\n");	//����� ���� ����(x)
				ps.printf("%d �� ȣ��Ǿ����ϴ�", 7);	//"%d" : int���� ȣ��
				ps.printf("%s %f", "�ȳ�" , 5.8);		//%s : String ȣ��, %f : doubleȣ��
				//ps.flush() <== �ڵ����� ȣ��
				
			} catch (IOException e) {}
		
		//4. PrintStream ps = System.out
		try(
		OutputStream os2 = System.out;
		PrintStream ps = new PrintStream(os2);){
			ps.println(5.8);
			ps.print(3 + "�ȳ�" + 122345 + "\n");	//����� ���� ����(x)
			ps.printf("%d �� ȣ��Ǿ����ϴ� \n", 7);	//"%d" : int���� ȣ��
			ps.printf("%s %f", "�ȳ�" , 5.8);		//%s : String ȣ��, %f : doubleȣ��
		}catch(Exception e) {}
		
		System.out.println("======================");
		
		//5. PrintStream ps = System.out
				try(
				OutputStream os2 = System.out;
				PrintStream ps = new PrintStream(os2);){
					ps.println(5.8);
					ps.print(3 + "�ȳ�" + 122345 + "\n");	//����� ���� ����(x)
					ps.printf("%d �� ȣ��Ǿ����ϴ� \n", 7);	//"%d" : int���� ȣ��
					ps.printf("%s %f", "�ȳ�" , 5.8);		//%s : String ȣ��, %f : doubleȣ��
				}catch(Exception e) {}
		
		
		
	}

}
