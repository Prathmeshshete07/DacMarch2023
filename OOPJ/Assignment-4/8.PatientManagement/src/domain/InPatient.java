package domain;

public class InPatient extends Patient {

	private int numberOfDays; 
	private double roomCharges; 
	private double medicineCharges;
	private double treatCharges;
	
	

	public InPatient(String name, int id, int age, int numberOfDays, double roomCharges, double medicineCharges,
			double treatCharges) {
		super(name, id, age);
		this.numberOfDays = numberOfDays;
		this.roomCharges = roomCharges;
		this.medicineCharges = medicineCharges;
		this.treatCharges = treatCharges;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public double getRoomCharges() {
		return roomCharges;
	}

	public void setRoomCharges(double roomCharges) {
		this.roomCharges = roomCharges;
	}

	public double getMedicineCharges() {
		return medicineCharges;
	}

	public void setMedicineCharges(double medicineCharges) {
		this.medicineCharges = medicineCharges;
	}
	
	public double getTreatCharges() {
		return treatCharges;
	}

	public void setTreatCharges(double treatCharges) {
		this.treatCharges = treatCharges;
	}

	@Override
	public double calculateBill() {
	   return super.calculateBill();
	}

	@Override
	public String toString() {
		return "InPatient [numberOfDays=" + numberOfDays + ", roomCharges=" + roomCharges + ", medicineCharges="
				+ medicineCharges + ", treatCharges=" + treatCharges + "]";
	}

}
	
	
	
	
