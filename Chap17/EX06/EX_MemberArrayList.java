package Chap17.EX06;

import java.util.ArrayList;
import java.util.Collection;

class Member{			//DTO, VO : 각 계층간에 데이터를 받아서 전달해주는 클래스
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {	//생성자를 통해서 필드의 값할당
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberId + "입니다.";
	}
	
}

class MemberArrayList{		//MemberArrayList를 객체화 하면ArrayList객체가 생성된다.
	private ArrayList<Member> arrayList;
	private Collection<? extends Member> addMemeber2;
	
	public MemberArrayList() {	//기본 생성자
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {	//Member객체를 받아서 맨 마지막 방에 값을 추가하는 메소드
		//코드 블록
		arrayList.add(member);
	}
	public void addMember2(int a, Member member) {	//매개변수 2개를 받아서 특정 인덱스 방 번호에 값을 추가.
		//코드 블록
		arrayList.add(a, member);
	}
	public boolean removeMember(int memberId) {
		//ArrayList에 저장된 memberId를 검색해서 해당 객체를 삭제하는 메소드
		return arrayList.remove(1003);
		
	}
	public void showAllMember() {
		//ArrayList에 저장된 모든 사용자 정보를 출력
		System.out.println(arrayList);
	}
	
}

public class EX_MemberArrayList {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손지원");
		Member memberPark = new Member(1003, "박지원");
		Member memberHong = new Member(1004, "홍지원");
		
		memberArrayList.addMember(memberLee);	//각 객체를 생성해서 ArrayList에 저장
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		
		//특정 index방에 사용자 추가
		memberArrayList.addMember2(3, memberHong);
		
		//모든 사용자 정보 출력
		memberArrayList.showAllMember();
		
		//특정 id를 가진 사용자 제거
		memberArrayList.removeMember(1003);
		

		
	}

}
