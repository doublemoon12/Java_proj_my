package Chap19.ex06;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutputObject_1 {

	public static void main(String[] args) throws IOException {

		OutputStream os = System.out;
		
		//1. 1-byte출력
		os.write('J');
		os.write('A');
		os.write('V');
		os.write('A');
		os.write('\r');
		os.write('\n');
		
		os.flush();
		//os.close();
		
		//2. n-byte출력
		byte[] byteArray1 = "Hello!".getBytes();
		
		os.write(byteArray1);
		os.write('\n');
		os.flush();
		
		//3. n-byte출력
		byte[] byteArray2 = "Better the last smile than the first laughter".getBytes();
		os.write(byteArray2, 7, 8);
		//write(byte, offset, length);
		os.flush();
		os.close();
		
		
		
	}

}
