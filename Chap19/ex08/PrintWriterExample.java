package Chap19.ex08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

//PrintWriter : �ڵ� flush()����� ������ Ȱ��ȭ �ؾ��Ѵ�.
//		flush()�� ó������ ������ �޸𸮿��� �����ְ� ȣ�� X
//		close()�� ȣ��ɶ� flush()�� ȣ��ǰ� ���� close()���ȴ�

public class PrintWriterExample {

	public static void main(String[] args) {

		//1. ���� ��ü ����
		File pw1 = new File("src\\Chap19\\ex08\\pw1.txt");
		File pw2 = new File("src\\Chap19\\ex08\\pw2.txt");
		File pw3 = new File("src\\Chap19\\ex08\\pw3.txt");
		
		
		//2. PrintWriter(File file)
		try(PrintWriter pw = new PrintWriter(pw1);) {
			pw.println("PrintWriter ���� #1");
			pw.println(133);
			pw.println(5.8);
			pw.print("�ȳ��ϼ��� ");
			pw.println("�ݰ����ϴ�. ");
			pw.printf("%d, %S", 7, "�ȳ�").printf("%S, %f" , "����", 3.7);
		} catch (FileNotFoundException e) {}
		
		//3 PrintWriter(OutputStream os)
		try(PrintWriter pw = new PrintWriter(new FileOutputStream(pw2));) {
			pw.println("PrintWriter ���� #1");
			pw.println(133);
			pw.println(5.8);
			pw.print("�ȳ��ϼ��� ");
			pw.println("�ݰ����ϴ�. ");
			pw.printf("%d, %S", 7, "�ȳ�").printf("%S, %f" , "����", 3.7);
		} catch (FileNotFoundException e) {}
		
		//4. PrintWriter(System.out)
		PrintWriter pw = new PrintWriter(System.out, true);	//true�� �ǹ̴� flush()�� �ڵ����� ���� �ض�
		pw.println("PrintWriter ���� #1");
		pw.println(133);
		pw.println(5.8);
		pw.print("�ȳ��ϼ��� ");
		pw.println("�ݰ����ϴ�. ");
		pw.printf("%d, %S", 7, "�ȳ�").printf("%S, %f" , "����", 3.7);
		//pw.flush();
		//pw.close();
		
		
		
		
		
	}

}
