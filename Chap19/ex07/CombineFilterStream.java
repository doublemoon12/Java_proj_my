package Chap19.ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//하나의 기반 스트림에 Filter 스트림을 여러개 혼합해서 사용이 가능 하다.
	//제일 마지막에 처리하는 스트림의 메소드 사용여부에 따라 순서를 가져올 수 있다.

//기반 스트림 1 	: FileOutputStream		: 기반 스트림. 파일에 쓰기
//FilterStream 	: BufferedOutputStream	: 버퍼를 사용해서 빠르게 처리
//FilterStream 	: DataOutputStream		: 다양한 포맷 방식으로 처리.

public class CombineFilterStream {

	public static void main(String[] args) {

		//파일 생성
		File dataFile = new File("src\\Chap19\\ex07\\file2.data");
		
		//데이터 쓰기
		try (OutputStream os = new FileOutputStream(dataFile);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			DataOutputStream dos = new DataOutputStream(bos);){
			
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
			dos.flush();
			
		} catch (Exception e) {}
		
		//데이터 읽기
		try(InputStream is = new FileInputStream(dataFile);
			BufferedInputStream bis = new BufferedInputStream(is);
			DataInputStream dis = new DataInputStream(bis);
				) {
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		} catch (Exception e) {}
		
		
		
		
	}

}
