
public class Queue {
	
	private Node HEAD;
	private Node REAR;
	private int length;
	
	public Queue(){
		this.HEAD = null;
		this.REAR = null;
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
		if(this.HEAD == null && this.REAR == null){
			return true;
		}
		return false;
	}
	
	public void enqueue(String itemName, double price){
		if(isFull()){
			System.out.println("\n\nError - cannot add item to the queue");
		}else{
			Node node = new Node(itemName, price);
			if(isEmpty()){
				this.HEAD = node;
				this.REAR = node;
			}else{
				this.REAR.setNextNode(node);
				this.REAR = node;
			}
			this.length++;
		}
	}
	
	public String dequeue(){
		if(isEmpty()){
			System.out.println("\n\nQueue is empty.");
			return "";
		}else{
			Node tempNode = this.HEAD;
			String data = tempNode.getItemName()+" - "+tempNode.getPrice();
			if(length == 1){
				this.HEAD = null;
				this.REAR = null;
			}else{
				this.HEAD = this.HEAD.getNextNode();
				tempNode.setNextNode(null);
			}
			length--;
			return data;
		}
	}
	
	public void displayQueue(){
		Node currentNode = new Node();
		currentNode = this.HEAD;
		System.out.println("Queue via Linked List");
		while(currentNode != null){
			currentNode.display();
			currentNode = currentNode.getNextNode();
		}
		System.out.println("-----------------------");
	}
}