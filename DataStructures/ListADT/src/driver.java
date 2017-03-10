public class driver {

	public static void main(String[] args) {
		
		List Lst = new List();
		
		Lst.insert(7, 1);
		Lst.insert(11,2);
		Lst.insert(4, 3);
		Lst.insert(10, 2);
		Lst.insertAtfront(70);
		Lst.insertAtback(40);
		Lst.delete(11);
		Lst.displayList();
		System.out.println("\n"+Lst.retrieve(3));

	}
}