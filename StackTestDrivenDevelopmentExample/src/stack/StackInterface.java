package stack;

public interface StackInterface<E> {
	E push(E item);
	E pop();
	E peek();
	boolean isEmpty();
	int length();
	int search(Object o);
}
