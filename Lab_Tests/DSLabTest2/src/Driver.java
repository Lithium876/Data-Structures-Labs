/*
* Name: Lomar Lilly
* ID# : 1401375
*/

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Queue qCust = new Queue();
		Driver rv = new Driver();
		
		Scanner in = new Scanner(System.in);
		
		for(int i=0;i<4;i++){
			System.out.println("Enter Customer First Name:");
			String firstName = in.nextLine();
			System.out.println("Enter Customer Last Name:");
			String lastName = in.nextLine();
			System.out.println("Enter Customer Address:");
			String address = in.nextLine();
			System.out.println();
			
			Customer customer = new Customer(firstName, lastName, address);
			
			qCust.enqueue(customer); 
		}
		in.close();
		qCust.displayCustomers();
		
		System.out.println("Reverse: ");
		rv.reverseQueue(qCust);
		qCust.displayCustomers();
	}
	
	public void reverseQueue(Queue queue){
		System.out.println("called: ");
		Customer [] arr = new Customer[10];
		int p=1;
		int j=10;
		
		while(!queue.isEmpty()){
			arr[p] = queue.dequeue();
			p++;
		}
		
		while(j!=0){
			try{
				Customer cus = new Customer(arr[j].getFirstName(), arr[j].getLastName(), arr[j].getAddress());
				queue.enqueue(cus);
				j--;
			}catch(Exception e){
				j--;
			}
		}
	}
}
