import java.util.Scanner;

public class Constructor1 {
	int emp_id, sal;
	String emp_name;
	Constructor1(){
		// default constructor- no parameters inside the constructor method(empty inside the constructor method)
		emp_id = 1;
		emp_name = "Hema";
		sal = 20000;
		
	}
	Constructor1(int id, String name, int sala){
		//parameterized constructor
		emp_id = id;
		emp_name = name;
		sal = sala;
				
	}
	
	void display() {
		System.out.println("Employee Details:");
		System.out.println("Emp_id: "+ emp_id);
		System.out.println("Emp_name: "+ emp_name);
		System.out.println("Salary: "+ sal);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int id, sala; String name;
		System.out.print("Employee id: ");
		id = s.nextInt();
		System.out.print("Employee name: ");
		name = s.next();
		System.out.print("Salary: ");
		sala= s.nextInt();
		Constructor1 obj = new Constructor1();
		obj.display();
		Constructor1 obj1 = new Constructor1(2,"Vinod", 25000);
		obj1.display();
		Constructor1 obj2 = new Constructor1(id, name, sala);
		obj2.display();

	}

}
