package domain;

public class OutPatient extends Patient {

	private double doctorFees; 
	private double testCharges;
	private double treatCharges;
	
	

	public OutPatient(String name, int id, int age, double doctorFees, double testCharges, double treatCharges) {
		super(name, id, age);
		this.doctorFees = doctorFees;
		this.testCharges = testCharges;
		this.treatCharges = treatCharges;
	}

	public double getDoctorFees() {
		return doctorFees;
	}

	public void setDoctorFees(double doctorFees) {
		this.doctorFees = doctorFees;
	}

	public double getTestCharges() {
		return testCharges;
	}

	public void setTestCharges(double testCharges) {
		this.testCharges = testCharges;
	}

	
	public double getTreatCharges() {
		return treatCharges;
	}

	public void setTreatCharges(double treatCharges) {
		this.treatCharges = treatCharges;
	}

	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		return super.calculateBill();
	}

	@Override
	public String toString() {
		return "OutPatient [doctorFees=" + doctorFees + ", testCharges=" + testCharges + "]";
	} 
	
	
	
}

