import java.util.InputMismatchException;

public class CustomInputMismatchException extends Exception {

	public CustomInputMismatchException() {
		super("Invalid input. Please enter a valid number.");
	}

	public CustomInputMismatchException(String message) {
		super(message);
	}
}