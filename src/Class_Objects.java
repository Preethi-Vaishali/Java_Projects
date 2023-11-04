import java.util.Scanner;

public class Class_Objects {
	static int id;
	static String name;
	static int m1, m2, m3;
	//static float ttl, avg;
	
	static void display(int id, String name, int m1, int m2, int m3) {
		float ttl, avg;  //local variable
		ttl = m1+m2+m3;
		avg = ttl/3;
		System.out.println();
		System.out.println("Student Details");
		System.out.println("Student Id:"+id);
		System.out.println("Student Name: "+name);
		System.out.println("Mark1: "+m1);
		System.out.println("Mark2: "+m2);
		System.out.println("Mark3: "+m3);
		System.out.println("Total: "+ttl);
		//System.out.println("Average: "+avg);
		System.out.printf("Average: %.2f",avg);
	
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Student Id: ");
		id = s.nextInt();
		System.out.print("Enter the Student Name: ");
		name = s.next();
		System.out.print("Enter Mark 1: ");
		m1 = s.nextInt();
		System.out.print("Enter Mark 2: ");
		m2 = s.nextInt();
		System.out.print("Enter Mark 3: ");
		m3 = s.nextInt();
		display(id, name, m1, m2, m3);
		s.close();

	}

}
