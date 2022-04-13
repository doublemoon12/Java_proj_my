package Chap19.ex08;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReader_2 {

	public static void main(String[] args) {

		//1. 콘솔 입력(MS949)	: default charset, byte 스트림.
		
		try{
			InputStreamReader isr = new InputStreamReader(System.in, "MS949");
			//InputStreamReader	: byte ==> char로 변환
			//System.in : 콘솔 입력 , byte
			
			//isr은 변환된 char
			
			System.out.println("한글을 원하는 대로 입력 하세요>>");
			
			int data;
			while((data = isr.read()) != '\r') {
				System.out.println((char)data);
			}
			System.out.println();
			System.out.println(isr.getEncoding());
			
		} catch (IOException e) {}
		
		System.out.println();
		System.out.println("==============");
		
		//2. 콘솔입력 (UTF-8)
		try{
			InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
			System.out.println("한글을 원하는 대로 입력 하세요>>");
			
			int data;
			while((data = isr.read()) != '\r') {
				System.out.println((char)data);
			}
			System.out.println();
			System.out.println(isr.getEncoding());
			
		isr.close();
		
		} catch (IOException e) {}
		
		
		
	}

}
