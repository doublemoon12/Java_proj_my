package Chap17.EX06;

import java.util.ArrayList;
import java.util.Collection;

class Member{			//DTO, VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {	//�����ڸ� ���ؼ� �ʵ��� ���Ҵ�
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

class MemberArrayList{		//MemberArrayList�� ��üȭ �ϸ�ArrayList��ü�� �����ȴ�.
	private ArrayList<Member> arrayList;
	private Collection<? extends Member> addMemeber2;
	
	public MemberArrayList() {	//�⺻ ������
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {	//Member��ü�� �޾Ƽ� �� ������ �濡 ���� �߰��ϴ� �޼ҵ�
		//�ڵ� ���
		arrayList.add(member);
	}
	public void addMember2(int a, Member member) {	//�Ű����� 2���� �޾Ƽ� Ư�� �ε��� �� ��ȣ�� ���� �߰�.
		//�ڵ� ���
		arrayList.add(a, member);
	}
	public boolean removeMember(int memberId) {
		//ArrayList�� ����� memberId�� �˻��ؼ� �ش� ��ü�� �����ϴ� �޼ҵ�
		return arrayList.remove(1003);
		
	}
	public void showAllMember() {
		//ArrayList�� ����� ��� ����� ������ ���
		System.out.println(arrayList);
	}
	
}

public class EX_MemberArrayList {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "������");
		Member memberPark = new Member(1003, "������");
		Member memberHong = new Member(1004, "ȫ����");
		
		memberArrayList.addMember(memberLee);	//�� ��ü�� �����ؼ� ArrayList�� ����
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		
		//Ư�� index�濡 ����� �߰�
		memberArrayList.addMember2(3, memberHong);
		
		//��� ����� ���� ���
		memberArrayList.showAllMember();
		
		//Ư�� id�� ���� ����� ����
		memberArrayList.removeMember(1003);
		

		
	}

}
