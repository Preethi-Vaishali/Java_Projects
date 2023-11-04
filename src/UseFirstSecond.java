class ClassFirst{
	public void display() {
		System.out.println("Class First: Display");
	}
	public  void show() {
		System.out.println("Class First: Show");
	}
}
class ClassSecond extends ClassFirst{
	//Overridden method display()
	public void display() {
		System.out.println("Class Second: Display");
	}
	//Cannot override with different access specifier
	//protected void show(){}
	public void show() {
		System.out.println("Class Second: Show");
	}
}
public class UseFirstSecond {

	public static void main(String[] args) {
		//ClassFirst cs = new ClassSecond(); this also can be written instead of the below line
		ClassSecond cs = new ClassSecond();
		cs.display();
		cs.show();

	}

}
