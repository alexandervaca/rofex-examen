package main.test;

import main.figures.Circle;
import main.figures.Memento;
import main.figures.Originator;
import main.figures.Shape;
import main.figures.ShapeGroup;
import main.figures.Square;

import org.junit.Test;

public class FigurasTest {

	@Test
	public void test() {
		// Circle alone
		Shape circle = new Circle();
		Originator ori1 = new Originator();
		ori1.setState(circle);
		ori1.getState().draw();

		// Square to group
		Square square = new Square();
		Originator ori2 = new Originator();
		ori2.setState(square);
		Memento squareMemento = ori2.saveStateToMemento();

		// group
		ShapeGroup shapeGroup = new ShapeGroup();
		shapeGroup.add(squareMemento);
		shapeGroup.draw();
		System.out.println("--------------------------------------");

		// ungroup
		Shape shape0 = shapeGroup.get(0).getState();
		shape0.draw();
	}
}
