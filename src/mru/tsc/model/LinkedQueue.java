package mru.tsc.model;

/**
 * 
 * @author sriva
 *
 * @param <T>
 */
public class LinkedQueue<T> implements QueueInterface<T> {
	
	private QNode<T> front, rear;
	private int size;
	private String queue = "";
	
	
	/**
	 * 
	 */
	public LinkedQueue() {
		size = 0;
		front = null;
		rear = null;
	}

	/**
	 * 
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
	 * 
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
	 * 
	 */
	public T peek() {
		return front.getData();
	}

	/**
	 * 
	 */
	
	public int getSize() {
		return size;
	}

	/**
	 * 
	 */
	public boolean isEmpty() {
		return front == null;
	}

	/**
	 * 
	 */
	public void printQueue() {
		
		QNode<T> current = front;
		
		while (current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();
			
		}
		
	}
	
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
 * 
 * @return
 */
	public QNode<T> getFront() {
		return front;
	}
/**
 * 
 * @param front
 */
	public void setFront(QNode<T> front) {
		this.front = front;
	}

	/**
	 * 
	 * @return
	 */
	public QNode<T> getRear() {
		return rear;
	}
/**
 * 
 * @param rear
 */
	public void setRear(QNode<T> rear) {
		this.rear = rear;
	}

}
