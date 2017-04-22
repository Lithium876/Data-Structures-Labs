/*
* Name: Lomar Lilly
* ID# : 1401375
*/

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
	
	public void enqueue(Customer cus){
		if(isFull()){
			System.out.println("\n\nError - Queue is full");
		}else{
			Node node = new Node(cus);
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
	
	public Customer dequeue(){
		if(isEmpty()){
			System.out.println("\n\nQueue is empty.");
			return null ;
		}else{
			Node tempNode = this.HEAD;
			Customer data = tempNode.getCustomer();
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
	
	public void displayCustomers(){
		Node currentNode;
		currentNode = this.HEAD;
		System.out.println("Queue via Linked List");
		while(currentNode != null){
			currentNode.displayCustomer();
			currentNode = currentNode.getNextNode();
		}
	}
}