package Chap17.EX06;

//HashSet으로 변환
//Member클래스의 membered컬럼을 equals(), hashCode() 재정의 해서 동일한 객체로 인식

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class Member { // DTO, VO : 각 계층간에 데이터를 받아서 전달해주는 클래스
	private int memberId;
	private String memberName;

	public Member(int memberId, String memberName) { // 생성자를 통해서 필드의 값할당
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

class MemberHashSet { // MemberHashSet를 객체화 하면HashSet객체가 생성된다.
	private HashSet<Member> HashSet;
	private int memberId;

	// List<Member> aList = new HashSet<Member>(); <== 제너릭 타입클래스 객체 생성
	// HashSet<Member> HashSet = new HashSet<Member>();
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MemberHashSet) {
			this.HashSet = ((MemberHashSet) obj).HashSet;
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(HashSet);
	}

	public MemberHashSet() { // 기본 생성자
		HashSet = new HashSet<Member>();
	}

	public void addMember(Member member) { // Member객체를 받아서 맨 마지막 방에 값을 추가하는 메소드
		// 코드 블록
		HashSet.add(member);
	}

	public void removeMember(int memberId) {
		
		Iterator<Member> iterator = HashSet.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getMemberId() == memberId) {
				iterator.remove();
			}
		}
		/*for (Member k : HashSet) {
			if (k.getMemberId() == memberId) {
				System.out.println(k);
				removeMember();
			}
		}*/
	}

	public void showAllMember() {
		System.out.println(HashSet);
	}

	public void showSize() {
		System.out.println(HashSet.size());
	}
}

public class EX_MemberHashSet {

	public static void main(String[] args) {
		MemberHashSet memberHashSet1 = new MemberHashSet();
		// 메소드를 호출하기 위해서 객체생성
		// addMember(), addMembr2(), removeMember(), showAllMember()
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손지원");
		Member memberPark = new Member(1003, "박지원");
		Member memberHong = new Member(1004, "홍지원");
		Member memberLee2 = new Member(1001, "이지원");
		Member memberhong2 = new Member(1001, "홍지원");

		memberHashSet1.addMember(memberLee);
		memberHashSet1.addMember(memberSon);
		memberHashSet1.addMember(memberPark);
		memberHashSet1.addMember(memberHong);
		memberHashSet1.addMember(memberLee);
		memberHashSet1.addMember(memberHong);
		memberHashSet1.addMember(memberLee);

		//memberHashSet1.showSize();

		// 모든 사용자 정보 출력
		memberHashSet1.showAllMember();

		// 특정 id를 가진 사용자 제거
		memberHashSet1.removeMember(1003);

		memberHashSet1.showAllMember();

	}

}
