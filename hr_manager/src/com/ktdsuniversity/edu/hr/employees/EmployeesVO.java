package com.ktdsuniversity.edu.hr.employees;

/**
 * HR 데이터베이스에 있는 EMPLOYEES 테이블에 대응하는 데이터 클래스
 * EMPLOYEES 테이블의 컬럼구조와 데이터 클래스의 멤버변수 구조가 동일해야한다.
 */
public class EmployeesVO {
	// DBeaver 에서 Copy & Paste
	// Ctrl+Shift+Y -> 소문자로
	// Ctrl+Shift+X -> 대문자로

	// 멤버변수 camelCase
	// private Type name;
	// 대체적으로 int String double을 VO(Value Object),DTO(Data Transfer Object 주로사용

	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String hireDate;
	private String jobId;
	private int salary;
	private double commissionPct;
	private int managerId;
	private int departmentId;

	// Alt+Shift+S -> r -> Alt+A -> Alt+R
	// Getter/Setter 자동으로 빠르게
	// Ctrl+Shift+F -> 알아서 포멧 맞추기
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getCommissionPct() {
		return commissionPct;
	}

	public void setCommissionPct(double commissionPct) {
		this.commissionPct = commissionPct;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

}
