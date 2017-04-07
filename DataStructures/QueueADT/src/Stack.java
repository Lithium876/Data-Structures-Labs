
public class Stack {
	
	private Node TOP;
	private int length;
	
	public Stack(){
		this.TOP = null;
		this.length = 0;
	}
	
	@SuppressWarnings("unused")
	public boolean isFull(){
		Node node = new Node();
		if(node == null){
			return true;
		}
		return false;
	}
	
	public boolean isEmpty(){
		if(this.TOP == null){
			return true;
		}
		return false;
	}
	
	public void push(String itemName, double price){
		if(isFull()){
			System.out.println("\n\nError - cannot insert the item");
		}else{
			Node node = new Node(itemName, price);
			node.setNextNode(this.TOP);
			this.TOP = node;
			this.length++;
		}
	}
	
	public String pop(){
		if(isEmpty()){
			System.out.println("Stack is Empty!");
			return "";
		}else{
			Node tempNode = this.TOP;
			this.TOP = this.TOP.getNextNode();
			tempNode.setNextNode(null);
			String data = tempNode.getItemName()+" - "+tempNode.getPrice();
			this.length--;
			return data;		
		}
	}
	
	public void displayStack(){
		Node currentNode = this.TOP;
		System.out.println("Item Stack");
		System.out.println("------------------------");
		while(currentNode != null){
			currentNode.display();
			currentNode = currentNode.getNextNode();
		}
		System.out.println("------------------------");
	}
}
