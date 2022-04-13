package Chap19.ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//�߰� ����� �����ϴ� ��Ʈ�� 	: ��ݽ�Ʈ���� �����ؾ� �Ѵ�. �ܵ����� ����� �� ����.
//BufferdInputStream	: InputStream�� ���͸� �����ؼ� �б� ������ ���� ������ �� ��Ʈ��, �ܵ����� ��� �Ұ�, ��� ��Ʈ���� �߰����
//BufferdOutputStream	: InputStream�� ���͸� �����ؼ� ���� ������ ���� ������ �� ��Ʈ��, �ܵ����� ��� �Ұ�, ��� ��Ʈ���� �߰����


public class BufferedInput_BufferedOutputStream {

	public static void main(String[] args) {

		//�������� ����, Buffered�� ������� �ʰ� ó���ϴ� ���, Buffered�� ����ϴ� ��� �ӵ� ����.
		
		File orgfile1 = new File("src\\Chap19\\ex07\\mycat_origin.jpg");	//����
		File orgfile2 = new File("src\\Chap19\\ex07\\mycat_copy1.jpg");		//Buffered�� ������� �ʰ� ó��
		File orgfile3 = new File("src\\Chap19\\ex07\\mycat_copy2.jpg");		//Buffered�� ����Ͽ� ó��
		
		//���� ������ �ϱ� ���� ���� ����
		long start, end, time1, time2;	//time1 : Buffered(X), time2 : Buffered(O)
		
		//1.  Buffered�� ������� �ʰ� ó���ϴ� ���(BufferedInputStream, BufferOutStream
		start = System.nanoTime();	//���� �ð�
		
		try (InputStream is = new FileInputStream(orgfile1);
				OutputStream os = new FileOutputStream(orgfile2);){
			//������ ���� �ڵ� ����
			int data;
			while((data = is.read()) != -1) {	//is���� 1byte�о,	-1 ������ ����
				os.write(data);					//os�� 1byte����
			}
		} catch (IOException e) {}
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("Without BufferedXXXStream : " + time1);		//Buffer�� ������� �ʰ� ����
		
		//2. Buffered�� ����ϸ鼭 ó���ϴ� ���(BufferedInputStream, BufferOutStream)
		
		start = System.nanoTime();
		
		try(InputStream is = new FileInputStream(orgfile1);				//��� ��Ʈ��
				BufferedInputStream bi = new BufferedInputStream(is);	//�߰� ����� �����ϴ� ��Ʈ��, ������ ������ ó��(Buffer ���)
				OutputStream os = new FileOutputStream(orgfile3);		//��� ��Ʈ��
				BufferedOutputStream bo = new BufferedOutputStream(os);	//������ ������ �ϴ� �߰� ��� ����
				) {
			//������ �ڵ� ����
			int data;
			while((data = bi.read()) != -1){
				bo.write(data);
			}
		} catch (IOException e) {}
		end = System.nanoTime();
		time2 = end - start;
		System.out.println("With BufferedXXXStream : " + time2);
		
		//Buffered����� ���� ������� ���� ����� ���� 
		System.out.println("�ӵ����� ��" + (time1 / time2));
		
		
		
		
		
		
		
	}

}