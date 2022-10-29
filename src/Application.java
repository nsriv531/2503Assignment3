
public class Application {

	public static void main(String[] args) throws Exception {
		
		LinkedQueue<String> linkedQueue = new LinkedQueue<>();
		
		System.out.println("Queue: ");
		
		linkedQueue.enqueue("Emilio");
		linkedQueue.enqueue("Nik");
		linkedQueue.enqueue("Nathan");
		linkedQueue.enqueue("Gabe");
		
		linkedQueue.printQueue();
		
		System.out.println();
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		
		System.out.println("Priority Queue: ");
		
		priorityQueue.enqueue(3);
		priorityQueue.enqueue(2);
		priorityQueue.enqueue(7);
		priorityQueue.enqueue(8);
		priorityQueue.enqueue(4);
		priorityQueue.enqueue(1);
		priorityQueue.enqueue(6);
		priorityQueue.enqueue(9);
		priorityQueue.enqueue(5);
		priorityQueue.enqueue(10);
		
		priorityQueue.printQueue();

	}

}
