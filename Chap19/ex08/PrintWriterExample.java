package Chap19.ex08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

//PrintWriter : 자동 flush()기능이 있지만 활성화 해야한다.
//		flush()를 처리하지 않으면 메모리에만 써져있고 호출 X
//		close()가 호출될때 flush()가 호출되고 나서 close()가된다

public class PrintWriterExample {

	public static void main(String[] args) {

		//1. 파일 객체 생성
		File pw1 = new File("src\\Chap19\\ex08\\pw1.txt");
		File pw2 = new File("src\\Chap19\\ex08\\pw2.txt");
		File pw3 = new File("src\\Chap19\\ex08\\pw3.txt");
		
		
		//2. PrintWriter(File file)
		try(PrintWriter pw = new PrintWriter(pw1);) {
			pw.println("PrintWriter 예제 #1");
			pw.println(133);
			pw.println(5.8);
			pw.print("안녕하세요 ");
			pw.println("반갑습니다. ");
			pw.printf("%d, %S", 7, "안녕").printf("%S, %f" , "감사", 3.7);
		} catch (FileNotFoundException e) {}
		
		//3 PrintWriter(OutputStream os)
		try(PrintWriter pw = new PrintWriter(new FileOutputStream(pw2));) {
			pw.println("PrintWriter 예제 #1");
			pw.println(133);
			pw.println(5.8);
			pw.print("안녕하세요 ");
			pw.println("반갑습니다. ");
			pw.printf("%d, %S", 7, "안녕").printf("%S, %f" , "감사", 3.7);
		} catch (FileNotFoundException e) {}
		
		//4. PrintWriter(System.out)
		PrintWriter pw = new PrintWriter(System.out, true);	//true의 의미는 flush()를 자동으로 실행 해라
		pw.println("PrintWriter 예제 #1");
		pw.println(133);
		pw.println(5.8);
		pw.print("안녕하세요 ");
		pw.println("반갑습니다. ");
		pw.printf("%d, %S", 7, "안녕").printf("%S, %f" , "감사", 3.7);
		//pw.flush();
		//pw.close();
		
		
		
		
		
	}

}
