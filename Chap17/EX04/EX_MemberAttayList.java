package Chap17.EX04;

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

class MemberArrayList{	//MemberArrayList�� ��üȭ �ϸ�ArrayList��ü�� �����ȴ�.
	private ArrayList<Member> arrayList;
	//List<Member> aList = new ArrayList<Member>();		<== ���ʸ� Ÿ��Ŭ���� ��ü ����
	//ArrayList<Member> arrayList = new ArrayList<Member>();
	
	public MemberArrayList() {	//�⺻ ������
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {	//Member��ü�� �޾Ƽ� �� ������ �濡 ���� �߰��ϴ� �޼ҵ�
		//�ڵ� ���
		arrayList.add(member);
	}
	public void addMember2(int a, Member member) {	//�Ű����� 2���� �޾Ƽ� Ư�� �ε��� �� ��ȣ�� ���� �߰�.
		//�ڵ� ���
		try {
		arrayList.add(a, member);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("����ó���� �Ǿ����ϴ�.");
		}
	}
	public boolean removeMember(int memberId) {
		//ArrayList�� ����� memberId�� �˻��ؼ� �ش� ��ü�� �����ϴ� �޼ҵ�
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);	//�� �濡 ����� Member ��ü�� member���� ������ �Ҵ�.
			int tempid = member.getMemberId();	//��ü�� getMemberId()�� ����ؼ� ��ü ���ο� �ִ�memberId�� �Ҵ�
			if(tempid == memberId) {
				arrayList.remove(i);	//arrayList�濡 ����� ��ü�� ����
				System.out.println("ȸ������ " + memberId + "�� ���� �Ǿ����ϴ�.");
				return true;
			}
		}
		System.out.println(memberId + "�� ���� ���� �ʽ��ϴ�.");
		return false;
	}
	public void showAllMember() {
		//ArrayList�� ����� ��� ����� ������ ���
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));	//������ Member��ü ��ü�� ������ �ͼ� ���
		}
	}
	public void showSize() {
		System.out.println(arrayList.size());
	}
}

public class EX_MemberAttayList {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();	//��ü�� �����ϴ� ���� arrayList�ʵ尡 Ȱ��ȭ �ȴ�.
		//�޼ҵ带 ȣ���ϱ� ���ؼ� ��ü����
		//addMember(), addMembr2(), removeMember(), showAllMember()
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "������");
		Member memberPark = new Member(1003, "������");
		Member memberHong = new Member(1004, "ȫ����");
		
		memberArrayList.addMember(memberLee);	//�� ��ü�� �����ؼ� ArrayList�� ����
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);

		memberArrayList.showSize();
		
		//Ư�� index�濡 ����� �߰�
		memberArrayList.addMember2(5, memberHong);	//���� ó��
		
		memberArrayList.showSize();
		
		memberArrayList.removeMember(1003);
		
		//��� ����� ���� ���
		memberArrayList.showAllMember();
		
		//Ư�� id�� ���� ����� ����
		memberArrayList.removeMember(1003);
	}

}
