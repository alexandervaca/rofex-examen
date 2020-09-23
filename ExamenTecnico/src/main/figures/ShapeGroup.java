package main.figures;

import java.util.ArrayList;
import java.util.List;

/**
 * This class implement a CareTaker of Memento pattern.
 * @author Alex
 *
 */
public class ShapeGroup implements Shape {

	private List<Memento> mementoList = new ArrayList<Memento>();

	public void add(Memento state) {
		mementoList.add(state);
	}

	public Memento get(int index) {
		return mementoList.get(index);
	}

	@Override
	public void draw() {
		System.out.println("ShapeGroup:");
		if (mementoList != null && !mementoList.isEmpty()) {
			for (Memento memento : mementoList) {
				memento.getState().draw();
			}
		}
	}

	@Override
	public String getType() {
		return "ShapeGroup";
	}
}
