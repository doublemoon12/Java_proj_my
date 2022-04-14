package Chap19.ex08;

import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*
 * Reader / Writer			: �߻� Ŭ����. char�� ó��, ����(0), �̹���(X), MP3(x)....
 * FileReader / FileWriter	: �ϼ��� Ŭ����, Default charset�� ���
 * InputStreamReader / OutputStreamWriter	: ������ ���ڵ� (MS949 , UTF-8)�����ؼ� �а� ���� ����
 * 
 * ���� : System.in	: �ֿܼ��� �Է�, System.out : �ֿܼ��� ��� <== Application���� �ѹ� close()�Ǹ� ���� �Ұ�
 * 
 * 
 */

public class OutputStreamWriter_2 {

	public static void main(String[] args) {

		//1. �ܼ� ���(Default : MS949)
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "MS949");
			osw.write("OutputStreamWriter1 ���� ���� �Դϴ�. \n".toCharArray());
			osw.write("�ѱ۰� ������ ��� ���� �Ǿ� �ֽ��ϴ�.");
			osw.write('\n');
			osw.write("Good Bye !!!!! \n\n");
			osw.flush();
		} catch (Exception e) {}
		
		
		System.out.println();
		System.out.println("=======================");
		
		//�ܼ� ���(Application Default : MS949 ==> UTF-8)
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "UTF-8");
			osw.write("OutputStreamWriter1 ���� ���� �Դϴ�. \n".toCharArray());
			osw.write("�ѱ۰� ������ ��� ���� �Ǿ� �ֽ��ϴ�.");
			osw.write('\n');
			osw.write("Good Bye !!!!! \n\n");
			osw.flush();
		} catch (Exception e) {}
		
		
		
		
	}

}
