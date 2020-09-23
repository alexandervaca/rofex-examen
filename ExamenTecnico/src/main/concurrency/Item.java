package main.concurrency;

public class Item {
	private int value1;
	private int value2;

	public void setValue1(int v) {
		value1 = v;
	}
	public void setValue2(int v) {
		value2 = v;
	}
	public int getValue1() {
		return value1;
	}
	public int getValue2() {
		return value2;
	}
	@Override
	public String toString() {
		return "Item: value1=" + value1 + ", value2=" + value2;
	}
}