/*
 * Class: CMSC203 CRN: 22172
 * Instructor: Farnaz Eivazi
 * Description: Stores all of patient's info from name to address to emergency contact. Also includes methods that build patients full name, full address, and emergency contact
 * Due: 9/29/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Grant Chien
*/
public class Patient {
	//Fields
	private String firstName, middleName, lastName;
	private String address, city, state, phone;
	private int zip;
	private String emergencyName, emergencyNumber;
	
	
	//Constructors
	public Patient(){
		firstName = null;
		middleName = null;
		lastName = null;
		address = null;
		city = null;
		state = null;
		zip = 0;
		phone = null;
		emergencyName = null;
		emergencyNumber = null;
	}
	
	public Patient(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	public Patient(String firstName, String middleName, String lastName, String address, String city, String state, int zip, String phone, String emergencyName, String emergencyNumber) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.emergencyName = emergencyName;
		this.emergencyNumber = emergencyNumber;
	}
	
	
	//Accessors/Getters
	public String getFirstName() {
		return firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public int getZip() {
		return zip;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmergencyName() {
		return emergencyName;
	}
	
	public String getEmergencyNumber() {
		return emergencyNumber;
	}
	
	
	//Mutators/Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmergencyName(String emergencyName) {
		this.emergencyName = emergencyName;
	}

	public void setEmergencyNumber(String emergencyNumber) {
		this.emergencyNumber = emergencyNumber;
	}
	
	
	//Creates the full name
	public String buildFullName(String firstName, String middleName, String lastName) {
		return "Name: " + firstName + " " + middleName + " " + lastName;
	}
	
	//Creates the address
	public String buildAddress(String address, String city, String state, int zip) {
		return "Address: " + address + " " + city + " " + state + " " + zip;
	}
	
	//Creates the emergency Contact
	public String buildEmergencyContact(String emergencyName, String emergencyNumber) {
		return "EmergencyContact: " + emergencyName + " " + emergencyNumber;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Patient info: \n  Name: " + buildFullName(firstName, middleName, lastName) + "\n  Address: " + buildAddress(address, city, state, zip) + "\n  EmergencyContact: " + buildEmergencyContact(emergencyName, emergencyNumber);
	}
}
