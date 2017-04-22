/*
 *  Name: Lomar Lilly
 * ID# : 1401375
*/

public class Node {
	
	private Customer customer;
	private Node nextNode;
	
	public Node(){
		this.addData(new Customer());
		this.nextNode=null;
	}
	
	public Node(Customer customer){
		this.addData(customer);
		this.nextNode = null;
	}
	
	public void addData(Customer customer){
		this.customer = customer;
	}
	
	public Customer getCustomer(){
		return customer;
	}
	
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	public Node getNextNode() {
		return nextNode;
	}
	
	public void displayCustomer(){
		System.out.println("First Name: "+customer.getFirstName()+"\n"+"Last Name: "+customer.getLastName()+"\n"+"Address: "+customer.getAddress()+"\n");
	}
}