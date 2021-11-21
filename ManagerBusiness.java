package com.fyu.dto;

public class ManagerBusiness {

	public static void newManager(String name, int age, String gender, String ssn, String nationality, String address,
			String social_status, String mail, String phone, double salary, int workingYears, String departmentName, int teamNumber) {
		Manager manager = new Manager(name, age, gender, ssn, nationality, address, social_status, mail, phone, salary, workingYears, departmentName, teamNumber);
		DTO.saveManager(manager);
	}
	
	public static void removeManager(long managerId) {
		DTO.deleteManager(managerId);
	}
	
	public static void raiseManagerSalary(long managerId) {
		Manager manager = DTO.findManager(managerId);
		manager.raiseSalary();
	}
	
	public static Manager getManagerInfo(long managerId) {
		return DTO.findManager(managerId);
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
