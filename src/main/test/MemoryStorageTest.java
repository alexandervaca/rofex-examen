package main.test;

import java.util.Iterator;

import main.concurrency.ConcurrentMemoryStore;
import main.concurrency.Item;
import main.concurrency.MemoryStorage;

import org.junit.Test;

public class MemoryStorageTest {

	@Test
	public void test() {
		ConcurrentMemoryStore memoryStorage = new MemoryStorage();
		initStorage(memoryStorage);
		System.out.println("memoryStorage init");
		printValues(memoryStorage);

		System.out.println("memoryStorage before modification");
		memoryStorage.update("5", 51, 555);
		memoryStorage.update("7", 71, 777);
		memoryStorage.remove("1");
		System.out.println("memoryStorage after modification");
		printValues(memoryStorage);
	}

	private void printValues(ConcurrentMemoryStore memoryStorage) {
		Iterator<Item> it = memoryStorage.valueIterator();
		while (it.hasNext()) {
			Item item = (Item)it.next();
			System.out.println(item);
		}
	}

	private void initStorage(ConcurrentMemoryStore memoryStorage) {
		memoryStorage.store("1", buildItem(10, 11));
		memoryStorage.store("2", buildItem(20, 22));
		memoryStorage.store("3", buildItem(30, 33));
		memoryStorage.store("4", buildItem(40, 44));
		memoryStorage.store("5", buildItem(50, 55));
		memoryStorage.store("6", buildItem(60, 66));
		memoryStorage.store("7", buildItem(70, 77));
		memoryStorage.store("8", buildItem(80, 88));
		memoryStorage.store("9", buildItem(90, 99));
		memoryStorage.store("10", buildItem(100, 111));
	}

	private Item buildItem(int val1, int val2) {
		Item item = new Item();
		item.setValue1(val1);
		item.setValue2(val2);
		return item;
	}
}
