/*
 * Class: CMSC203 CRN 22172
 * Instructor: Farnaz Eivazi
 * Description: Create a managment company with max of 5 properties
 * Due: 10/27/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Grant Chien
*/

import java.util.Arrays;

public class ManagementCompany extends Object{
	// Constants
	public static final int MAX_PROPERTY = 5;
	private static final int MGMT_DEPTH = 10;
	private static final int MGMT_WIDTH = 10;
	
	// Fields
	private String name, taxID;
	private double mgmFeePer;
	private Plot plot;
	private Property[] properties;
	private int numberOfProperties;
	
	// Default no-arg constructor
	public ManagementCompany() {
		this.name = "";
		this.taxID = "";
		this.mgmFeePer = 0.0;
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
		this.numberOfProperties = 0;
	}
	
	// Parameterized constructors
	public ManagementCompany(String name, String taxID, double mgmFee) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
		this.numberOfProperties = 0;
	}
	
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		this.plot = new Plot(x, y, width, depth);
		this.properties = new Property[MAX_PROPERTY];
		this.numberOfProperties = 0;
	}
	
	// Copy constructor
	public ManagementCompany(ManagementCompany otherCompany) {
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.mgmFeePer = otherCompany.mgmFeePer;
		this.plot = new Plot(otherCompany.plot.getX(), otherCompany.plot.getY(), otherCompany.plot.getWidth(), otherCompany.plot.getDepth());
		this.properties = new Property[MAX_PROPERTY];
		this.numberOfProperties = otherCompany.numberOfProperties;
		
		for(int i = 0; i < otherCompany.numberOfProperties; i++) {
			this.properties[i] = new Property(otherCompany.properties[i]);
		}
	}

	// Setters/Getters
	public double getMgmFeePer() {
		return mgmFeePer;
	}

	public String getName() {
		return name;
	}

	public String getTaxID() {
		return taxID;
	}

	public Plot getPlot() {
		return plot;
	}

	public Property[] getProperties() {
		return properties;
	}

	public int getPropertiesCount() {
		return numberOfProperties;
	}
	
	// Add properties
	public int addProperty(Property property) {
		if(isPropertiesFull()) {
			return -1;
		}
		if(property == null) {
			return -2;
		}
		if(plot.encompasses(property.getPlot())) {
			return -3;
		}
		
		for(int i = 0; i < numberOfProperties; i++) {
			if(properties[i] != null && properties[i].getPlot().overlaps(property.getPlot())) {
				return -4;
			}
		}
		
		properties[numberOfProperties] = new Property(property);
		numberOfProperties++;
		return numberOfProperties - 1;
	}
	
	public int addProperty(String name, String city, double rent, String owner) {
		return addProperty(new Property(name, city, rent, owner));
	}
	
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
		return addProperty(new Property(name, city, rent, owner, x, y, width, depth));
	}
	
	
	// Other methods
	public Property getHighestRentProperty() {
		int index = getHighestRentPropertyIndex();
		if(index == -1) {
			return null;
		}
		return properties[index];
	}
	
	private int getHighestRentPropertyIndex() {
		if (numberOfProperties == 0) {
			return -1;
		}
		
		int highestIndex = 0;
		for(int i = 1; i < numberOfProperties; i++) {
			if(properties[i] != null && properties[i].getRentAmount() > properties[highestIndex].getRentAmount()) {
				highestIndex = i;
			}
		}
		
		return highestIndex;
	}
	
	public double getTotalRent() {
		double total = 0;
		for(int i = 0; i < numberOfProperties; i++) {
			total += properties[i].getRentAmount();
		}
		return total;
	}

	public boolean isMangementFeeValid() {
		return (mgmFeePer >= 0 && mgmFeePer <= 100);
	}
	
	public boolean isPropertiesFull() {
		return numberOfProperties >= MAX_PROPERTY;
	}
	
	public void removeLastProperty() {
		if (numberOfProperties < 0) {
			properties[numberOfProperties - 1] = null;
			numberOfProperties--;
		}
	}
	
	// To string method
	@Override
	public String toString() {
		String output = "";
		
		output += "List of the properties for " + name + ", taxID: " + taxID;
		output += "\n______________________________________________________\n";
		
		for(int i = 0; i < numberOfProperties; i++) {
			if(properties[i] != null) {
				output += properties[i].toString() + "\n";
			}
		}
		
		output += "______________________________________________________\n\n";
		double totalFee = getTotalRent() * (mgmFeePer / 100.0);
		output += " total management Fee: " + String.format("%.2f", totalFee);
		return output;
		 
/*
		String output = "List of the properties for " + name + ", taxID: " + taxID + "\n"; 

		output += "______________________________________________________\n"; 

		for (int i = 0; i < numberOfProperties; i++) { 

		if (properties[i] != null) { 

		output += properties[i].toString() + "\n"; // used Property.toString() here 

		} 

		} 

		output += "______________________________________________________\n\n"; 

		double totalFee = getTotalRent() * (mgmFeePer / 100.0); 

		result += " total management Fee: " + String.format("%.2f", totalFee); 

		return result; */
	}
	
	
}
