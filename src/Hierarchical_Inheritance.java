class parents{
	void show() {
		System.out.println("We are parents");
	}
}

class dson extends parents{
	void disp() {
		System.out.println("I am dson class ");
	}
}

class daughter extends parents{
	void disp() {
		System.out.println("I am daughter class ");
	}
}
public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		dson i = new dson();
		daughter d = new daughter();
		i.show();
		d.show();
		i.disp();
		d.disp();
	}

}
