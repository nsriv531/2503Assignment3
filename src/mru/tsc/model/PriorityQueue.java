package mru.tsc.model;

/**
 * This class is responsible for a queue that is based on prioritization.
 * @author Emilio G, Nik S.
 * @param <T> generic type that is then implemented via an interface.
 */
public class PriorityQueue<T> implements QueueInterface<T>{
	
	private int size; //size of the queue.
	private QNode<T> front; //front of the queue.
	private QNode<T> rear; //last of the queue.
	private String queue = ""; //set to default and blank for testing purposes.

	/**
	 * Default constructor, where size is 0 and the front and rear are set to null.
	 */
	public PriorityQueue() {
		size = 0;
		front = rear = null;
	}

	/**
	 * Enqueue method for the priority queue in which data is added. Size is incremented accordingly.
	 */
	
	@Override
	public void enqueue(T t) {
		
		if (rear != null) {
			
			Comparable<T> enqueueComparable = (Comparable<T>)t;
			
			QNode<T> current = front;
			QNode<T> previous = null;
				
			for (int i = 0; i < size; i++) {
				
				int comparisonResult = (enqueueComparable.compareTo(current.getData())* - 1);
			
				if ( (i == 0 && comparisonResult > 0) || (i == 0 && comparisonResult == 0) ) {
					front = new QNode<T>(t, current);
					break;
				} else if (i == (size - 1) && comparisonResult < 0) {
					rear.setNext(new QNode<T>(t, null));
					rear = rear.getNext();
					break;
				} else if (comparisonResult < 0) {
					previous = current;
					current = current.getNext();
				} else if (comparisonResult > 0 || comparisonResult == 0) {
					previous.setNext(new QNode<T>(t, current));
				} 
				
			}
			
		} else {
			rear = new QNode<T>(t, null);
			front = rear;
		}
		
		size++;
		
	}

	/**
	 * Dequeue method is used to remove from the queue.
	 */
	
	@Override
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
	 * peek method to peek within the prioritiyqueue.
	 */
	
	@Override
	public T peek() {
		return front.getData();
	}

	/**
	 * gets the size of the queue.
	 */
	
	@Override
	public int getSize() {
		return size;
	}

	/**
	 * detects of the queue is empty or not.
	 */
	
	@Override
	public boolean isEmpty() {
		return front == null;
	}

	/**
	 * prints the queue accordingly.
	 */
	
	@Override
	public void printQueue() {
		
		QNode<T> current = front;
		
		while (current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
		
	}

	/**
	 * gets the front of the queue.
	 * @return front - front of the queue.
	 */
	
	public QNode<T> getFront() {
		return front;
	}

	/**
	 * front of the queue is passed
	 * @param front is then officially set.
	 */
	public void setFront(QNode<T> front) {
		this.front = front;
	}

	/**
	 * gets the rear of the prioritiyQueue
	 * @return rear is returned for the queue.
	 */
	public QNode<T> getRear() {
		return rear;
	}

	/**
	 * sets the rear by passing in the queue as a parameter
	 * @return rear of the queue is returned
	 */
	
	
	public QNode<T> setRear(QNode<T> rear) {
		this.rear = rear;
		return rear;
	}
	
	/**
	 * To string method for the queue for testing purposes
	 * @return the queue to be displayed.
	 */
	@Override
	public String toString() {
	
		QNode<T> current = front;
		
		while (current != null) {
			System.out.print(current.getData() + " ");
			queue += current.getData() + " ";
			current = current.getNext();
		}
		
		return queue;
		
	}
	
}
