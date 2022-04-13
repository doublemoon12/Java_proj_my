package Chap19.ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Img_Test {

	public static void main(String[] args) {
		//두파일을 복사, Buffered를 사용하지 않고 처리하는 경우, Buffered를 사용하는 경우 속도 차이.
		
				File orgfile1 = new File("C:\\temp001\\KakaoTalk_20220320_104846511.png");	//원본
				File orgfile2 = new File("C:\\temp001\\KakaoTalk_20220320_copy1.png");		//Buffered를 사용하지 않고 처리
				File orgfile3 = new File("C:\\temp001\\KakaoTalk_20220320_copy2.png");		//Buffered를 사용하여 처리
				
				//성능 측정을 하기 위한 변수 선언
				long start, end, time1, time2;	//time1 : Buffered(X), time2 : Buffered(O)
				
				//1.  Buffered를 사용하지 않고 처리하는 경우(BufferedInputStream, BufferOutStream
				start = System.nanoTime();	//시작 시간
				
				try (InputStream is = new FileInputStream(orgfile1);
						OutputStream os = new FileOutputStream(orgfile2);){
					//데이터 복사 코드 생성
					int data;
					while((data = is.read()) != -1) {	//is에서 1byte읽어서,	-1 마지막 까지
						os.write(data);					//os에 1byte쓰기
					}
				} catch (IOException e) {}
				end = System.nanoTime();
				time1 = end - start;
				System.out.println("Without BufferedXXXStream : " + time1);		//Buffer를 사용하지 않고 복사
				
				//2. Buffered를 사용하면서 처리하는 경우(BufferedInputStream, BufferOutStream)
				
				start = System.nanoTime();
				
				try(InputStream is = new FileInputStream(orgfile1);				//기반 스트림
						BufferedInputStream bi = new BufferedInputStream(is);	//추가 기능을 제공하는 스트림, 성능을 빠르게 처리(Buffer 사용)
						OutputStream os = new FileOutputStream(orgfile3);		//기반 스트림
						BufferedOutputStream bo = new BufferedOutputStream(os);	//성능을 빠르게 하는 추가 기능 제공
						) {
					//복사할 코드 생성
					int data;
					while((data = bi.read()) != -1){
						bo.write(data);
					}
				} catch (IOException e) {}
				end = System.nanoTime();
				time2 = end - start;
				System.out.println("With BufferedXXXStream : " + time2);
				
				//Buffered사용한 경우와 사용하지 않은 경우의 비율 
				System.out.println("속도차이 배" + (time1 / time2));
				
				

	}

}
