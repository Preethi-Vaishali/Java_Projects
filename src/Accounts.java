
import java.util.Scanner;
import java.io.*;

public class Accounts {
	static int Acc_id;
	static String Acc_name,add;
	static long con;
	static float Dep_amount;
	
	
	static void display(int Acc_id, String Acc_name, String add, long con, float Dep_amount) {
		System.out.println();
		System.out.println("Account Holder Details");
		System.out.println("Acc_Id:"+Acc_id);
		System.out.println("Acc_Name: "+Acc_name);
		System.out.println("Address ="+ add);
		System.out.println("Contact: "+con);
		System.out.println("Amount: "+Dep_amount);
	
	}

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Account Id: ");
		Acc_id = s.nextInt();
		System.out.print("Enter the Account name: ");
		Acc_name = s.next();
		System.out.print("Enter Address: ");
		//num= s.nextInt();
		//add = s.nextLine();
		DataInputStream obj = new DataInputStream(System.in);
		add = obj.readLine();
		System.out.print("Enter Contact: ");
		con = s.nextLong();
		System.out.print("Enter Deposit amount: ");
		Dep_amount = s.nextFloat();
		display(Acc_id, Acc_name, add, con, Dep_amount);
		s.close();
	
	}

}
