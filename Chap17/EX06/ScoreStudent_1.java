package Chap17.EX06;

/*
 * 1.�л��� 	: ������ ���� �Է� ������ ArrayList�� capacityũ������
 * 2.�����Է�	: �Է¹��� �л����� ���� ���� �Է�. ArrayList�� ��ü�� ����
 * 3.��������Ʈ	: ArrayList�� ����� Student ��ü�� �����ͼ� score���
 * 4.�м�		: �ְ���:	,�������:
 * 5.���� 
 */
import java.util.ArrayList;
import java.util.Scanner;

class Student {
	int score; // ������ �Է�, �ʵ��� �� �Ҵ�. (1. ��ü ���� �� �����Ҵ�, 2. private(������, setter, getter)
}

public class ScoreStudent_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> arr = new ArrayList<Student>();

		boolean run = true;
		int studentNum = 0;
		while (run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("----------------------------------------------------");
			System.out.println("����> ");
			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				System.out.println("�л����� �Է��ϼ��� : ");
				// �ڵ� �ۼ�
				studentNum = sc.nextInt();
				System.out.println("�Է¿Ϸ�");

			} else if (selectNo == 2) {
				// �ڵ��ۼ�
				if (studentNum == 0) {
					System.out.println("�л����� ���� �Է��ϼ���");
				} else {
					for (int i = 0; i < studentNum; i++) {
						Student student = new Student();
						System.out.println((i+1) + "��° �л������� �Է��ϼ���.");
						student.score = sc.nextInt();
						arr.add(student);	//ArrayList�� �ʵ忡 ���� �Ҵ��� ��ü�� ArrayList�� ����
					}
				}
			} else if (selectNo == 3) {
				// �ڵ��ۼ�
				for (Student k : arr) {
					System.out.println(k.score);
				}
			} else if (selectNo == 4) {
				int maxScore = 0;
				int sum = 0;
				// �ڵ��ۼ�
				for (Student k : arr) {
					if (k.score >= maxScore) {
						maxScore = k.score;
					}
					sum += k.score;
				}
				System.out.println("�ְ����� : " + maxScore);
				System.out.println("������� : " + (float) sum / studentNum);
				
			} else if (selectNo == 5) {
				// �ڵ��ۼ�
				break;
			}
		}
		System.out.println("���α׷� ����");
	}
}
