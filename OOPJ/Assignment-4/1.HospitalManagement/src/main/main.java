package main;

import test.*;
public class main {

	public static void main(String[] args) {
		int choice;
		HospitalManagerTest test = new HospitalManagerTest();
		while( ( choice = HospitalManagerTest.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:
				test.addPatientRecord();
				break;
			case 2:
				test.addMedicalRecord();
				break;
			case 3:
				test.printPatientRecord();
				break;
			case 4:
				test.printMedicalRecords();
				break;
			}
		}
	}
}
