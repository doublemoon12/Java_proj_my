package Chap17.EX06;

//HashSet으로 변환
//Member클래스의 membered컬럼을 equals(), hashCode() 재정의 해서 동일한 객체로 인식

//중요 : Set은 중복된 값을 저장할 수 없다.
	//Wrapper클래스는 Integer, Long, Double, Float, Character, Byte, Short, Boolean
	//Wrapper클래슨는 equals(), hashCode()가 재정의 되어 있다.
	//특정 객체를 생성 후 그 객체를 Set에 저장할 경우 그 객체의 Object클래스의 equals(), hashCode()를 재정의 해주어야 한다.
	//객체의 특정 필드의 값이 같을때 중복을 식별하는 필드를 생성.


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
	private HashSet<Member> HashSet;	//필드의 private이 있기때문에 (생성자나 setter를 통해서 값을 할당할 수 있다.)
		//Set<Member> hashSet = new hashSet<Member>();
	private int memberId;
	
	// List<Member> aList = new HashSet<Member>(); <== 제너릭 타입클래스 객체 생성
		// HashSet<Member> HashSet = new HashSet<Member>();
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof MemberHashSet) {
				this.HashSet = ((MemberHashSet) obj).HashSet;	//다운캐스팅할때 런타임오류를 방지하려면, Object에 Member객체가 포함되어 있을때 해야한다.
				return true;
			}
			return false;
		}

		@Override
		public int hashCode() {
			//return memberId;		//this.memberid
			//return this.memberId	//하나의 필드만을 조건으로 hashCode()생성
			return Objects.hashCode(HashSet);
		}

	public MemberHashSet() { // 기본 생성자 호출시 Set의 참조변수 활성화.
		HashSet = new HashSet<Member>();
	}

	public void addMember(Member member) { // Member객체를 받아서 맨 마지막 방에 값을 추가하는 메소드
		// 코드 블록
		HashSet.add(member);	//Member객체를 인풋 받아 hashSet에 member객체를 저장, 중복 저장되면 안된다.
	}							//Member객체의 memberId필드의 값이 동일할 경우, 동일한 객체이다. 라고 정의한다
								//equals(), hashCode()메소드 재정의 : memberId

	public void removeMember(int memberId) {	//memberId는 Member객체 내의 필드이므로 Set에 저장된 객체를 가져와야한다.
		//Set은 index가 존재하지 않으므로 기본 for문을 사용할수 없다.
		//향상된 for문을 사용할 수는 있다. iterator를 사용할 수 있다.
		Iterator<Member> iterator = HashSet.iterator();
		while (iterator.hasNext()) {	//hashNext() : hashSet에 값이 존재할때 true
			if (iterator.next().getMemberId() == memberId) {	//next(); 값을 던져주고 다음 값으로 이동.
				iterator.remove();
				System.out.println(memberId + "번호를 가진 사용자가 삭제되었습니다.");
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
		/*Iterator<Member> ir = HashSet.iterator();	//지역변수
		while(ir.hasNext()) {
			Member member = ir.next();		//hashSet의 값을 가지고 온다
			System.out.print(member);	//hashSet의 객체를 출력 toString()재정의 : 필드의 값을 출력.
		}*/
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
		memberHashSet1.removeMember(1001);

		memberHashSet1.showAllMember();

	}

}
