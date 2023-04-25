package domain;

public class FullTimeEmployee extends Employee {

   private double bonus;
	
	public FullTimeEmployee(String name, int id, double salary) {
		super(name, id, salary);
		this.bonus = 0;
	}
	
	

	public double getBonus() {
		return bonus;
	}

    public void setBonus(double bonus) {
		this.bonus = bonus;
	}



	@Override
	public String toString() {
		return "FullTimeEmployee [bonus=" + bonus + "]";
	}

   @Override
	public double calculatePay() {
		
		return super.calculatePay();
	}
	
	
}
