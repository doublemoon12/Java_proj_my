package Chap19.ex08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

//InputStreamReader		: byte ==> char	, charset(MS949, UTf-8)지정해서 파일을 읽어 올 수 있다.
//OutputStreamWriter	: byte ==> char, charset(MS949, UTf-8)지정해서 파일을 저장 할 수 있다.

public class OutputStreamWriter_1 {

	public static void main(String[] args) {

		//1. FileWriter를 통해서 데이터 쓰기(Default : MS949)
		File osw1 = new File("src\\Chap19\\ex08\\osw1.txt");
		File osw2 = new File("src\\Chap19\\ex08\\osw2.txt");
		
		try(Writer writer = new FileWriter(osw1);) {
			writer.write("OutputStreamWriter1 예제 파일 입니다. \n".toCharArray());
			writer.write("한글과 영문이 모두 포함 되어 있습니다.");
			writer.write('\n');
			writer.write("Good Bye !!!!! \n\n");
			writer.flush();
			
		} catch (IOException e) {}
		
		
		//2. FileWriter를 사용해서 (Default : MS949 ===> UTF-8파일쓰기)
		
		try(OutputStream os = new FileOutputStream(osw2);
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");){
			
			osw.write("OutputStreamWriter1 예제 파일 입니다. \n".toCharArray());
			osw.write("한글과 영문이 모두 포함 되어 있습니다.");
			osw.write('\n');
			osw.write("Good Bye !!!!! \n\n");
			osw.flush();
			
		} catch (IOException e) {}
		
		
		
		
		
		
	}

}
