abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing rectangle");
	}
}

class Circle1 extends Shape{
	void draw() {
		System.out.println("Drawing circle");
	}
}

public class TestAbstraction1 {

	public static void main(String[] args) {
		Shape r= new Rectangle();
		Shape s= new Circle1();// In a real secnario, object is provided through method, e.g., getShape() method
		s.draw();
		r.draw();
	}

}
