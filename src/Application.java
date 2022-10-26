
public class Application {

	public static void main(String[] args) throws Exception {
		
		LinkedQueue<String> linkedQueue = new LinkedQueue<>();
		
		linkedQueue.enqueue("Emilio");
		linkedQueue.enqueue("Nik");
		linkedQueue.enqueue("Nathan");
		linkedQueue.enqueue("Gabe");
		
		linkedQueue.printQueue();

	}

}
