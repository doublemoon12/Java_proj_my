package chap14.EX09;

import java.util.Scanner;

class SeasonException extends Exception{
	public SeasonException(){
		super();
	}
	public SeasonException(String message) {
		super(message);
	}
}

class WeekException extends Exception{
	public WeekException(){
		super();
	}
	public WeekException(String message) {
		super(message);
	}
}

class ScoreException extends Exception{
	public ScoreException(){
		super();
	}
	public ScoreException(String message) {
		super(message);
	}
}

class IdException extends Exception{
	public IdException(){
		super();
	}
	public IdException(String message) {
		super(message);
	}
}


class A{
	//private 	: 캡슐화, 객체 생성후 바로 접근하지 못하도록 설정
		//생성자, setter <== 제어가능 
	private String season;	//계절 필드(다른값 들어오면 예외 발생 : ~)
	private String week;	//일주일 필드(예외 발생 : ~)
	private int scoreKor;	//0 ~ 100 값만(예외 발생 : )
	private int scoreEng;	
	private String userID;	//12자이상 20자 사이(예외 발생 : )
	
	void checked(String season, String week, int scoreKor, int scoreEng, String userID) throws SeasonException, WeekException, ScoreException, IdException {
		if(!season.equals("봄") && !season.equals("여름") && !season.equals("가을") && !season.equals("겨울")) {
			throw new SeasonException("예외발생 : 봄, 여름, 가을, 겨울만 입력 하세요");
		}else if(!week.equals("월") && !week.equals("화") && !week.equals("수") && !week.equals("목") && !week.equals("금") && !week.equals("토") && !week.equals("일")) {
			throw new WeekException("예외발생 : 월,화,수,목,금,토,일 중에서 입력하세요");
		}else if(scoreKor > 100 || scoreKor < 0) {
			throw new ScoreException("예외발생 : 0 ~ 100 사이의 값만 입력하세요");
		}else if(scoreEng > 100 || scoreEng < 0) {
			throw new ScoreException("예외발생 : 0 ~ 100 사이의 값만 입력하세요");
		}else if(userID.length() < 12 || userID.length() >20) {
			throw new IdException("예외발생 : 12자이상 20자 이내의 문자만 넣으세요");
		}else {
			this.season = season;
			this.week = week;
			this.scoreKor = scoreKor;
			this.scoreEng = scoreEng;
			this.userID = userID;
			System.out.println("계절 : " + this.season + ", 요일 : " + this.week +", 국어점수 : " + this.scoreKor + ", 영어점수 : " + this.scoreEng + ", 아이디 : " + this.userID);
		}
	}

	private boolean season(String string, String string2, String string3, String string4) {
		return false;
	}	
}

public class UserException_EX {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("값을 입력하세요");
		A a = new A();
		try {
			a.checked("가을", "월", 50, 50, "211231212423");
		} catch  (SeasonException | WeekException | ScoreException | IdException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		scr.close();
		
	}

}
