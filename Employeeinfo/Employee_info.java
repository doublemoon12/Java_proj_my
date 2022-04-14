package Employeeinfo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


class Employee { // ����� ������ ���� Ŭ����
	int empNo; // ��� ��ȣ
	String empName; // ��� �̸�
	String phone;
	int age;
	String dept; // �μ�
	String compRank; // ����

	Employee(int empNo, String empName, String phone, int age, String dept, String compRank) {
		this.empNo = empNo;
		this.empName = empName;
		this.phone = phone;
		this.age = age;
		this.dept = dept;
		this.compRank = compRank;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCompRank() {
		return compRank;
	}

	public void setCompRank(String compRank) {
		this.compRank = compRank;
	}

}

public class Employee_info {
	private static TreeSet<Employee> tset = new TreeSet<Employee>(new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			if (o1.getEmpNo() < o2.getEmpNo()) {
				return 1;
			} else if (o1.getEmpNo() == o2.getEmpNo()) {
				return 0;
			} else {
				return -1;
			}
		};
	});

	private static Scanner sc = new Scanner(System.in);

	public static void menuInput1() {

		System.out.println("��� : ");
		int empNo = sc.nextInt();
		System.out.println("�̸� : ");
		String empName = sc.next();
		System.out.println("����ó : ");
		String phone = sc.next();
		System.out.println("���� : ");
		int age = sc.nextInt();
		System.out.println("�μ� : ");
		String dept = sc.next();
		System.out.println("���� : ");
		String compRank = sc.next();

		Employee employ = new Employee(empNo, empName, phone, age, dept, compRank);
		tset.add(employ);
	}

	public static void menuInput2() {

		Iterator<Employee> ir = tset.iterator();
		while (ir.hasNext()) {
			Employee employ = ir.next();
			if (employ != null) {
				System.out.print("��� ");
				System.out.print(employ.getEmpNo());
				System.out.print("\t");
				System.out.print("�̸� ");
				System.out.print(employ.getEmpName());
				System.out.print("\t");
				System.out.print("��ȭ��ȣ ");
				System.out.print(employ.getPhone());
				System.out.print("\t");
				System.out.print("���� ");
				System.out.print(employ.getAge());
				System.out.print("\t");
				System.out.print("�μ� ");
				System.out.print(employ.getDept());
				System.out.print("\t");
				System.out.print("���� ");
				System.out.print(employ.getCompRank());
				System.out.println();
			}
		}
	}

	public static void menuInput3() {
		System.out.println("������ ����� �Է�");
		int EmpNo = sc.nextInt();
		
		System.out.println("������ �ʵ� ����[1. ����ó, 2.����, 3. �μ�, 4.����] : ");
		int num = sc.nextInt();
		Iterator<Employee> ir = tset.iterator();
		Employee employ = ir.next();
		if(num == 1) {
			System.out.print("������ ��ȣ :" + employ.getPhone() + " ===> ");
			String phone = sc.next();
			employ.setPhone(phone);
		}else if(num == 2) {
			System.out.print("������ ���� :" + employ.getAge() + " ===> ");
			int age = sc.nextInt();
			employ.setAge(age);
		}else if(num == 3) {
			System.out.print("������ �μ� :" + employ.getDept() + " ===> ");
			String dept = sc.next();
			employ.setDept(dept);
		}else if(num == 4) {
			System.out.print("������ ���� :" + employ.getCompRank() + " ===> ");
			String comprank = sc.next();
			employ.setCompRank(comprank);
		}
		
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean run = true;
		while (run) {
			System.out.println("=======������� ���α׷�============\r\n"
					+ "# 1. ������� �űԵ��\r\n"
					+ "# 2. ������� �˻�\r\n"
					+ "# 3. ������� ����\r\n"
					+ "# 4. ������� ����\r\n"
					+ "# 5. ���α׷� ����\r\n"
					+ "===============================");
			int num = sc.nextInt();
			if (num == 1) {
				menuInput1();
			} else if (num == 2) {
				menuInput2();
			} else if (num == 3) {
				menuInput3();
			} else if (num == 4) {

			} else if (num == 5) {

			}
		}

	}

}
