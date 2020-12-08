package stack;

public class StackImplementation<E> implements StackInterface<E> {

	private StackImplementation<E> node;
	private E item;
	
	public StackImplementation() {}
	
	StackImplementation(StackImplementation<E> node, E item) {
		this.node = node;
		this.item = item;
	}
	
	@Override
	public E push(E item) {
		this.node = new StackImplementation<E>(this.node, this.item);
		this.item = item;
		return this.item;
	}

	@Override
	public E pop() {
		if(this.isEmpty()) {
			return (E) "Stack is empty";
		}
		E top = this.item;
		this.item = this.node.item;
		this.node = this.node.node;
		
		return top;
	}

	@Override
	public E peek() {
		if(this.isEmpty()) {
			return (E) "Stack is empty";
		} else {
			return this.item;
		}
	}

	@Override
	public boolean isEmpty() {
		return this.node == null;
	}

	@Override
	public int length() {
		if(this.isEmpty()) {
			return 0;
		} else {
			return 1 + this.node.length(); 
		}
	}

	@Override
	public int search(Object newObject) {
		int counter = 1;
		for(StackImplementation<E> stack = this; !stack.isEmpty(); stack = stack.node) {
			if(stack.item.equals(newObject)) {
				return counter;
			}
			counter++;
		}
		return 0;
	}
}
