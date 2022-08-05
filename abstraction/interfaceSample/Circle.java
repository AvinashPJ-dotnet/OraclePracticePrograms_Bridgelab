package abstraction.interfaceSample;

public class Circle implements Drawable,Measurable {

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("implements get area from measurable");
		
	}

	@Override
	public void getPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("implements getPerimeter from measurable");
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("implements draw from Drawable");
		
	}

}
