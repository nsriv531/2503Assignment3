package mru.tsc.model;

/**
 * 
 * @author sriva
 *
 * @param <T>
 */
public class PriorityQueue<T> implements QueueInterface<T>{
	
	private int size;
	private QNode<T> front;
	private QNode<T> rear;
	private String queue = "";

	/**
	 * 
	 */
	public PriorityQueue() {
		size = 0;
		front = rear = null;
	}

	/**
	 * 
	 */
	
	@Override
	public void enqueue(T t) {
		
		if (rear != null) {
			
			Comparable<T> test = (Comparable<T>)t;
			
			QNode<T> current = front;
			QNode<T> previous = null;
				
			for (int i = 0; i < size; i++) {
				
				int comparisonResult = (test.compareTo(current.getData()) * - 1);
				
				if (i == 0 && comparisonResult == 1) {
					front = new QNode<T>(t, current);
					break;
				} else if (i == (size - 1) && comparisonResult == -1) {
					rear.setNext(new QNode<T>(t, null));
					rear = rear.getNext();
					break;
				} else if (comparisonResult == -1) {
					previous = current;
					current = current.getNext();
				} else if (comparisonResult == 1) {
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
	 * 
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
	 * 
	 */
	
	@Override
	public T peek() {
		return front.getData();
	}

	/**
	 * 
	 */
	
	@Override
	public int getSize() {
		return size;
	}

	/**
	 * 
	 */
	
	@Override
	public boolean isEmpty() {
		return false;
	}

	/**
	 * 
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
	 */
	
	
	public QNode<T> setRear(QNode<T> rear) {
		this.rear = rear;
		return rear;
	}
	
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
