package Chap19.ex08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class File_Reader_Writer_utf8 {

	public static void main(String[] args) {
		//파일 객체 생성
				File rwFile = new File("src/Chap19/ex08/rwFile_utf8.txt");
				
				try(Writer writer = new FileWriter(rwFile);) {	//Writer : 추상 클래스, FileWriter	: Writer를 구현한 자식 클래스
					//OutputStream	: byte단위 출력, 추상 클래스, FileOutputStream, 문자, 데이터, mp3 등등 모든처리
					//Writer		: char단위 출력, 추상 클래스, FileWriter, 문자만 특화해서 처리
					
					writer.write("안녕하세요 \n".toCharArray());
					writer.write("Hello \n");
					writer.write('A');
					writer.write("\r");
					writer.write("\n");
					writer.write("반갑습니다", 2, 3);
					writer.flush();
					
				} catch (IOException e) {}
				
				//FileReader를 이용한 파일 읽기(Default MS949)	<== Chartorset 지정 옵션이 없다.
				
				try (Reader reader = new FileReader(rwFile);){
					int data;
					while((data = reader.read()) != -1){
						System.out.print((char)data);
					}
					
				} catch (IOException e) {}

	}

}
