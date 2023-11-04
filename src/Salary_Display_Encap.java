import java.util.Scanner;
class Sal{
	private int ID;
	private double sal;
	private String Name;
	public int getID() {
		return ID;
	}
	public double getSal() {
		return sal;
	}
	public String getName() {
		return Name;
	}
	public void setName(String n) {
		Name =n;
	}
	public void setSal(double s) {
		sal = s;
	}
	public void setID(int i) {
		ID =i;
	}

}
public class Salary_Display_Encap {
	public static void main(String[] args) {
		Sal o = new Sal();
		Scanner s = new Scanner(System.in);
		int id= s.nextInt();
		s.nextLine();
		String name = s.nextLine();
		double Sal = s.nextDouble();
			
		o.setID(id);
		o.setName(name);
		o.setSal(Sal);
		System.out.println("Employee Details:");
		System.out.println("ID: "+o.getID());
		System.out.println("Name: "+o.getName());
		System.out.printf("Salary: $%.2f",o.getSal());
		s.close();
		

}
}