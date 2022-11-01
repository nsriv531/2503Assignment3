package mru.tsc.view;

import java.util.Scanner;

public class AppMenu {
		
		private Scanner myObj; //scanner defined for the main menu.
		private Scanner pqObj; //scanner defined for the game menu.
		private int mainMenuChoice; //the choice that the user chooses in the main menu.

		/**
		 * AppMenu constructor, here the scanners are intialized for the two menus, being the mainmenu and the game menu.
		 */
		
		public AppMenu() {
			
			myObj = new Scanner(System.in);
			pqObj = new Scanner(System.in);
		
		}

		/**
		 * Main menu for the game.
		 */
		public int showMainMenu() {
			
			while (true) {
		    System.out.println("Select one of these options:");
		    System.out.println("1.   Print LinkedQueue");
		    System.out.println("2.   Print PriorityQueue");
		    System.out.println("3.   Exit");
		    System.out.print("Enter your choice: ");
		    
		    	if(myObj.hasNextInt()) {
		    		mainMenuChoice = myObj.nextInt();
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
		

}
