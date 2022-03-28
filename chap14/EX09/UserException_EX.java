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
	//private 	: ĸ��ȭ, ��ü ������ �ٷ� �������� ���ϵ��� ����
		//������, setter <== ����� 
	private String season;	//���� �ʵ�(�ٸ��� ������ ���� �߻� : ~)
	private String week;	//������ �ʵ�(���� �߻� : ~)
	private int scoreKor;	//0 ~ 100 ����(���� �߻� : )
	private int scoreEng;	
	private String userID;	//12���̻� 20�� ����(���� �߻� : )
	
	void checked(String season, String week, int scoreKor, int scoreEng, String userID) throws SeasonException, WeekException, ScoreException, IdException {
		if(!season.equals("��") && !season.equals("����") && !season.equals("����") && !season.equals("�ܿ�")) {
			throw new SeasonException("���ܹ߻� : ��, ����, ����, �ܿ︸ �Է� �ϼ���");
		}else if(!week.equals("��") && !week.equals("ȭ") && !week.equals("��") && !week.equals("��") && !week.equals("��") && !week.equals("��") && !week.equals("��")) {
			throw new WeekException("���ܹ߻� : ��,ȭ,��,��,��,��,�� �߿��� �Է��ϼ���");
		}else if(scoreKor > 100 || scoreKor < 0) {
			throw new ScoreException("���ܹ߻� : 0 ~ 100 ������ ���� �Է��ϼ���");
		}else if(scoreEng > 100 || scoreEng < 0) {
			throw new ScoreException("���ܹ߻� : 0 ~ 100 ������ ���� �Է��ϼ���");
		}else if(userID.length() < 12 || userID.length() >20) {
			throw new IdException("���ܹ߻� : 12���̻� 20�� �̳��� ���ڸ� ��������");
		}else {
			this.season = season;
			this.week = week;
			this.scoreKor = scoreKor;
			this.scoreEng = scoreEng;
			this.userID = userID;
			System.out.println("���� : " + this.season + ", ���� : " + this.week +", �������� : " + this.scoreKor + ", �������� : " + this.scoreEng + ", ���̵� : " + this.userID);
		}
	}

	private boolean season(String string, String string2, String string3, String string4) {
		return false;
	}	
}

public class UserException_EX {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		A a = new A();
		try {
			a.checked("����", "��", 50, 50, "211231212423");
		} catch  (SeasonException | WeekException | ScoreException | IdException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		scr.close();
		
	}

}
