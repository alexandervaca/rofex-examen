package main.concurrency;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MemoryStorage implements ConcurrentMemoryStore {

	private Map<String, Item> storage;

	public MemoryStorage() {
		this.storage = new ConcurrentHashMap<String, Item>();
	}

	@Override
	public void store(String key, Item item) throws IllegalArgumentException {
		if (this.storage.containsKey(key)) {
			throw new IllegalArgumentException("Ya existe un valor asociado a la clave: " + key);
		}
		this.storage.put(key, item);
	}

	@Override
	public void update(String key, int value1, int value2) {
		if (key != null && this.storage.containsKey(key)) {
			Item item = this.storage.get(key);
			item.setValue1(value1);
			item.setValue2(value2);
		}
	}

	@Override
	public Iterator<Item> valueIterator() {
		if (this.storage != null && !this.storage.isEmpty()) {
			return this.storage.values().iterator();
		} else {
			return Collections.emptyIterator();
		}
	}

	@Override
	public void remove(String key) {
		if (key != null && this.storage.containsKey(key)) {
			this.storage.remove(key);
		}
	}

}
