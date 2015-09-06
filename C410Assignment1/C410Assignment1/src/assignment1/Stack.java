package assignment1;

public class Stack<T> {
	
	private Node<T> first;
	private T itemOnTop;
	
	public Stack() {
		first = null;
		itemOnTop = null;
	}
	
	public boolean isEmpty() {
		return first ==  null; //if "current" node is null, then return true
	}
	
	public T peek() {
		return itemOnTop; //updated with push and pop
	}
	
	public T pop() {
		Node<T> tmp = first; //create a tmp reference to current node
		first = first.next; //set "current" node to previous node using the contained reference
		if(!isEmpty()) itemOnTop = first.data; //check if node is empty, then set itemOnTop for peek()
		return tmp.data; //return the element from the removed node
	}
	
	public void push(T element) {
		Node<T> node = new Node<T>(element, first); //create next node with reference to previous node
		first = node; //set "current" node to the new node
		itemOnTop = element; //set itemOnTop for peek()
	}
	
}
