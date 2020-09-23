package main.figures;

public class Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Triangle");		
	}

	@Override
	public String getType() {
		return "Triangle";
	}

}
