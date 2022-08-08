package exception;

public class CustomeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

	public CustomeException(String message) {
		super(message);
	}

}
