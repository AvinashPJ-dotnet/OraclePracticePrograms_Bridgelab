package inheritance.abstractClass;

abstract class Shape {
abstract void show();

public void getInfo() {
	System.out.println("class name="+getClass().getName());
}
}
