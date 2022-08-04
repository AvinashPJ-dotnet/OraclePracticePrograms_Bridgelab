package collections;

import java.util.Stack;

public class StackExamples {

	public static void main(String[] args) {
		stackExample();
	}
	public static void stackExample() {
		Stack<String> myStack=new Stack<>();
		myStack.push("avi");
		myStack.push("sid");
		myStack.push("zid");
		
		myStack.push("avi");
		myStack.push("sid");
		myStack.push("zid");
		
		myStack.push("avi");
		myStack.push("sid");
		myStack.push("zid");
		myStack.add("gou");
		myStack.add(2,"dru");
		
		System.out.println(myStack.toString());
		myStack.pop();
		System.out.println(myStack.toString());
		
		System.out.println("stack capacity--"+myStack.capacity());
		System.out.println("peek element--"+myStack.peek());
		
		System.out.println("search element--"+myStack.search("gou"));
		System.out.println("check is stack empty--"+myStack.isEmpty());
	}
}
