package exception;

public class SimpleException {
	public static void main(String args[]) {
		try {
			int data = 10 / 0;
			//we are catching Arithmetic exception
//			String s=null;  
//			System.out.println(s.length());//NullPointerException 
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
//		catch (ArithmeticException e) {
//			System.out.println(e);
//		}catch (NullPointerException e) {
//			System.out.println(e);
//		}
		System.out.println("rest of the code...");
	}
}
