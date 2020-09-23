package main.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class IteratorTest {

	@Test
	public void test() {
		List<Integer> l1 = Arrays.asList(1, 3, 5, 7, 9, 11, 15, 17);
		List<Integer> l2 = Arrays.asList(2, 4, 6, 8, 10, 12, 16, 18);
		List<Integer> sorted = merge(l1.iterator(), l2.iterator());
		for (Integer num: sorted) {
			System.out.print(num + " ");
		}
	}

	public static List<Integer> merge(Iterator<Integer> it1, Iterator<Integer> it2) {
		List<Integer> res = new ArrayList<>();
		Integer v1 = it1.hasNext() ? it1.next() : null;
		Integer v2 = it2.hasNext() ? it2.next() : null;
		while (v1 != null && v2 != null) {
			if (v1 < v2) { // pick the smaller one
				res.add(v1);
				v1 = it1.hasNext() ? it1.next() : null;
			} else {
				res.add(v2);
				v2 = it2.hasNext() ? it2.next() : null;
			}
		}
		while (v1 != null) {
			res.add(v1);
			v1 = it1.hasNext() ? it1.next() : null;
        }
		while (v2 != null) {
			res.add(v2);
			v2 = it2.hasNext() ? it2.next() : null;
		}
		return res;
	}
}
