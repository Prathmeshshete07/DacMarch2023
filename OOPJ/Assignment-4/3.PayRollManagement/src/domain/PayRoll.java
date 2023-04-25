package domain;

public class PayRoll {

	public PayRoll() {
		adjustPay();
		printRecord();
		printPayRoll();
	}

	Employee[] emp = new Employee[] { new FullTimeEmployee("Ram", 1, 15000.00),
			new FullTimeEmployee("Sham", 2, 30000.00), new PartTimeEmployee("Seeta", 3, 40, 340),
			new FullTimeEmployee("Sonu", 4, 60000.50), new PartTimeEmployee("Santosh", 5, 20, 500),
			new FullTimeEmployee("Sandeep", 6, 5000.50), new PartTimeEmployee("Chomyaa", 7, 80, 680),
			new FullTimeEmployee("Chotu", 8, 54600.40), new PartTimeEmployee("Raju", 9, 40, 200),
			new FullTimeEmployee("Dholu", 10, 26000.00), new FullTimeEmployee("Bholu", 2, 15750.00), };

	public void adjustPay() {
		for (int i = 0; i < emp.length; i++) {
			double bonus = 0;
			if (emp[i] instanceof FullTimeEmployee) {
				FullTimeEmployee employee = (FullTimeEmployee) emp[i];
				employee.setBonus(emp[i].getSalary() * 10 / 100);

			}
			if (emp[i] instanceof PartTimeEmployee) {
				PartTimeEmployee employee = (PartTimeEmployee) emp[i];
				employee.setSalary(employee.getHourlyRate() * employee.getHoursWorked());
				employee.setBonus(employee.getHoursWorked() > 40 ? employee.getSalary() * 20 / 100 : 0);
			}
		}
	}

	public void printPayRoll() {

		double total = 0;
		for (Employee employee : emp) {
			total += employee.calculatePay();
		}
		System.out.println("--------------------------------------");
		System.out.println();
		System.out.println("Pay roll of the comapany  " + total);
		System.out.println();
		System.out.println("--------------------------------------");
	}

	public void printRecord() {
		System.out.println("--------------------------------------");
		System.out.println();
		System.out.println("Payroll record (Employee wise)");
		System.out.println();
		System.out.println("--------------------------------------");

		System.out.println(String.format("%-15s%-15s%-10s", "id", "Salary", "Job-Type"));

		for (Employee employee : emp) {

			System.out.println("");
			System.out.println(String.format("%-15s%-15.2f%-10s", employee.getId(), employee.getSalary(),
					(employee instanceof FullTimeEmployee ? "Full Time" : "Part Time")));
		}
	}

}
