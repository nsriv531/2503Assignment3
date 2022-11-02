package mru.tsc.control;


import mru.tsc.model.PriorityQueue;

import mru.tsc.model.LinkedQueue;
import mru.tsc.model.QueueInterface;
import mru.tsc.view.AppMenu;

public class QueueController {

	private AppMenu menuObject;
	
	
	public void launchApplication() throws Exception {
		
		LinkedQueue<String> linkedQueue = new LinkedQueue<>();
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

		boolean flag = true;
		
		while(flag){
			
			menuObject = new AppMenu();
			int menuChoice = menuObject.showMainMenu();
			
			switch(menuChoice) {
			
			case 1:
				
				break;
			
			
			case 2:
				
				linkedQueue.enqueue("Emilio");
				linkedQueue.enqueue("Nikhil");
				linkedQueue.enqueue("Nathan");
				linkedQueue.printQueue();
				System.out.println("");
				break;
				
			case 3:
				
				priorityQueue.enqueue(4);
				priorityQueue.enqueue(6);
				priorityQueue.enqueue(10);
				priorityQueue.printQueue();
				System.out.println("");
				break;
				
			case 4:
				System.out.println("Goodbye!");
				flag = false;
				break;
			
			default:
				System.out.println("");
				System.out.println("Invalid Number! Enter options 1-3...");
				System.out.println("");
				break;
			}
		}
		
		
		
		
	}
	
}
