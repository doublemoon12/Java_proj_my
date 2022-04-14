package Employeeinfo.ex1;


import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;


//이다은 : 1:06분 완료. 

class Employee implements Comparable<Employee> { // 사원정보를 담은 클래스
	private int empNo;
	private String empName;
	private String phone;
	private int age;
	private String department;
	private String compRank;

	public Employee(int empNo, String empName, String phone, int age, String department, String compRank) {
		this.empNo = empNo;
		this.empName = empName;
		this.phone = phone;
		this.age = age;
		this.department = department;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCompRank() {
		return compRank;
	}

	public void setCompRank(String compRank) {
		this.compRank = compRank;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			if (empNo == ((Employee) obj).empNo) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.empNo < o.empNo)
			return -1;
		else if (this.empNo == o.empNo)
			return 0;
		else
			return 1;
	}
}





public class Employee_info_1 {
	private static TreeSet<Employee> emp = new TreeSet<>();
	private static Scanner scan = new Scanner(System.in);

	private static void createEmpInfo() {
		System.out.print("- 사번 : ");
		int empNo = scan.nextInt();
		System.out.print("- 이름 : ");
		String empName = scan.next();
		System.out.print("- 연락처 : ");
		String phone = scan.next();
		System.out.print("- 나이 : ");
		int age = scan.nextInt();
		System.out.print("- 부서 : ");
		String department = scan.next();
		System.out.print("- 직급 : ");
		String compRank = scan.next();
		emp.add(new Employee(empNo, empName, phone, age, department, compRank));
		System.out.println(empName + "님의 정보가 정상적으로 입력 되었습니다.");
	}

	private static Employee searchEmpInfo(int empNo) {
		Iterator<Employee> iter = emp.iterator();
		while (iter.hasNext()) {
			Employee employee = iter.next();
			if(empNo == employee.getEmpNo()) {
				return employee;
			}
		}
		return null;
	}
	
	private static void showEmpInfo() {
		Iterator<Employee> iter = emp.iterator();
		System.out.println("사번\t이름\t연락처\t나이\t부서\t직급");
		while (iter.hasNext()) {
			Employee employee = iter.next();
			System.out.print(employee.getEmpNo());
			System.out.print("\t");
			System.out.print(employee.getEmpName());
			System.out.print("\t");
			System.out.print(employee.getPhone());
			System.out.print("\t");
			System.out.print(employee.getAge());
			System.out.print("\t");
			System.out.print(employee.getDepartment());
			System.out.print("\t");
			System.out.println(employee.getCompRank());
		}
	}
	
	private static void modEmpInfo() {
		System.out.print("수정할 사번 : ");
		int empNo = scan.nextInt();
		
		Employee employee = searchEmpInfo(empNo);
		
		System.out.print("수정할 필드 선택 [1. 연락처, 2.나이, 3. 부서, 4.직급] : ");
		int sel = scan.nextInt();
		switch(sel){
		case 1:
			System.out.print("수정할 연락처 입력 : ");
			String phone = scan.next();
			employee.setPhone(phone);
			break;
		case 2:
			System.out.print("수정할 나이 입력 : ");
			int age = scan.nextInt();
			employee.setAge(age);
			break;
		case 3:
			System.out.print("수정할 부서 입력 : ");
			String department = scan.next();
			employee.setDepartment(department);
			break;
		case 4:
			System.out.print("수정할 직급 입력 : ");
			String compRank = scan.next();
			employee.setCompRank(compRank);
			break;
		}
	}
	
	private static void delEmpInfo() {
		System.out.print("삭제할 사번 : ");
		int empNo = scan.nextInt();
		
		Employee employee = searchEmpInfo(empNo);
		
		emp.remove(employee);
	}

	public static void main(String[] args) {

		boolean run = true;

		while (run) {
			System.out.println("=======사원관리 프로그램============");
			System.out.println("# 1. 사원정보 신규등록");
			System.out.println("# 2. 사원정보 검색");
			System.out.println("# 3. 사원정보 수정");
			System.out.println("# 4. 사원정보 삭제");
			System.out.println("# 5. 프로그램 종료");
			System.out.println("===============================");
			System.out.print("메뉴 입력 : ");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				createEmpInfo();
				System.out.println();
				break;
			case 2:
				showEmpInfo();
				System.out.println();
				break;
			case 3:
				modEmpInfo();
				System.out.println();
				break;
			case 4:
				delEmpInfo();
				System.out.println();
				break;
			case 5:
				run = false;
				break;
			}
		}
		System.out.println("프로그램이 종료 되었습니다.");

	}

}
