package bai4;

public class EmployeeUtils {
	private final int INSURANCE_PREMIUM = 1000;

	// Introduced foreign method
	public double calculateSalary(Employee employee) {
		return employee.calculateSalary() - INSURANCE_PREMIUM;
	}
}
