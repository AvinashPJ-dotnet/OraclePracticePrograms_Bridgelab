package inheritance.abstractClass;

public class Main {
	public static void main(String[] args) {
		Shape circleShape = new Circle();

		circleShape.show();
		circleShape.getInfo();

		Shape rectangleShape = new Rectangle();

		rectangleShape.show();
		rectangleShape.getInfo();
	}

}
