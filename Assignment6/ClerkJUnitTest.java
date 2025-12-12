import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClerkJUnitTest {

	@Test
	public void testConstructorAndInheritedGetters() {
		// Create an instance of Acrobatic
		Clerk clerk = new Clerk("John Brown", 35, 10,
				"Office Manager");

		// Test inherited fields and getters
		assertEquals("John Brown", clerk.getName());
		assertEquals(35, clerk.getAge());
		assertEquals(10, clerk.getYearsWorked());
		assertEquals("Office Manager", clerk.getJob());
	}

	@Test
	public void testToString() {
		Clerk clerk = new Clerk("John Brown", 35, 10,
				"Office Manager");

		String expected = "Name: John Brown\nAge: 35\nYears Worked: 10\nJob: Office Manager";
		assertEquals(expected, clerk.toString());
	}

}
