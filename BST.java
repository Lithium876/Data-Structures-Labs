
public class Node {
	
	private int data;
	private Node left;
	private Node right;
	
	public Node(int data){
		this.data = data;
		left = null;
		right = null;
	}
	
	public Node(){
		data = 0;
		left = null;
		right = null;
	}

	public int getData() {
		return data;
	}

	public Node getLeftNode() {
		return left;
	}

	public Node getRightNode() {
		return right;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setLeftNode(Node left) {
		this.left = left;
	}

	public void setRightNode(Node right) {
		this.right = right;
	}
	
	public void display(){
		System.out.println(data+"\n");
	}
}


public class Tree {
	
	private Node ROOT;
	private int lenght;
	
	public Tree(){
		this.ROOT = null;
		this.lenght = 0;
	}
	
	public Node getRoot(){
		return this.ROOT;
	}
	
	@SuppressWarnings("unused")
	public boolean isFull(){
		Node node = new Node();
		if(node==null){
			return true;
		}
		return false;
	}
	
	public boolean isEmpty(){
		if(this.ROOT==null){
			return true;
		}
		return false;
	}
	
	public Node insertNode(int e, Node rt){
		if(rt==null){
			rt = new Node(e); //create data and add to leaf
		}else{
			if(e < rt.getData())//compare data to root and go if its less and right if its greater
			{ 
				rt.setLeftNode(insertNode(e,rt.getLeftNode()));
			}else{
				if(e > rt.getData()){
					rt.setRightNode(insertNode(e, rt.getRightNode()));
				}
			}
		}
		return rt; //return root
	}
	
	public void addNode(int e){
		Node root = new Node();
		root = insertNode(e, root);
	}
	
	public void preOrderTraversal(Node r){
		if(r!=null){
			 r.display();
		     preOrderTraversal(r.getLeftNode());
		     preOrderTraversal(r.getRightNode());
		}
	}
	
	public void inOrderTraversal(Node r){
		if(r!=null){
		     preOrderTraversal(r.getLeftNode());
		     System.out.println(r.getData());
		     preOrderTraversal(r.getRightNode());
		}
	}
	
	public void postOrderTraversal(Node r){
		if(r!=null){
		     preOrderTraversal(r.getLeftNode());
		     preOrderTraversal(r.getRightNode());
		     r.display();
		}
	}
	
	public void displayTree(){
		inOrderTraversal(this.ROOT);
	}
	
	public Node findMax(Node root){
		if(root == null){
			return null;
		}else{
			if(root.getRightNode()==null) //if right node is null then its the largest node so return null
			{
				return root;
			}else{
				return findMax(root.getRightNode());
			}
		}
	}
	
	public Node findMin(Node root){
		if(root == null){
			return null;
		}else{
			if(root.getLeftNode()==null) //if right node is null then its the largest node so return null
			{
				return root;
			}else{
				return findMax(root.getLeftNode());
			}
		}
	}
	
	public Node deleteNode(int e, Node root){
		if(root==null)
		{
			return null;
		}
		else
		{
			if(e < root.getData())
			{
				root.setLeftNode(deleteNode(e, root.getLeftNode()));
			}
			else
			{
				if(e > root.getData())
				{
					root.setRightNode(deleteNode(e, root.getRightNode()));
				}
				else
				{
					Node delTemp;
					if(root.getLeftNode() != null && root.getRightNode() != null)
					{
						delTemp = findMin(root.getRightNode());
						root.setData(delTemp.getData());
						root.setRightNode(deleteNode(root.getData(), root.getRightNode()));
					}
					else
					{
						delTemp = root;
						if(root.getLeftNode() == null)
						{
							root = root.getRightNode();
						}
						else
						{
							if(root.getRightNode() == null)
							{
								root = root.getLeftNode();
							}
						}
					}
				}
			}
		}
		return root;
	}
	
	public void removeNode(int e){
		Node root = new Node();
		root = deleteNode(e, root);
		lenght--;
	}
}

public class Driver {

	public static void main(String[] args) {
		Tree tree = new Tree();
	    tree.addNode(4);
	    tree.addNode(25);
	    tree.addNode(30);
	    tree.addNode(15);
	    tree.addNode(20);
	    tree.addNode(3);
	    tree.addNode(1);

	    tree;

//	    tree.removeNode(3);
//	    tree.displayTree();
//
//	    System.out.println("\nPre-order Traversal");
//	    tree.preOrderTraversal(tree.getRoot());
//
//	    System.out.println("\nPost-order Traversal");
//	    tree.postOrderTraversal(tree.getRoot());
	}
}
