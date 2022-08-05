package pollymorphism;

public class MyMath {
	public int add(int numOne, int numTwo) {
		return numOne+numTwo;
	}

	public int add(int numOne, int numTwo, int numThree) {
		return numOne+numTwo+numThree;
	}

	public int add(int numOne, int numTwo, int numThree, int numFour) {
		return numOne+numTwo+numThree+numFour;
	}
	
	public static void main(String[] args) {
		MyMath math=new MyMath();
		System.out.println(math.add(10, 20));
		System.out.println(math.add(10, 20,56));
		System.out.println(math.add(10, 20,45,22));
	}
}
