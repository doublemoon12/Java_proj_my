package Chap17.EX06;

//HashSet���� ��ȯ
//MemberŬ������ membered�÷��� equals(), hashCode() ������ �ؼ� ������ ��ü�� �ν�

//�߿� : Set�� �ߺ��� ���� ������ �� ����.
	//WrapperŬ������ Integer, Long, Double, Float, Character, Byte, Short, Boolean
	//WrapperŬ������ equals(), hashCode()�� ������ �Ǿ� �ִ�.
	//Ư�� ��ü�� ���� �� �� ��ü�� Set�� ������ ��� �� ��ü�� ObjectŬ������ equals(), hashCode()�� ������ ���־�� �Ѵ�.
	//��ü�� Ư�� �ʵ��� ���� ������ �ߺ��� �ĺ��ϴ� �ʵ带 ����.


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
	private HashSet<Member> HashSet;	//�ʵ��� private�� �ֱ⶧���� (�����ڳ� setter�� ���ؼ� ���� �Ҵ��� �� �ִ�.)
		//Set<Member> hashSet = new hashSet<Member>();
	private int memberId;
	
	// List<Member> aList = new HashSet<Member>(); <== ���ʸ� Ÿ��Ŭ���� ��ü ����
		// HashSet<Member> HashSet = new HashSet<Member>();
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof MemberHashSet) {
				this.HashSet = ((MemberHashSet) obj).HashSet;	//�ٿ�ĳ�����Ҷ� ��Ÿ�ӿ����� �����Ϸ���, Object�� Member��ü�� ���ԵǾ� ������ �ؾ��Ѵ�.
				return true;
			}
			return false;
		}

		@Override
		public int hashCode() {
			//return memberId;		//this.memberid
			//return this.memberId	//�ϳ��� �ʵ常�� �������� hashCode()����
			return Objects.hashCode(HashSet);
		}

	public MemberHashSet() { // �⺻ ������ ȣ��� Set�� �������� Ȱ��ȭ.
		HashSet = new HashSet<Member>();
	}

	public void addMember(Member member) { // Member��ü�� �޾Ƽ� �� ������ �濡 ���� �߰��ϴ� �޼ҵ�
		// �ڵ� ���
		HashSet.add(member);	//Member��ü�� ��ǲ �޾� hashSet�� member��ü�� ����, �ߺ� ����Ǹ� �ȵȴ�.
	}							//Member��ü�� memberId�ʵ��� ���� ������ ���, ������ ��ü�̴�. ��� �����Ѵ�
								//equals(), hashCode()�޼ҵ� ������ : memberId

	public void removeMember(int memberId) {	//memberId�� Member��ü ���� �ʵ��̹Ƿ� Set�� ����� ��ü�� �����;��Ѵ�.
		//Set�� index�� �������� �����Ƿ� �⺻ for���� ����Ҽ� ����.
		//���� for���� ����� ���� �ִ�. iterator�� ����� �� �ִ�.
		Iterator<Member> iterator = HashSet.iterator();
		while (iterator.hasNext()) {	//hashNext() : hashSet�� ���� �����Ҷ� true
			if (iterator.next().getMemberId() == memberId) {	//next(); ���� �����ְ� ���� ������ �̵�.
				iterator.remove();
				System.out.println(memberId + "��ȣ�� ���� ����ڰ� �����Ǿ����ϴ�.");
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
		/*Iterator<Member> ir = HashSet.iterator();	//��������
		while(ir.hasNext()) {
			Member member = ir.next();		//hashSet�� ���� ������ �´�
			System.out.print(member);	//hashSet�� ��ü�� ��� toString()������ : �ʵ��� ���� ���.
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
		memberHashSet1.removeMember(1001);

		memberHashSet1.showAllMember();

	}

}
