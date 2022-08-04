package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExamples {

	public static void main(String[] args) {
		arrayListExamples();
		arrayListWithListInterface();
	}
	
	public static void arrayListExamples() {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("avi");
		arrayList.add("sid");
		arrayList.add("dru");
		System.out.println("before sort" + arrayList.toString());
		Collections.sort(arrayList);
		System.out.println("After sort" + arrayList.toString());
		arrayList.remove(2);
		System.out.println(arrayList.get(1));

		System.out.println(arrayList.contains("avi"));

		System.out.println("all data" + arrayList.toString());
	}
	
	
	public static void arrayListWithListInterface() {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("avi");
		arrayList.add("sid");
		arrayList.add("dru");
		System.out.println("before sort" + arrayList.toString());
		Collections.sort(arrayList);
		System.out.println("After sort" + arrayList.toString());
		arrayList.remove(2);
		System.out.println(arrayList.get(1));

		System.out.println(arrayList.contains("avi"));

		System.out.println("all data" + arrayList.toString());
	}
	
	

}
