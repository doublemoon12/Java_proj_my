package Chap19.EX03;

import java.io.UnsupportedEncodingException;

//EUC-KR - 한국 표준, 한글 표현가능 전체중 표기 가능한것만 구성되어 있음. 약 11,000 ---> 2200 만 표기, 8000자는 표기 안됨. 
    // 영문 : 1byte
	// 한글 : 2byte
	//웹페이지로 출력 할때 

//MS-949  - Microsoft 사에서 개발한 한글 표기 방식. 11000모두를 표기할 수 있다. Windows OS 
    // 영문 : 1byte 
    // 한글 ; 2bype

//UTF-8 : 모든 서버 (Web, FTP, Mail, DB,  .....) , git, Mac,Linux <가변 길이>
    // 영문 : 1byte
    // 한글 : 3bype

//UTF-16 : <고정길이> 
    // 영문, 한글 모두 2byte로 처리. 


//문자를 해당 인코딩 타입으로 바이트 스트림으로 생성한 경우 , 해당 인코딩 타입으로 조합을 해야 깨어지지 않는다. 

//이클립스에서 인코딩 타입 설정 3가지. 
	//1. 전역 설정 : 
    //2. 프로잭트에서 설정 : 
    //3. 파일에서 설정. 

	//우선운위     파일 > 프로잭트 > 전역 



public class EUCKR_VS_MS949 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//EUCKR vs MS949
		
		//1. 영문자 를 byte로 내보내고 String으로 변환  : 1byte
		
	   byte[] b1 = "a".getBytes("EUC-KR");   //문자를 byte 로 변환 , ===> 네트워크로 문자를 byte 스트림으로 변환해서 전송.
		   // 예외가 발생됨. (UnsupportedEncodingException) <== 오타가 발생할경우 인코딩 할수 없는 예외가 발생이됨. 
	   byte[] b2 = "a".getBytes("MS949");   // 문자열 ==> byte[]  
	   
	   System.out.println(b1.length);   //1
	   System.out.println(b2.length);   //1
	   
	   System.out.println(new String(b1,"EUC-KR"));  //byte[] ==> 문자열로 바꿈      
	   System.out.println(new String(b2,"MS949"));
	   
	   System.out.println();
	   
	   //2. 한글을 byte로 내보내고 String 으로 가져오기 
	   
	   byte[] b3 = "가".getBytes("EUC-KR");
	   byte[] b4 = "가".getBytes("MS949");
	   
	   System.out.println(b3.length);   //2
	   System.out.println(b4.length);   //2
	   
	   System.out.println(new String(b3,"EUC-KR"));  //byte[] ==> 문자열로 바꿈      
	   System.out.println(new String(b4,"MS949"));
	   
	   
	   //3. EUC-KR은 현재 사용 가능한 것만 표기, 약 2000자. 
	   //   MS949는 11,000자 모두 표기됨. 
	   byte[] b5 = "봵".getBytes("EUC-KR");   // 11,000자 중 2000만 표기, 8000 (x)
	   byte[] b6 = "봵".getBytes("MS949");	  // 11,000자 모두 처리 
	   System.out.println(b5.length);   //1  ?
	   System.out.println(b6.length);   //2
	   
	   System.out.println(new String(b5,"EUC-KR"));  //byte[] ==> 문자열로 바꿈      
	   System.out.println(new String(b6,"MS949"));
	   
	}

}
