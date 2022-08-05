package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExamples {
	public static void main(String[] args) {
//		hashMapExamples();
		hashMapWithMapInterface();
	}

	public static void hashMapExamples() {
		HashMap<Integer, String> mapCollection = new HashMap<>();
		mapCollection.put(1, "avi");
		mapCollection.put(2, "sid");
		mapCollection.putIfAbsent(3, "dru");

		System.out.println(mapCollection.toString());
//	mapCollection.

	}

	public static void hashMapWithMapInterface() {
		Map<Integer, String> mapCollection = new HashMap<>();
		mapCollection.put(1, "avi");
				mapCollection.put(1, "avi");
		mapCollection.put(2, "sid");
		mapCollection.putIfAbsent(3, "dru");

		System.out.println(mapCollection.toString());
//		mapCollection.remove(1);
		System.out.println(mapCollection.get(2).toString());

		// using for-each loop for iteration over Map.entrySet()
		for (Map.Entry<Integer, String> entry : mapCollection.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

		Set set = mapCollection.entrySet();// Converting to Set so that we can traverse
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			// Converting to Map.Entry so that we can get key and value separately
			Map.Entry<Integer,String> entry =(Entry<Integer, String>) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		// get only keys using keySet()
		for (int id : mapCollection.keySet())
			System.out.println("key: " + id);

		// get only values using values()
		for (String data : mapCollection.values())
			System.out.println("value: " + data);

	}
}
