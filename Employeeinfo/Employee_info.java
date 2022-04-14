package Employeeinfo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


class Employee { // 사원의 정보를 담은 클래스
	int empNo; // 사원 번호
	String empName; // 사원 이름
	String phone;
	int age;
	String dept; // 부서
	String compRank; // 직급

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

		System.out.println("사번 : ");
		int empNo = sc.nextInt();
		System.out.println("이름 : ");
		String empName = sc.next();
		System.out.println("연락처 : ");
		String phone = sc.next();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		System.out.println("부서 : ");
		String dept = sc.next();
		System.out.println("직급 : ");
		String compRank = sc.next();

		Employee employ = new Employee(empNo, empName, phone, age, dept, compRank);
		tset.add(employ);
	}

	public static void menuInput2() {

		Iterator<Employee> ir = tset.iterator();
		while (ir.hasNext()) {
			Employee employ = ir.next();
			if (employ != null) {
				System.out.print("사번 ");
				System.out.print(employ.getEmpNo());
				System.out.print("\t");
				System.out.print("이름 ");
				System.out.print(employ.getEmpName());
				System.out.print("\t");
				System.out.print("전화번호 ");
				System.out.print(employ.getPhone());
				System.out.print("\t");
				System.out.print("나이 ");
				System.out.print(employ.getAge());
				System.out.print("\t");
				System.out.print("부서 ");
				System.out.print(employ.getDept());
				System.out.print("\t");
				System.out.print("직급 ");
				System.out.print(employ.getCompRank());
				System.out.println();
			}
		}
	}

	public static void menuInput3() {
		System.out.println("수정할 사번을 입력");
		int EmpNo = sc.nextInt();
		
		System.out.println("수정할 필드 선택[1. 연락처, 2.나이, 3. 부서, 4.직급] : ");
		int num = sc.nextInt();
		Iterator<Employee> ir = tset.iterator();
		Employee employ = ir.next();
		if(num == 1) {
			System.out.print("변경할 번호 :" + employ.getPhone() + " ===> ");
			String phone = sc.next();
			employ.setPhone(phone);
		}else if(num == 2) {
			System.out.print("변경할 나이 :" + employ.getAge() + " ===> ");
			int age = sc.nextInt();
			employ.setAge(age);
		}else if(num == 3) {
			System.out.print("변경할 부서 :" + employ.getDept() + " ===> ");
			String dept = sc.next();
			employ.setDept(dept);
		}else if(num == 4) {
			System.out.print("변경할 직급 :" + employ.getCompRank() + " ===> ");
			String comprank = sc.next();
			employ.setCompRank(comprank);
		}
		
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean run = true;
		while (run) {
			System.out.println("=======사원관리 프로그램============\r\n"
					+ "# 1. 사원정보 신규등록\r\n"
					+ "# 2. 사원정보 검색\r\n"
					+ "# 3. 사원정보 수정\r\n"
					+ "# 4. 사원정보 삭제\r\n"
					+ "# 5. 프로그램 종료\r\n"
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
