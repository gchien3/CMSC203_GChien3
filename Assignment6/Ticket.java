public class Ticket {
	private double basePrice;
	private String dayOfWeek;
	private int age;

	public Ticket(String dayOfWeek, double basePrice, int age) {
		this.basePrice = basePrice;
		this.age = age;
		this.dayOfWeek = dayOfWeek.toLowerCase();
	}
	// Calculate ticket price based on day of week and age
	// Apply discounts for weekdays
	// Apply age-based discounts

	public double calculatePrice() {
		double price = basePrice;
		DayOfWeek day = DayOfWeek.valueOf(dayOfWeek);
		double discount = day.getDiscount();
		price *= (1.0 - discount);
		return price;
	}
	

	// Display the ticket details
	public void displayTicketDetails() {
		System.out.printf(
				"Ticket Details: [Age: %d, Day: %s, Price: $%.2f]%n",
				age, dayOfWeek.substring(0, 1).toUpperCase()
						+ dayOfWeek.substring(1),
				calculatePrice());
	}

	@Override
	public String toString() {
		return String.format(
				"Ticket [Day: %s, Age: %d, Price: $%.2f]",
				dayOfWeek.substring(0, 1).toUpperCase()
						+ dayOfWeek.substring(1),
				age, calculatePrice());
	}
}