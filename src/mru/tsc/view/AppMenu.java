package mru.tsc.view;
import java.util.Scanner;
/**
 * Actual class for the app menu, interface to operate between queues and printing said queues.
 * @author Emilio G, Nik S.
 *
 */

public class AppMenu {
		
		private Scanner myObj; //scanner defined for the main menu.
		private int mainMenuChoice; //mainMenu integer to recieve the interger used for the mainmenu function.
	
		/**
		 * AppMenu constructor, here the scanners are intialized for the two menus, being the mainmenu and the game menu.
		 */
		
		public AppMenu() {
			
			myObj = new Scanner(System.in);
		
		}

		/**
		 * Main menu for the game. Cycle between pr
		 */
		public int showMainMenu() {
			
			while (true) {
		    System.out.println("Select one of these options:");
		    System.out.println("1.   Enter names for queue(s)");
		    System.out.println("2.   Print LinkedQueue");
		    System.out.println("3.   Print PriorityQueue");
		    System.out.println("4.   Exit");
		    System.out.print("Enter your choice: ");
		    
		    	if(myObj.hasNextInt()) {
		    		mainMenuChoice = myObj.nextInt();
		    		myObj.nextLine();
		    	    return mainMenuChoice;
		    	}
		    	
		    	else {
		    		System.out.println("");
		    		System.out.println("Text not allowed, try again.");
		    		System.out.println("");
		    		myObj.nextLine();
		    	}
		    	
		    }
		    
		}
		
		/**
		 * Enter the name of the queue. Various names can be entered in here.
		 * @return userInput - input for the queue that the user enters.
		 */
		
		public String enterName() {
			
			
			System.out.println("Enter a name for the queue(s):");
			String userInput = myObj.nextLine();
			
			while(userInput.equals("")) {
				System.out.println("Input is empty, try again!");
				userInput = myObj.nextLine();
				
			}
			
			return userInput;
			
		} 
		

}
