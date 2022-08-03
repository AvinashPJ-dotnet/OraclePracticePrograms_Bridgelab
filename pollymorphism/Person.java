package pollymorphism;

public class Person {

	//compile time polymorphism
	public void drives() {
		System.out.println("Person drive vehical with 1 wheel");
	}
	
	public void drives(int wheels) {
		System.out.println("Person drive vehical with "+ wheels+" wheel");
	}
	
	public void drives(int wheels,String model) {
		System.out.println("Person drive vehical with "+ wheels+" wheel with model "+model);
	}
}
