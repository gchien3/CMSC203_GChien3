import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArenaJUnitTest {

	private Arena arena;

	@BeforeEach
	void setUp() {
		arena = new Arena("Blue", 100.0, 50.0);
	}

	@Test
	void testConstructorAndInitialValues() {
		assertEquals("Blue", arena.getColor());
		assertEquals(100.0, arena.getLength(), 0.001);
		assertEquals(50.0, arena.getWidth(), 0.001);
		assertEquals("Arena", arena.getBuildingType());
	}

	@Test
	void testSetSize() {
		arena.setSize(120.0, 60.0);
		assertEquals(120.0, arena.getLength(), 0.001);
		assertEquals(60.0, arena.getWidth(), 0.001);
	}

	@Test
	void testSetColor() {
		arena.setColor("Red");
		assertEquals("Red", arena.getColor());
	}

	@Test
	void testSetBuildingType() {
		arena.setBuildingType("Stadium");
		assertEquals("Stadium", arena.getBuildingType());
	}

	@Test
	void testToString() {
		String output = "Arena [color=Blue, length=100.0, width=50.0, buildingType=Stadium]";
		arena.setBuildingType("Stadium");
		assertEquals(output, arena.toString());
	}

}
