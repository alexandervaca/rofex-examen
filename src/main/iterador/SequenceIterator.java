package main.iterador;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

@SuppressWarnings({"rawtypes", "unchecked"})
public class SequenceIterator {
	private List<Iterator> iteratorChain = new ArrayList<Iterator>();
	private int currentIteratorIndex = 0;
	private Iterator<Comparable> currentIterator = null;
	private Iterator<Comparable> lastUsedIterator = null;

	private TreeMap treeMap = new TreeMap();
	private Iterator<Comparable> iteratorSequences;

	public SequenceIterator(Collection<Iterator<Comparable>> inputs) {
		for (Iterator it = inputs.iterator(); it.hasNext();) {
			Iterator item = (Iterator) it.next();
			if (item == null) {
				throw new NullPointerException("Iterator must not be null");
			}
			iteratorChain.add(item);
		}
		buildTreeMap();
	}

	public boolean hasNext() {
		return iteratorSequences.hasNext();
	}

	public Comparable next() {
		return iteratorSequences.next();
	}

	private void buildTreeMap() {
		while (hasNextAux()) {
			Object elem = nextAux();
			treeMap.put(elem, elem);
		}
		iteratorSequences = treeMap.values().iterator();
	}

	private void updateCurrentIterator() {
		if (currentIterator == null) {
			if (iteratorChain.isEmpty()) {
				currentIterator = Collections.EMPTY_LIST.iterator();
			} else {
				currentIterator = (Iterator) iteratorChain.get(0);
			}
			lastUsedIterator = currentIterator;
		}

		while (!currentIterator.hasNext() && currentIteratorIndex < iteratorChain.size() - 1) {
			currentIteratorIndex++;
			currentIterator = (Iterator) iteratorChain.get(currentIteratorIndex);
		}
	}

	private boolean hasNextAux() {
		updateCurrentIterator();
		lastUsedIterator = currentIterator;
		return currentIterator.hasNext();
	}

	private Object nextAux() {
		updateCurrentIterator();
		lastUsedIterator = currentIterator;
		return currentIterator.next();
	}
}
