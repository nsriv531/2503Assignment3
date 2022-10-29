
public class PriorityQueue<T> implements QueueInterface<T>{
	
	private int size;
	private QNode<T> front;
	private QNode<T> rear;
	
	public PriorityQueue() {
		size = 0;
		front = rear = null;
	}

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
