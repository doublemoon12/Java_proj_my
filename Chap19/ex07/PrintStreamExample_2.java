package Chap19.ex07;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamExample_2 {

	public static void main(String[] args) {

		// 1. File 객체생성.
		File outFile1 = new File("src\\Chap19\\ex07\\printStream3.txt");
		File outFile2 = new File("src\\Chap19\\ex07\\printStream4.txt");

		try(OutputStream os1 = new FileOutputStream(outFile1);
				PrintStream ps = new PrintStream(os1);) {
				ps.println(5.8);
				ps.print(3 + "안녕" + 122345 + "\n");	//출력후 라인 개행(x)
				ps.printf("%d 이 호출되었습니다", 7);	//"%d" : int값을 호출
				ps.printf("%s %f", "안녕" , 5.8);		//%s : String 호출, %f : double호출
				
				
			} catch (IOException e) {}
		
		try(OutputStream os1 = new FileOutputStream(outFile1);
				PrintStream ps = new PrintStream(os1);) {
				int count;
				byte[] byteArray = new byte[100];
				

				
			} catch (IOException e) {}
		
		
	}

}
