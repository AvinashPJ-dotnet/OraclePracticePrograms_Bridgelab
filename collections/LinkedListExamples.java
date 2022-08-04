package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {

	public static void main(String[] args) {
//		linkedListExample();
		linkedListWithListInterface();
	}

	public static void linkedListExample() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("avi");
		linkedList.add("sid");
		linkedList.add("dru");
		linkedList.add("avi");

		linkedList.addLast("bhi");
		linkedList.add(2, "dow");

		System.out.println(linkedList.toString());

		linkedList.removeFirst();

		linkedList.stream().filter(data -> !data.contains("avi")).map(data -> data + " hello")
				.forEach(data -> System.out.println(data));

	}

	public static void linkedListWithListInterface() {
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("avi");
		linkedList.add("sid");
		linkedList.add("dru");
		linkedList.add("avi");

		//linkedList.addLast("bhi"); //we cannot user add last method for list interface reference
		linkedList.add(2, "dow");

		System.out.println(linkedList.toString());

		// linkedList.removeFirst();//we cannot user remove method

		linkedList.stream().filter(data -> !data.contains("avi")).map(data -> data + " hello")
				.forEach(data -> System.out.println(data));

	}
}
