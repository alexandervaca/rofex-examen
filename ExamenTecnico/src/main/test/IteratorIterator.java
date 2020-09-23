package main.test;

import java.util.Arrays;
import java.util.Iterator;

public class IteratorIterator<T> implements Iterator<T> {
	private final Iterator<T> is[];
	private int current;

	@SuppressWarnings("unchecked")
	public IteratorIterator(Iterator<T>... iterators) {
		is = iterators;
		current = 0;
	}

	public boolean hasNext() {
		while (current < is.length && !is[current].hasNext())
			current++;

		return current < is.length;
	}

	public T next() {
		while (current < is.length && !is[current].hasNext())
			current++;

		return is[current].next();
	}

	public void remove() {}

	@SuppressWarnings("unchecked")
	public static void main(String... args) {
		Iterator<Integer> a = Arrays.asList(1,3,5,7).iterator();
		Iterator<Integer> b = Arrays.asList(2,4,6,8).iterator();
		Iterator<Integer> c = Arrays.asList(0,10,20,30).iterator();

		Iterator<Integer> ii = new IteratorIterator<Integer>(a, b, c);

		while (ii.hasNext()) {
			System.out.print(ii.next() + " ");
		}
	}
}
