package JUnitTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import mru.tsc.model.LinkedQueue;
import mru.tsc.model.PriorityQueue;

/**
 * This tests the methods associated with the priorityQueue.
 * @author sriva
 *
 */
class QueueTests {
	
	
	
	@Test
	void testLinkedEnqueue() {

		LinkedQueue<String> linkedQueue = new LinkedQueue<>();
		linkedQueue.enqueue("Emilio");
		linkedQueue.enqueue("Nikhil");
		linkedQueue.enqueue("Justin");
		String theQueue = linkedQueue.toString();
		System.out.println(theQueue);
		Assert.assertTrue(theQueue.equals("Emilio Nikhil Justin "));
		
	}

	@Test
	void testLinkedDequeue() throws Exception {
		
		LinkedQueue<String> linkedQueue = new LinkedQueue<>();
		linkedQueue.enqueue("Emilio");
		linkedQueue.enqueue("Nikhil");
		linkedQueue.enqueue("Justin");
		linkedQueue.dequeue();
		String theQueue = linkedQueue.toString();
		System.out.println(theQueue);
		Assert.assertTrue(theQueue.equals("Nikhil Justin "));
	}
	
	@Test
	void testLinkedgetSize() {
		LinkedQueue<String> linkedQueue = new LinkedQueue<>();
		linkedQueue.enqueue("Emilio");
		linkedQueue.enqueue("Nikhil");
		System.out.println(linkedQueue.getSize());
		Assert.assertTrue(linkedQueue.getSize() == 2);
	}
	
	@Test
	void testLinkedPeek() {
		LinkedQueue<String> priority4Queue = new LinkedQueue<>();
		priority4Queue.enqueue("Emilio");
		Assert.assertTrue(priority4Queue.peek().equals("Emilio"));

	}
	
	

	@Test
	void testpriEnqueue() {

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.enqueue(10);
		priorityQueue.enqueue(2);
		priorityQueue.enqueue(4);
		String theQueue = priorityQueue.toString();
		System.out.println(theQueue);
		Assert.assertTrue(theQueue.equals("2 4 10 "));
		
	}

	@Test
	void testpriDequeue() throws Exception {
		
		PriorityQueue<Integer> priority2Queue = new PriorityQueue<>();
		priority2Queue.enqueue(10);
		priority2Queue.enqueue(2);
		priority2Queue.enqueue(4);
		priority2Queue.dequeue();
		String theQueue = priority2Queue.toString();
		System.out.println(theQueue);
		Assert.assertTrue(theQueue.equals("4 10 "));
	}
	
	@Test
	void testprigetSize() {
		PriorityQueue<Integer> priority3Queue = new PriorityQueue<>();
		priority3Queue.enqueue(10);
		priority3Queue.enqueue(2);
		System.out.println(priority3Queue.getSize());
		Assert.assertTrue(priority3Queue.getSize() == 2);
	}
	
	@Test
	void testpriPeek() {
		PriorityQueue<Integer> priority4Queue = new PriorityQueue<>();
		priority4Queue.enqueue(10);
		Assert.assertTrue(priority4Queue.peek() == 10);

	}
	
	
}
