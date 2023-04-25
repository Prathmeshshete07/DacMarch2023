package domain;

public class Patient {

	private String name; 
	private	int id; 
	private int age;
	private double treatCharges;
	
	
	public Patient(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public double getTreatCharges() {
		return treatCharges;
	}

	public void setTreatCharges(double treatCharges) {
		this.treatCharges = treatCharges;
	}

	public double calculateBill(){
		return getTreatCharges() ;
			
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", id=" + id + ", age=" + age + ", charges=" + treatCharges + "]";
	}
	
}
