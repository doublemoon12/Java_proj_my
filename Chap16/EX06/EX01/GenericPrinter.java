package Chap16.EX06.EX01;

//���ʸ� Ŭ���� : �پ��� Ÿ���� ����� �� �ִ� Ŭ����

public class GenericPrinter<T extends Meterial> {	//�پ��� ���� �������ϴ� ������(�Ŀ��, �ö�ƽ ���)
					//T : Ÿ�� ����, Meterial���� Ŭ������ T Ÿ�Կ� ���� �� �ִ�.
	private T material;		//material : ��������, ��ü, �ν��Ͻ�

	public T getMaterial() {	//��ü�� ����
		return material;
	}

	public void setMaterial(T material) {	//��ü�� Ȱ��ȭ
		this.material = material;
	}
	
	public String toString() {
		return material.toString();		//�ش� ��ü�� toString()ȣ��
	}
	
	public void printing() {	//�޼ҵ常 ����
		material.doPrinting();
	}
	
	
	
}
