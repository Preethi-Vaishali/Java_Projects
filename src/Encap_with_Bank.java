import java.util.Scanner;
class Bank2{
	private String ac_num;
	private float bal;
	public String getAcc() {
		return ac_num;
	}
	public float getBal() {
		return bal;
	}
	public void setAcc(String acc) {
		ac_num=acc;
	}
	public void setBal(float ac) {
		bal=ac;
	}
	
}
public class Encap_with_Bank {

	public static void main(String[] args) {
		Bank2 o= new Bank2();
		Scanner s= new Scanner(System.in);
		String Ac_nu = s.nextLine();
		float Bal = s.nextFloat();
		o.setAcc(Ac_nu);
		o.setBal(Bal);
		System.out.println("Account Number: "+o.getAcc());
		System.out.println("Balance: "+o.getBal());
		s.close();

	}

}
