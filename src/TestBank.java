abstract class Bank1{
	abstract int getRateofIntrest();
}
class SBI extends Bank1{
	int getRateofIntrest() {
		return 7;
	}
}
class PNB extends Bank1{
	int getRateofIntrest() {
		return 8;
	}
}
public class TestBank {

	public static void main(String[] args) {
	Bank1 b;
	b = new SBI();
	System.out.println("Rate of Intrest is: "+b.getRateofIntrest()+"%");
	b = new PNB();
	System.out.println("Rate of Intrest is: "+b.getRateofIntrest()+"%");

	}

}
