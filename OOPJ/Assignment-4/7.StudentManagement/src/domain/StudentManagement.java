package domain;

public class StudentManagement {
	
	public StudentManagement() {
		adjustFee();
		printRecord();
		pintTotalFee();
		
	}

	Student[] std = new Student[] {

			new UndergraduateStudent("Prakash", 47, "Communication", 3.3, 8, 500),
			new GraduateStudent("Varun", 97, "Mathematics", 2.7, 1000, 9),
			new UndergraduateStudent("Sandeep", 69, "Arts", 2.3, 6, 500),
			new GraduateStudent("Sushant", 78, "Quantitative", 4, 1000, 4),
			new UndergraduateStudent("Atif", 3, "Reasoning", 4, 10, 500) };

	public void adjustFee() {
		for (int i = 0; i < std.length; i++) {
			double fee= 0;
			if (std[i] instanceof UndergraduateStudent) {
				UndergraduateStudent student = (UndergraduateStudent) std[i];
			    fee	= (student.getCreditHours() * student.getTuitionFee());
			    double discount = student.getGpa() >= 3.5 ? (fee * 20 / 100) : 0;
				student.setTuitionFee(fee - discount);
				
				
				
			}
			if (std[i] instanceof GraduateStudent) {
				GraduateStudent student = (GraduateStudent) std[i];
				fee =(student.getCreditHours() * student.getTuitionFee());
				double discount = fee > 5000 ? fee * 10 / 100 : 0;
				student.setTuitionFee(fee - discount);
			}
		}
	}
	
	public void pintTotalFee() {
		double total = 0;
		for (Student student : std) {
			total += student.calculateTuition();
		}
		System.out.println("=============================================");
		System.out.println();
		System.out.println("Total Tuition of the School : " + total);
		System.out.println();
		System.out.println("=============================================");
	}
	
	public void printRecord() {
		System.out.println("=============================================");
		System.out.println();
		System.out.println("Tution Fee (Student wise)");
		System.out.println();
		System.out.println("=============================================");

		System.out.println(String.format("%-15s%-5s%-10s%-10s","Name","id","TutionFee", "Student-Type"));

		for (Student student : std) {

			System.out.println("");
			System.out.println(String.format("%-15s%-5d%-10.2f%-15s", student.getName(), student.getId(),
					student.getTuitionFee(),
					(student instanceof UndergraduateStudent ? "Under Graduate" : "Graduate")));
		}
	}
		
	}



