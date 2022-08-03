package inheritance;

public class Child extends Parent {

	private String name;
	//here we are initializing both parent and child properties
	public Child(String familyName,String name) {
		super(familyName);//using parent class constructor to initialize Parent class using supercall
		this.name=name;
	}
	
	public static void main(String[] args) {
		Child obChild =new Child("PJ","avinash");
		System.out.println(obChild.name);
		System.out.println(obChild.familyName);//this is parent class property with protected specifier
		
	}

}
