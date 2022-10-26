
public class LinkedQueue<T> implements QueueInterface<T> {
	
	private QNode<T> front;
	private QNode<T> rear;
	private int size;
	
	public LinkedQueue() {
		size = 0;
		front = null;
		rear = null;
	}

	public void enqueue(T t) {
		
	}

	public T dequeue() {
		return null;
	}

	public T peek() {
		return null;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return false;
	}

	public void printQueue() {
		
	}

	public QNode<T> getFront() {
		return front;
	}

	public void setFront(QNode<T> front) {
		this.front = front;
	}

	public QNode<T> getRear() {
		return rear;
	}

	public void setRear(QNode<T> rear) {
		this.rear = rear;
	}

}
