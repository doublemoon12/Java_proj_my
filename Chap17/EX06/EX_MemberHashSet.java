package Chap17.EX06;

//HashSet���� ��ȯ
//MemberŬ������ membered�÷��� equals(), hashCode() ������ �ؼ� ������ ��ü�� �ν�

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class Member { // DTO, VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberId;
	private String memberName;

	public Member(int memberId, String memberName) { // �����ڸ� ���ؼ� �ʵ��� ���Ҵ�
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
		return memberName + "ȸ������ ���̵�� " + memberId + "�Դϴ�.";
	}

}

class MemberHashSet { // MemberHashSet�� ��üȭ �ϸ�HashSet��ü�� �����ȴ�.
	private HashSet<Member> HashSet;
	private int memberId;

	// List<Member> aList = new HashSet<Member>(); <== ���ʸ� Ÿ��Ŭ���� ��ü ����
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

	public MemberHashSet() { // �⺻ ������
		HashSet = new HashSet<Member>();
	}

	public void addMember(Member member) { // Member��ü�� �޾Ƽ� �� ������ �濡 ���� �߰��ϴ� �޼ҵ�
		// �ڵ� ���
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
		// �޼ҵ带 ȣ���ϱ� ���ؼ� ��ü����
		// addMember(), addMembr2(), removeMember(), showAllMember()
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "������");
		Member memberPark = new Member(1003, "������");
		Member memberHong = new Member(1004, "ȫ����");
		Member memberLee2 = new Member(1001, "������");
		Member memberhong2 = new Member(1001, "ȫ����");

		memberHashSet1.addMember(memberLee);
		memberHashSet1.addMember(memberSon);
		memberHashSet1.addMember(memberPark);
		memberHashSet1.addMember(memberHong);
		memberHashSet1.addMember(memberLee);
		memberHashSet1.addMember(memberHong);
		memberHashSet1.addMember(memberLee);

		//memberHashSet1.showSize();

		// ��� ����� ���� ���
		memberHashSet1.showAllMember();

		// Ư�� id�� ���� ����� ����
		memberHashSet1.removeMember(1003);

		memberHashSet1.showAllMember();

	}

}
