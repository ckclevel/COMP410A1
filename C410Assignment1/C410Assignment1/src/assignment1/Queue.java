package assignment1;

public class Queue<T> {
	
	private Node<T> h; //head
	private Node<T> t; //tail
	
	public Queue(){
		h = null;
		t = null;
	}
	
	public boolean isEmpty(){
		return h == null; //h (front of queue) will only be null if the queue is empty
	}
	
	public T peek(){ //if the front is null, return null. otherwise return h.data (data at front)
		if(h == null) return null;
		return h.data;
	}
	
	public T dequeue(){ //removes item from front, so must change itemAtFront**
		Node<T> tmp = h; //create tmp reference to front node
		if(h.next == null) t = null; //if there is no node after the first one, set tail to null
		h = h.next; //set head equal to next node
		return tmp.data; //returns the data that was removed from the queue
		
	}
	
	public void enqueue(T element){ //adds at back, so doesn't affect itemAtFront
		Node<T> node = new Node<T>(element, null); //create new node with element and no link
		if(isEmpty()) { //if the queue is empty, both the "front" and "back" equal to the new node
			h=node;
			t=node;
		} else t.next = node; //if not empty, assign reference to "new" tail node to the "old" tail node
		t = node; //set the "back" equal to the newly queued node (which has a null link)
	}
	
	public class Node<C> {
		C data;
		Node<C> next;
		
		public Node(C d, Node<C> n) {
			data = d;
			next = n;
		}
	}
}
