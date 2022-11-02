package mru.tsc.application;
import mru.tsc.model.*;
import mru.tsc.view.AppMenu;

/**
 * This class is the main application class in which the queues are run and enqueued, as well as dequeued.
 * @author Emilio G, Nik S.
 *
 */
public class Application {

	private static AppMenu menuObject; //private menu object to access the menu properties.
	private static LinkedQueue<String> linkedQueue = new LinkedQueue<>(); //private linkedQueue 
	private static PriorityQueue<String> priorityQueue = new PriorityQueue<>(); //private prioritiyqueue for prioritization reasons
	
	
	/**
	 * This is the public void main method in which the main method is run, this goes through cases for the menu for the user, in which the user 
	 * can enter names, and print them accordingly via the linked or priority queue. 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		
		boolean flag = true;
		
		while(flag){
			
			menuObject = new AppMenu();
			int menuChoice = menuObject.showMainMenu();
			
			switch(menuChoice) {
				
			case 1:
				String nameChoice = menuObject.enterName();
				linkedQueue.enqueue(nameChoice);
				priorityQueue.enqueue(nameChoice);
				System.out.println("Name has been added to the queue!");
				break;
			case 2:
				System.out.println("");
				linkedQueue.printQueue();
				System.out.println("");
				break;		
			case 3:
				System.out.println("");
				priorityQueue.printQueue();
				System.out.println("");
				System.out.println("");
				break;
			case 4:
				System.out.println("");
				System.out.println("LinkedQueue that has been dequed:");
				System.out.println(linkedQueue.dequeue());
				System.out.println(linkedQueue.dequeue());
				System.out.println("");
				System.out.println("PrioritiyQueue that has been dequed: ");
				System.out.println(priorityQueue.dequeue());
				System.out.println(priorityQueue.dequeue());
				System.out.println("");
				break;
			case 5:
				System.out.println("Thank you for working with queues...");
				flag = false;
				break;
			
			default:
				System.out.println("");
				System.out.println("Invalid Number! Enter options 1-4...");
				System.out.println("");
				break;
			}
		}
	
		
	}

}
