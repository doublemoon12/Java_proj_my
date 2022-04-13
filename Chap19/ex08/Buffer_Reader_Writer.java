package Chap19.ex08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.Buffer;

public class Buffer_Reader_Writer {

	public static void main(String[] args) {

		//1. 파일 객체 생성
		File rwFile = new File("src/Chap19/ex08/BufferedFile.txt");
		
		//2. FileWriter를 이용한 파일 쓰기(MS949모드)
		
		try(Writer writer = new FileWriter(rwFile);
			BufferedWriter bw = new BufferedWriter(writer);) {
			bw.write("안녕하세요 \n");
			bw.write("Hello");
			bw.write('\r');
			bw.write('\n');
			bw.write("반갑습니다", 2, 3);
			bw.flush();
			}
		catch (IOException e) {}
		
		//3 FileReader를 이용한 파일 읽기(MS-949)
		
		try(Reader reader = new FileReader(rwFile);
			BufferedReader br = new BufferedReader(reader);) {
			//BufferedReader에 추가된 메소드 : String readLine(), 파일의 끝을 나타 냴때 , null
			//int read()	: 파일의 끝을 나타낼 때 -1
			
			String data;
			while((data = br.readLine()) != null) {
				System.out.println(data);
			}
		} catch (IOException e) {}
		
		
	}

}
