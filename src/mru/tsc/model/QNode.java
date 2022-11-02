package mru.tsc.model;
/**
 * Actual node notation for the set of the queue.
 * @author Emilio G, Nik S.
 *
 * @param <T> generic type, casted to recieve various data types for the Nodes set for the PriorityQueue.
 */
public class QNode<T> {

	private T data; //data passed in through the node of the queue.
	private QNode<T> next; //the next node for the queue.
	
	/**
	 * Constructor that takes in data, and a generic type next
	 * @param data is set
	 * @param QNode<T> next is set for the next node
	 */
	public QNode(T data, QNode<T> next) {
		this.data = data;
		this.next = next;
	}

	/**
	 * gets the data of the node
	 * @return data for said node
	 */
	public T getData() {
		return data;
	}

	/**
	 * sets the data of the node
	 * @param passed indata for said node
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * gets the next node
	 * @return the next node
	 */
	public QNode<T> getNext() {
		return next;
	}

	/**
	 * the next node that is then set
	 * @param QNode<T> next - is the actual next node.
	 */
	public void setNext(QNode<T> next) {
		this.next = next;
	}
	
	
}
