package Chap19.ex08;

import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*
 * Reader / Writer			: 추상 클래스. char를 처리, 문자(0), 이미지(X), MP3(x)....
 * FileReader / FileWriter	: 완성된 클래스, Default charset만 사용
 * InputStreamReader / OutputStreamWriter	: 읽을때 인코딩 (MS949 , UTF-8)지정해서 읽고 쓰기 가능
 * 
 * 주의 : System.in	: 콘솔에서 입력, System.out : 콘솔에서 출력 <== Application에서 한번 close()되면 재사용 불가
 * 
 * 
 */

public class OutputStreamWriter_2 {

	public static void main(String[] args) {

		//1. 콘솔 출력(Default : MS949)
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "MS949");
			osw.write("OutputStreamWriter1 예제 파일 입니다. \n".toCharArray());
			osw.write("한글과 영문이 모두 포함 되어 있습니다.");
			osw.write('\n');
			osw.write("Good Bye !!!!! \n\n");
			osw.flush();
		} catch (Exception e) {}
		
		
		System.out.println();
		System.out.println("=======================");
		
		//콘솔 출력(Application Default : MS949 ==> UTF-8)
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "UTF-8");
			osw.write("OutputStreamWriter1 예제 파일 입니다. \n".toCharArray());
			osw.write("한글과 영문이 모두 포함 되어 있습니다.");
			osw.write('\n');
			osw.write("Good Bye !!!!! \n\n");
			osw.flush();
		} catch (Exception e) {}
		
		
		
		
	}

}
