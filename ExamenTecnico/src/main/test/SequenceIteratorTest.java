package main.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import main.iterador.SequenceIterator;

import org.junit.Test;

@SuppressWarnings("rawtypes")
public class SequenceIteratorTest {

	@Test
	public void test() {
		SequenceIterator seq = new SequenceIterator(buildInputs());
		System.out.println("SequenceIterator\n");
		while (seq.hasNext()) {
			Object elem = seq.next();
			System.out.print(elem + " ");
		}
	}

	private Collection<Iterator<Comparable>> buildInputs() {
		Collection<Iterator<Comparable>> inputs = new ArrayList<Iterator<Comparable>>();
		int[] list1 = { 1, 3, 5, 7, 9 };
		int[] list2 = { 2, 4, 6, 8 };
		int[] list3 = { 0, 10, 20, 30 };

		inputs.add(buildIterators(list1));
		inputs.add(buildIterators(list2));
		inputs.add(buildIterators(list3));

		return inputs;
	}

	private Iterator<Comparable> buildIterators(int[] val) {
		Collection<Comparable> lista = new ArrayList<Comparable>();
		if (val != null && val.length > 0) {
			for (int i = 0; i < val.length; i++) {
				lista.add(new Integer(val[i]));
			}
		}
		return lista.iterator();
	}
}
