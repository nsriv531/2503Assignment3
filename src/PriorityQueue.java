
public class PriorityQueue<T> implements QueueInterface<T> {
	
	private int size;
	private QNode<T> front;
	private QNode<T> rear;
	
	public PriorityQueue() {
		size = 0;
		front = rear = null;
	}

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

	public T dequeue() throws Exception {
		
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		
		QNode<T> temp = new QNode<>(front.getData(), null);
		front = front.getNext();
		
		size--;
		
		return temp.getData();
	}

	public T peek() {
		return front.getData();
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return false;
	}

	public void printQueue() {
		
		QNode<T> current = front;
		
		while (current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
		
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

	public QNode<T> setRear(QNode<T> rear) {
		this.rear = rear;
		return rear;
	}

}
