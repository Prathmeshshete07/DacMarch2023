package domain;

public class GraduateStudent extends Student {

	private double tuitionFee;
	private int creditHours;

	public GraduateStudent(String name, int id, String major, double gpa, double tuitionFee,
			int creditHours) {
		super(name, id, major, gpa);
		this.tuitionFee = tuitionFee;
		this.creditHours = creditHours;
	}



	public double getTuitionFee() {
		return tuitionFee;
	}



	public void setTuitionFee(double tuitionFee) {
		this.tuitionFee = tuitionFee;
	}



	public int getCreditHours() {
		return creditHours;
	}



	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}



	@Override
	public double calculateTuition() {
		// TODO Auto-generated method stub
		return super.calculateTuition();
	}

	@Override
	public String toString() {
		return "GraduateStudent [researchFee=" + tuitionFee + "]";
	}
	
	
	
}
