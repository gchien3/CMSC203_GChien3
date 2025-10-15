/*
 * Class: CMSC203 CRN 22172
 * Instructor: Farnaz Eivazi
 * Description: Testing encrypting and decrypting Vigenere, Caesar, and Playfair Cipher
 * Due: 10/14/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Grant Chien
*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {

	private String plainText;
	private String key;
	private int caesar;
	@BeforeEach
	void setUp() throws Exception {
		plainText = "WHAT IS UP!123";
		key = "THINGY";
		caesar = 3;
	}

	@AfterEach
	void tearDown() throws Exception {
		plainText = null;
		key = null;
		caesar = 0;
	}

	@Test
	void testIsStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("WHAT IS UP!123"));
		assertFalse(CryptoManager.isStringInBounds("What Is Up!123"));
		assertFalse(CryptoManager.isStringInBounds("what is up!123"));
	}

	@Test
	void testVigenereEncryption() {
		String encrypted = CryptoManager.vigenereEncryption(plainText, key);
		assertNotEquals(plainText ,encrypted);
	}

	@Test
	void testVigenereDecryption() {
		String encrypted = CryptoManager.vigenereEncryption(plainText, key);
		String decrypted = CryptoManager.vigenereDecryption(encrypted, key);
		assertEquals(plainText, decrypted);
	}

	@Test
	void testPlayfairEncryption() {
		String encrypted = CryptoManager.playfairEncryption(plainText, key);
		assertNotEquals(plainText, encrypted);
	}

	@Test
	void testPlayfairDecryption() {
		String encrypted = CryptoManager.playfairEncryption(plainText, key);
		String decrypted = CryptoManager.playfairDecryption(encrypted, key);
		assertEquals(plainText, decrypted);
	}

	@Test
	void testCaesarEncryption() {
		String encrypted = CryptoManager.caesarEncryption(plainText, caesar);
		assertNotEquals(plainText, encrypted);
	}

	@Test
	void testCaesarDecryption() {
		String encrypted = CryptoManager.caesarEncryption(plainText, caesar);
		String decrypted = CryptoManager.caesarDecryption(encrypted, caesar);
		assertEquals(plainText, decrypted);
	}

}
