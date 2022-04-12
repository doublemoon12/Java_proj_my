package Chap19.ex06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

//콘솔에서 100byte이하 한글을 인풋 받은 값을 input.txt에 저장 후, Charaset.Default
//input.txt파일에서 값을 읽어서 콘솔에 출력
//1. System.in			 	: 콘솔에서 인풋
//2. FileOutputStream 		: 인풋받은 값을 파일에 저장.
//3. FileInputStream		: 저장된 파일의 내용을 읽어오기
//4. 콘솔에 출력

public class EX06_ConsoleInputOutputObject {

	public static void main(String[] args) throws IOException {

		File inputFile = new File("src/Chap19/ex06/input.txt");
		
		InputStream is1 = System.in;
		OutputStream os = System.out;
		
		OutputStream os1 = new FileOutputStream(inputFile);
		
		System.out.println("한글만 입력 하세요");
		
		byte[] arr1 = new byte[100];
		int count1 = is1.read(arr1);
		
		is1.close();
		
		os1.write(arr1);
		os1.write('\n');
		
		byte[] arr2 = "어렵습니다".getBytes(Charset.defaultCharset());
		
		os.write(arr2);
		os.write('\n');
		
		os1.flush();
		os1.close();
		
		
		
	}

}
