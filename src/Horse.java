
public class Horse extends Animal{
	public void sound() {
		super.sound();
		//super keyword is used to call the method of parent class
		System.out.println("Neigh");
	}

	public static void main(String[] args) {
		
		Animal ob = new Horse();
		ob.sound();
	}

}
