
public class LinkedQueue<T> implements QueueInterface<T> {
	
	private QNode<T> front, rear;
	private int size;
	
	public LinkedQueue() {
		size = 0;
		front = null;
		rear = null;
	}

	public void enqueue(T t) {
		QNode<T> temp = new QNode<>(t);
		
		if (rear == null) {
			front = rear = temp;
			return;
		}
		
		rear.setNext(temp);
		rear = temp;
		
	}

	public T dequeue() {
		
		if (front == null) {
			rear = null;
			return null;
		}
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
