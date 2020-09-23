package main.figures;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle");		
	}

	@Override
	public String getType() {
		return "Circle";
	}

}
