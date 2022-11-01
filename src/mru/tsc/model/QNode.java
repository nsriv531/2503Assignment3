package mru.tsc.model;
/**
 * 
 * @author sriva
 *
 * @param <T>
 */
public class QNode<T> {

	private T data;
	private QNode<T> next;
	
	/**
	 * 
	 * @param data
	 * @param next
	 */
	public QNode(T data, QNode<T> next) {
		this.data = data;
		this.next = next;
	}

	/**
	 * 
	 * @return
	 */
	public T getData() {
		return data;
	}

	/**
	 * 
	 * @param data
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * 
	 * @return
	 */
	public QNode<T> getNext() {
		return next;
	}

	/**
	 * 
	 * @param next
	 */
	public void setNext(QNode<T> next) {
		this.next = next;
	}
	
	
}
