/*
 * Class: CMSC203 CRN 22172
 * Instructor: Farnaz Eivazi
 * Description: Create property with its name, city, owner, and rent amount
 * Due: 10/27/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Grant Chien
*/
public class Property extends Object {
	// Fields
	private String propertyName, city, owner;
	private double rentAmount;
	private Plot plot;
	
	// Default no-arg constructor
	public Property() {
		propertyName = "";
		city = "";
		owner = "";
		rentAmount = 0.0;
		plot = new Plot();
	}
	
	// Parameterized constructors
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentAmount = rentAmount;
		this.plot = new Plot();
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentAmount = rentAmount;
		this.plot = new Plot(x, y, width, depth);
	}
	
	// Copy constructor
	public Property(Property otherProperty) {
		this.propertyName = otherProperty.propertyName;
		this.city = otherProperty.city;
		this.owner = otherProperty.owner;
		this.rentAmount = otherProperty.rentAmount;
		this.plot = otherProperty.plot;
	}
	
	// Setters/Getters
	public String getPropertyName() {
		return propertyName;
	}

	public String getCity() {
		return city;
	}

	public String getOwner() {
		return owner;
	}

	public double getRentAmount() {
		return rentAmount;
	}

	public Plot getPlot() {
		return plot;
	}

	// To string method
	@Override
	public String toString() {
		return propertyName + "," + city + "," + owner + "," + rentAmount;
	}
	
}
