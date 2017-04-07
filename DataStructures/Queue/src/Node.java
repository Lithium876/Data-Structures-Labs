
public class Node {
	
	public String itemName;
	public double price;
	public Node nextNode;
	
	public Node(){
		this.itemName = "";
		this.price = 0;
		this.nextNode = null;
	}
	
	public Node(String itemName, double price){
		this.itemName = itemName;
		this.price = price;
		this.nextNode = null;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	public String getItemName() {
		return itemName;
	}

	public double getPrice() {
		return price;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void display(){
		System.out.println(this.itemName+" - $"+this.price);
	}
}
