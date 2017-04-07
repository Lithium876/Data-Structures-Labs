
public class Driver {

	public static void main(String[] args) {
		Queue q = new Queue();
		Driver d = new Driver();
		
		q.enqueue("pencil", 2.50);
		q.enqueue("eraser", 3.00);
		q.enqueue("pen", 4.00);
		
		q.displayQueue();
		
		d.reverseQueue(q);
		System.out.println("\nQueue after reverse...");
		q.displayQueue();
	}
	
	public void reverseQueue(Queue nQ){
		Stack stack = new Stack();
		while(!nQ.isEmpty()){
			String str[] = nQ.dequeue().split("\\s+");
			stack.push(str[0], Double.valueOf(str[2]));
		}
		while(!stack.isEmpty()){
			String str[] = stack.pop().split("\\s+");
			nQ.enqueue(str[0], Double.valueOf(str[2]));
		}
	}
}