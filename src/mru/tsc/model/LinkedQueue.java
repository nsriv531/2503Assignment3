package mru.tsc.model;

/**
 * This class is responsible for the linkedQueue, which is responsible for adding names to a queue without prioritization.
 * @author Emilio G, Nik S.
 * @param <T> generic type to accept any type. impelements the Queueinterface to access the methods.
 */
public class LinkedQueue<T> implements QueueInterface<T> {
	
	private QNode<T> front, rear; //front and rear for the queue.
	private int size; //size of queue.
	private String queue = ""; //setting the default queue for testing purposes
	
	
	/**
	 * Default constructor, in which size is set to 0, and null is set for the front and rear.
	 */
	public LinkedQueue() {
		size = 0;
		front = null;
		rear = null;
	}

	/**
	 * The enqueue method for the linkedQueue. Adds to the queue.
	 */
	public void enqueue(T t) {
		
		if (rear != null) {
			rear.setNext(new QNode<T>(t, null));
			rear = rear.getNext();
		} else {
			rear = new QNode<T>(t, null);
			front = rear;
		}
		
		size++;
		
	}

	/**
	 * The dequeue method for the linkedQueue. Removes from the queue.
	 */
	public T dequeue() throws Exception {
		
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		
		QNode<T> temp = new QNode<>(front.getData(), null);
		front = front.getNext();
		
		size--;
		
		return temp.getData();
	}

	/**
	 * Peek method that allows the user to display parts of the queue.
	 */
	public T peek() {
		return front.getData();
	}

	/**
	 * Gets a size of the queue, returns a number.
	 */
	
	public int getSize() {
		return size;
	}

	/**
	 * detects if the queue is empty.
	 */
	public boolean isEmpty() {
		return front == null;
	}

	/**
	 * prints the queue accordingly.
	 */
	public void printQueue() {
		
		QNode<T> current = front;
		
		while (current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();
			
		}
		
	}
	
	/**
	 * toString method that is used for testing purposes.
	 */
	public String toString() {
		
		QNode<T> current = front;
		
		while (current != null) {
			System.out.print(current.getData() + " ");
			queue += current.getData() + " ";
			current = current.getNext();
		}
		return queue;
	}
/**
 * gets the front of the queue.
 * @return front - front of the queue.
 */
	public QNode<T> getFront() {
		return front;
	}
/**
 * sets the front of the queue.
 * @param front passed in, and then set accordingly.
 */
	public void setFront(QNode<T> front) {
		this.front = front;
	}

	/**
	 * gets the rear of the queue
	 * @return rear - which is returned for the last of the queue.
	 */
	public QNode<T> getRear() {
		return rear;
	}
/**
 * rear is passed in so it is set accordingly.
 * @param rear - which is the last of the queue.
 */
	public void setRear(QNode<T> rear) {
		this.rear = rear;
	}

}
