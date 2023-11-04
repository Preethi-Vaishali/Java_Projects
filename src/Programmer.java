class Employee{
	int sal = 40000;
}
public class Programmer extends Employee{
	int bonus = 10000;

	public static void main(String[] args) {
		Programmer p = new Programmer();
		
		System.out.println("Salary: "+p.sal);
		System.out.println("Bonus: "+p.bonus);
	

	}

}
