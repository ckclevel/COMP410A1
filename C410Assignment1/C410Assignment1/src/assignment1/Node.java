package assignment1;

public class Node<C> {
	C data;
	Node<C> next;
		
	public Node(C x, Node<C> n){ //creates new node with data and reference to another node
		data = x;
		next = n;
	}
}
	

