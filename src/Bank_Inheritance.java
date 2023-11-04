class Bank{
	int acc = 1305;
	String name = "Ravi";
	float amount = 3000;
	
}
public class Bank_Inheritance extends Bank{
	void deposit(int amount) {
		this.amount+= amount;
	}
	void withdraw(int amount) {
		this.amount-= amount;
	}

	public static void main(String[] args) {
		Bank_Inheritance b = new Bank_Inheritance();
		b.deposit(1000);
		System.out.println("Account Number: "+b.acc);
		System.out.println("Name: "+b.name);
		System.out.println("Amount: "+b.amount);

	}

}
