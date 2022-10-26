
public class LinkedQueue<T> implements QueueInterface<T> {
	
	private QNode<T> front, rear;
	private int size;
	
	public LinkedQueue() {
		size = 0;
		front = null;
		rear = null;
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
		return front == null;
	}

	public void printQueue() {
		
		for (int i = 0; i < size ; i++) {
			System.out.println();
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

	public void setRear(QNode<T> rear) {
		this.rear = rear;
	}

}
