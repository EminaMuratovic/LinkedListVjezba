
public class Test {
	public static void main(String[] args) {
		LinkedListInt test = new LinkedListInt();
		test.add(1);
		test.add(2);
		test.add(3);
		test.printList();
		System.out.println();
		LinkedListInt test2 = new LinkedListInt();
		test2.add(4);
		test2.add(5);
		test.add(test2);
		test.printList();
		
	}

}
