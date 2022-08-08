package exception;

public class CustomeExceptionMain {
	public static void main(String[] args) throws CustomeException {
		String str="";
		if(str.isBlank()) {
			throw new CustomeException("String Should not be Blank");
			}
		else if(!str.contains("J")) {
			throw new CustomeException("String Should contins J");
			}
		else {
			System.out.println("no exception called");
			};
		}
	
	

}
