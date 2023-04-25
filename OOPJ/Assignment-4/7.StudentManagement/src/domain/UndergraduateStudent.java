package domain;

public class UndergraduateStudent extends Student {

	private int creditHours;
	private double tuitionFee;
	
	
	

    public UndergraduateStudent(String name, int id, String major, double gpa, double tuitionFee, int creditHours) {
		super(name, id, major, gpa);
		this.creditHours = creditHours;
		this.tuitionFee = tuitionFee;

	}


	public int getCreditHours() {
		return creditHours;
	}


	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}


	public double getTuitionFee() {
		return tuitionFee;
	}


	public void setTuitionFee(double tuitionFee) {
		this.tuitionFee = tuitionFee;
	}


	@Override
	public double calculateTuition() {
		return super.calculateTuition();
	}


	@Override
	public String toString() {
		return "UndergraduateStudent [creditHours=" + creditHours + ", tuitionFee=" + tuitionFee + "]";
	}
	
	
	
	
	
	
}
