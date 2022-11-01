package mru.tsc.control;


import java.util.PriorityQueue;

import mru.tsc.model.LinkedQueue;
import mru.tsc.model.QueueInterface;
import mru.tsc.view.AppMenu;

public class QueueController {

	private AppMenu menuObject;
	private PriorityQueue queueObject;
	
	
	public void launchApplication() throws Exception {
		
		LinkedQueue<String> linkedQueue = new LinkedQueue<>();

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

		boolean flag = true;
		
		while(flag){
			
			menuObject = new AppMenu();
			int menuChoice = menuObject.showMainMenu();
			
			switch(menuChoice) {
				
			case 1:
				linkedQueue.printQueue();
				
				break;
			case 2:
				
				
				System.out.println(priorityQueue.toString());
				
				break;
				
			case 3:
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
