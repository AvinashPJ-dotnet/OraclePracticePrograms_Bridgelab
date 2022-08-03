package pollymorphism;

public class Doctor extends Person {

	//run time polymorphism
	@Override
	public void drives() {
		System.out.println("Doctor can drive with 1 wheel");
	}
	
	@Override
	public void drives(int wheels) {
		System.out.println("Doctor drive vehical with "+ wheels+" wheel");
	}
	
	public static void main(String[] args) {
		Person doctor=new Doctor();
		doctor.drives();
		doctor.drives(2);
		
		Person person=new Person();
		person.drives();
		person.drives(2);
		
		
	}
}
