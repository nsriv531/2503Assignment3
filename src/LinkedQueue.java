
public class LinkedQueue<T> implements QueueInterface<T> {
	
	private QNode<T> front, rear;
	private int size;
	
	public LinkedQueue() {
		size = 0;
		front = null;
		rear = null;
	}

	public void enqueue(T t) {
		
		if (rear == null) {
			front = rear = new QNode<T>(t);
			return;
		} else {
			rear.setNext(new QNode<T>(t));
		}
		
		size++;
		
	}

	public T dequeue() {
		
		if (isEmpty()) {
			System.out.println("Nothing in the Queue");
			rear = null;
			return null;
		}
		
		QNode<T> temp = new QNode<>(front.getData());
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
		
		QNode<T> temp =new QNode<>(front.getData());
		
		for (int i = 0; i < size ; i++) {
			System.out.println(temp);
			temp = temp.getNext();
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
