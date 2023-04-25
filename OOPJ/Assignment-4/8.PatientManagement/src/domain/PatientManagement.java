package domain;

public class PatientManagement {
	
	

	public PatientManagement() {
		payBill();
		printRecord();
		printTotalCharge();
	}

	Patient []arr = new Patient[] {
			new InPatient("Raju",121,38,4,1500.00,300,500),
			new OutPatient("Dholu",99,24,600.00,300,500),
			new InPatient("Kalia",17,64,8,1200.00,200,500),
			new OutPatient("Bholu",7,72,700.00,450,500)};
		
	
	public void payBill() {
		for(int i =0;i<arr.length;i++) {
			double charges = 0;
			if(arr[i] instanceof InPatient) {
				InPatient patient = (InPatient) arr[i];
				double roomcharge = (patient.getRoomCharges()* patient.getNumberOfDays())+ (patient.getNumberOfDays()* 100) ;
				double discount = (patient.getAge() > 60 ? patient.getMedicineCharges() *10/100 : 0);
				patient.setTreatCharges(roomcharge-discount+patient.getTreatCharges());
				
			}
			if(arr[i] instanceof OutPatient) {
				OutPatient patient = (OutPatient) arr[i];
				double discount = (patient.getAge() > 60 ? patient.getTestCharges() * 5/100 : 0);
				System.out.println(discount);
				patient.setTestCharges(patient.getDoctorFees()+patient.getTreatCharges()+patient.getTestCharges() - discount);
				System.out.println(patient.getTestCharges());
				
			}
		}
	}
	
	
	
	public void printTotalCharge() {

		double total = 0;
		for (Patient patient : arr) {
			total += patient.calculateBill();
		}
		System.out.println("--------------------------------------");
		System.out.println();
		System.out.println("Total bill of the Hospital  " + total);
		System.out.println();
		System.out.println("--------------------------------------");
	}
	
	public void printRecord() {
		System.out.println("--------------------------------------");
		System.out.println();
		System.out.println("Patient Charge record (Patient wise)");
		System.out.println();
		System.out.println("--------------------------------------");

		System.out.println(String.format("%-10s%-5s%-5s%-10s%-35s","Name","Age","Id", "Bill", "Patient-Status"));

		for (Patient patient : arr) {

			System.out.println("");
			System.out.println(String.format("%-10s%-5d%-5d%-10.2f%-35s", patient.getName(),patient.getAge(),patient.getId(),patient.getTreatCharges(),
					(patient instanceof InPatient ? "In Patient" : "Out Patient")));
		}
	}
	}

