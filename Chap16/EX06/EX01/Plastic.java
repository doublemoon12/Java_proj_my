package Chap16.EX06.EX01;

//GenericPrinter�� ���� ��ü [���]

public class Plastic extends Meterial{

	public void doPrinting() {		//�߻� �޼ҵ��� Ŭ������ ������ �޼ҵ�
		System.out.println("�ö�ƽ ���� ����մϴ�.");
	}
	@Override
	public String toString() {
		
		return "���� �ö�ƽ";
	}
}
