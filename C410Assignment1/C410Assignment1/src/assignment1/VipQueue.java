package assignment1;

// treat stack as "head" and queue as "tail"

public class VipQueue<T> {

	private Stack<T> stack;
	private Queue<T> queue;
	
	public VipQueue(){
		stack = new Stack<T>();
		queue = new Queue<T>();
	}
	
	public boolean isEmpty(){
		return (stack.isEmpty() && queue.isEmpty());
	}
	
	public T peek(){ //peek at front of vipqueue
		if(!stack.isEmpty()) { //stack is "head" of vq, so check stack first
			return stack.peek();
		} else if(!queue.isEmpty()){ //if stack is empty, then check front of queue
			return queue.peek();
		} else { //if both stack and queue are empty, the vq is empty, therefore return null
			return null;
		}
	}
	
	public T dequeue(){ //remove from front of vipqueue
		if(!stack.isEmpty()) {
			return stack.pop();
		} else if(!queue.isEmpty()) {
			return queue.dequeue();
		} else {
			return null;
		}
	}
	
	public void enqueue(T element){ //add to rear of vipqueue
		if(stack.isEmpty()) {
			stack.push(element);
		} else {
			queue.enqueue(element);
		}
	}
	
	public void vipEnqueue(T element){ //add to front of vipqueue
		stack.push(element);
	}
}
