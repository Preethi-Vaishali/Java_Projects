import java.util.Scanner;

class Encapsul{

	private int age;
	private String eName;
	private String country;
	//Getter and Setter methods
	public int getAge() {
		return age;
	}
	public String getName() {
		return eName ;
	}
	public String getCountry() {
		return country ;
	}
	public void setCountry(String newvalue) {
		country= newvalue;
	}
	public void setName(String newvalue) {
		eName=newvalue;
		
	}
	public void setAge(int newvalue) {
		age=newvalue;
		
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		Encapsul obj=new Encapsul();
		Scanner s= new Scanner(System.in);
		String Name = s.nextLine();
		int age = s.nextInt();
		String country = s.next();
		obj.setName(Name);
		obj.setCountry(country);
		obj.setAge(age);
		System.out.println("Name: "+obj.getName());
		System.out.println("Age: "+obj.getAge());
		System.out.println("Country: "+obj.getCountry());
		s.close();
	}


	}


