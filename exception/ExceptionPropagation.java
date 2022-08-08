package exception;

public class ExceptionPropagation {
	void m() {
		int data = 50 / 0;
	}

	//method n is calling method m
	void n() {
		m();
	}
	
	//method p is calling method n
	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		ExceptionPropagation obj = new ExceptionPropagation();
		obj.p();
		System.out.println("normal flow...");
	}
}
