package exception;

public class NestedException {

	public static void main(String args[]) {
		// outer try block
		try {
			try {
				System.out.println("going to divide by 0");
				int b = 39 / 0;
			}
			catch (ArithmeticException e) {
				System.out.println(e);
			}
			
			try {
				
			} finally {
				// TODO: handle finally clause
			}

			try {
				int a[] = new int[10];

				a[11] = 4;
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

			System.out.println("other statement");
		}
		catch (Exception e) {
			System.out.println("handled the exception");
		}

		System.out.println("normal flow..");
	}

}
