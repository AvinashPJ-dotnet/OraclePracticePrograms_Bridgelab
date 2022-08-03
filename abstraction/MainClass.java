package abstraction;

public class MainClass {

	public static void main(String[] args) {
		Person doctor1=new Doctor();
		doctor1.details();
		doctor1.walk();
		
		Person patient1=new Patient();
		patient1.details();
		patient1.walk();
	}
}
