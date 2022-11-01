package mru.tsc.model;
/**
 * 
 * @author sriva
 *
 * @param <T>
 */
public interface QueueInterface<T> {

	void enqueue(T t);
	T dequeue() throws Exception;
	T peek();
	int getSize();
	boolean isEmpty();
	void printQueue();
	
}