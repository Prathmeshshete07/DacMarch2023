package domain;

public class PartTimeEmployee extends Employee{

	private int hoursWorked;
	private double hourlyRate;
	private double bonus;
	
	public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
		super(name, id,0);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [hoursWorked=" + hoursWorked + ", hourlyRate=" + hourlyRate + "]";
	}

	@Override
	public double calculatePay() {
		
		return super.calculatePay();
	} 
	
	
	
}
