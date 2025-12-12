import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketingOfficeJUnitTest {

	private TicketingOffice office;

	@BeforeEach
	void setUp() {
		office = new TicketingOffice("Black", 140.0, 75.0);
	}

	@Test
	void testConstructorAndInitialValues() {
		assertEquals("Black", office.getColor());
		assertEquals(140.0, office.getLength(), 0.001);
		assertEquals(75.0, office.getWidth(), 0.001);
		assertEquals("Ticketing Office", office.getBuildingType());
	}

	@Test
	void testSetSize() {
		office.setSize(50.0, 25.0);
		assertEquals(50.0, office.getLength(), 0.001);
		assertEquals(25.0, office.getWidth(), 0.001);
	}

	@Test
	void testSetColor() {
		office.setColor("Purple");
		assertEquals("Purple", office.getColor());
	}

	@Test
	void testSetBuildingType() {
		office.setBuildingType("Postal Office");
		assertEquals("Postal Office", office.getBuildingType());
	}

	@Test
	void testToString() {
		String output = "TicketingOffice [color=Black, length=140.0, width=75.0, buildingType=Postal Office]";
		office.setBuildingType("Postal Office");
		assertEquals(output, office.toString());
	}

}
