package com.fyu.dto;

public class EmployeeBusiness {

	public static void newEmployee(String name, int age, String gender, String ssn, String nationality, String address,
			String social_status, String mail, String phone, double salary, int workingYears, String departmentName) {
		Employee employee = new Employee(name, age, gender, ssn, nationality, address, social_status, mail, phone, salary, workingYears, departmentName);
		DTO.saveEmployee(employee);
	}
	
	public static void removeEmployee(long employeeId) {
		DTO.deleteEmployee(employeeId);
	}
	
	public static void raiseEmployeeSalary(long employeeId) {
		Employee employee = DTO.findEmployee(employeeId);
		employee.raiseSalary();
	}
	
	public static Employee getEmployeeInfo(long employeeId) {
		return DTO.findEmployee(employeeId);
	}
	
	public static Account getAccountInfo(long accountId) {
		return DTO.findAccount(accountId);
	}
	
	public static Customer getCustomerInfo(long customerId) {
		return DTO.findCustomer(customerId);
	}

}
