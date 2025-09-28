/*
 * Class: CMSC203 CRN: 22172
 * Instructor: Farnaz Eivazi
 * Description: Driver class where patient and procedure instances are created. There is also a display function for the patient's info, patient's procedures, and total charges
 * Due: 9/29/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Grant Chien
*/
import java.util.Scanner;
public class PatientDriverApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Patient patient = new Patient();
		Procedure procedure1 = new Procedure();
		Procedure procedure2 = new Procedure("Surgery", "11/23/2023");
		Procedure procedure3 = new Procedure("Check Up", "4/2/2024", "Dr. Joey", 162.23);

		//Setting patient info
		System.out.println("Enter patient's first name: ");
		patient.setFirstName(sc.nextLine());
		System.out.println("Enter patient's middle name: ");
		patient.setMiddleName(sc.nextLine());
		System.out.println("Enter patient's last name: ");
		patient.setLastName(sc.nextLine());
		System.out.println("Enter patient's address: ");
		patient.setAddress(sc.nextLine());
		System.out.println("Enter patient's city: ");
		patient.setCity(sc.nextLine());
		System.out.println("Enter patient's state: ");
		patient.setState(sc.nextLine());
		System.out.println("Enter patient's zip: ");
		patient.setZip(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter patient's phone number: ");
		patient.setPhone(sc.nextLine());
		System.out.println("Enter patient's emergency contact's name: ");
		patient.setEmergencyName(sc.nextLine());
		System.out.println("Enter patient's emergency contact's phone number: ");
		patient.setEmergencyNumber(sc.nextLine());
		
		//Setting first procedure info
		System.out.println("Enter name of first procedure: ");
		procedure1.setProcedure(sc.nextLine());
		System.out.println("Enter date of first procedure: ");
		procedure1.setDate(sc.nextLine());
		System.out.println("Enter name of first practitioner: ");
		procedure1.setName(sc.nextLine());
		System.out.println("Enter charges for first procedure: ");
		procedure1.setCharges(sc.nextDouble());
		sc.nextLine();
		
		//Setting second procedure info
		System.out.println("Enter name of second practitioner: ");
		procedure2.setName(sc.nextLine());
		System.out.println("Enter charges for second procedure: ");
		procedure2.setCharges(sc.nextDouble());
		sc.nextLine();
		
		//Displaying patient and procedure info
		System.out.println();
		displayPatient(patient);
		System.out.println();
		displayProcedure(procedure1);
		System.out.println();
		displayProcedure(procedure2);
		System.out.println();
		displayProcedure(procedure3);
		System.out.println("\nTotal Charges: $" + calculateTotalCharges(procedure1, procedure2, procedure3));
		
		//Signing off
		System.out.println("\nStudent Name: Grant Chien");
		System.out.println("MC#: M20990191");
		System.out.println("Due Date: 9/29/2025");
		
		sc.close();
	}
	
	public static void displayPatient(Patient patient) {
		System.out.println(patient);
	}
	
	public static void displayProcedure(Procedure procedure) {
		System.out.println(procedure);
	}
	
	public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
		return procedure1.getCharges() + procedure2.getCharges() + procedure3.getCharges();
	}
