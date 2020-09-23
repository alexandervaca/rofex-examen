package main.figures;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square");		
	}

	@Override
	public String getType() {
		return "Square";
	}

}
