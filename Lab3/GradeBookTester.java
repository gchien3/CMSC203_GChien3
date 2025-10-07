import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

	private GradeBook book1;
	private GradeBook book2;
	
	@BeforeEach
	void setUp() throws Exception {
		book1 = new GradeBook(5);
		book2 = new GradeBook(5);
		
		book1.addScore(10.0);
		book1.addScore(12.0);
		book1.addScore(4.0);
		
		book2.addScore(1.0);
		book2.addScore(21.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		book1 = null;
		book2 = null;
	}

	@Test
	void testAddScore() {
		String testString1 = "10.0 12.0 4.0 ";
		String testString2 = "1.0 21.0 ";
		assertTrue(testString1.equals(book1.toString()));
		assertEquals(3, book1.getScoresSize());
		assertTrue(testString2.equals(book2.toString()));
		assertEquals(2, book2.getScoresSize());
	}

	@Test
	void testSum() {
		assertEquals(26.0, book1.sum(), .001);
		assertEquals(22.0, book2.sum(), .001);
	}

	@Test
	void testMinimum() {
		assertEquals(4.0, book1.minimum(), .001);
		assertEquals(1.0, book2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(22.0, book1.finalScore(), .001);
		assertEquals(21.0, book2.finalScore(), .001);
	}

	@Test
	void testGetScoresSize() {
		assertEquals(3, book1.getScoresSize());
		assertEquals(2, book2.getScoresSize());
		
	}

	@Test
	void testToString() {
		assertTrue(book1.toString().equals("10.0 12.0 4.0 "));
		assertTrue(book2.toString().equals("1.0 21.0 "));
	}

}
