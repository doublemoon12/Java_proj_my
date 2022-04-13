package Chap19.ex07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//InputStream	: ��� ��Ʈ��
	//int ==> 5555(����)===> 5555(����) ===> int
//DataInputStream	: �߰� ����� �����ϴ� ��Ʈ��, ��� ��Ʈ���� �ݵ�� ���� �ؾ� �Ѵ�. �ܵ� ��� �Ұ�
	//�پ��� ������ �����͸� ������ ������ �� ���.
	//int => int, double => double�� ����
public class DataInputStream_1 {

	public static void main(String[] args) {
		//���� ����
		File dataFile = new File("src\\Chap19\\ex07\\file1.data"); //Ȯ���� ����
		
		//������ ����
		try(OutputStream os = new FileOutputStream(dataFile);
			DataOutputStream dos = new DataOutputStream(os);) {
				dos.writeInt(35);
				dos.writeDouble(5.8);
				dos.writeChar('A');
				dos.writeUTF("�ȳ��ϼ���");
				dos.flush();
			
		} catch (IOException e) {}
		
		//������ �б�
		
		try(InputStream is = new FileInputStream(dataFile);
			DataInputStream dis = new DataInputStream(is);	
				) {
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		} catch (Exception e) {
			
		}
		
		
		
		
		
	}

}
