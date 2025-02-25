package bai4;

public class EmployeeUtils {
	private static final int INSURANCE_PREMIUM = 1000;

	// Introduced foreign method
	public static double calculateNetSalary(Employee employee) {
		return employee.calculateSalary() - INSURANCE_PREMIUM;
	}
}
