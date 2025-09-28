/*
 * Class: CMSC203 CRN: 22172
 * Instructor: Farnaz Eivazi
 * Description: Details about the procedure including procedure name, date, practitioner, and charges
 * Due: 9/29/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Grant Chien
*/
public class Procedure {
	//Fields
	private String procedure, date, name;
	private double charges;
	
	//Constructors
	public Procedure() {
		procedure = null;
		date = null;
		name = null;
		charges = 0.0;
	}
	
	public Procedure(String procedure, String date) {
		this.procedure = procedure;
		this.date = date;
	}
	
	public Procedure(String procedure, String date, String name, double charges) {
		this.procedure = procedure;
		this.date = date;
		this.name = name;
		this.charges = charges;
	}
	
	
	//Accessors/Getters
	public String getProcedure() {
		return procedure;
	}

	public String getDate() {
		return date;
	}

	public String getName() {
		return name;
	}

	public double getCharges() {
		return charges;
	}
	
	
	//Mutators/Setters
	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}
	
	
	//toString Method
	@Override
	public String toString() {
		return "\tProcedure: " + procedure + "\n\tProcedureDate=" + date + "\n\tPractitioner=" + name + "\n\tCharge=" + charges;
	}
}
