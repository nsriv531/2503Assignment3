package mru.tsc.model;
/**
 * Interface for the queue that imports the methods neccessary and are needed.
 * @author Emilio G, Nik S.
 *
 * @param <T> generic type casted for various types of data.
 */
public interface QueueInterface<T> {

	void enqueue(T t);
	T dequeue() throws Exception;
	T peek();
	int getSize();
	boolean isEmpty();
	void printQueue();
	
}
