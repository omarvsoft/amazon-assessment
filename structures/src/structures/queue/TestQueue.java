package structures.queue;

public class TestQueue {
	
	public static void main(String args[]) {
		
		Employee e1 = new Employee("Nancy", 30);
		Employee e2 = new Employee("Erick", 33);
		Employee e3 = new Employee("Chispa", 3);
		
		QueueArray queue = new QueueArray(10);
		
		queue.add(e1);
		queue.add(e2);
		queue.add(e3);
		
		queue.printQueue();
		
		Employee eRemoved = queue.remove();
		
		System.out.println("Removed " + eRemoved);
		
		queue.printQueue();
	}

}
