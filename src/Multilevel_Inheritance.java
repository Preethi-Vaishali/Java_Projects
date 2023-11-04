class grand_father{
	void show1() {
		System.out.println("I am show function in grand_father class ");
	}
}

class father extends grand_father{
	void show2() {
		System.out.println("I am show function in father class ");
	}
}

class son extends father{
	void show3() {
		System.out.println("I am show function in son class ");
	}
}

class grand_son extends son{
	void show4() {
		System.out.println("I am show function in grand_son class ");
	}
}
public class Multilevel_Inheritance {

	public static void main(String[] args) {
		grand_son o = new grand_son();
		o.show4();
		o.show3();
		o.show2();
		o.show1();

	}

}
