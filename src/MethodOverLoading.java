class Overload
{
	void demo(int a) {
		System.out.println("a: "+a);
	}
	void demo(int a, int b) {
		System.out.println("a and b: "+a+", "+b);
	}
	double demo(double a) {
		System.out.println("double a: "+ a);
		return a*a;
	}
}
public class MethodOverLoading {

	public static void main(String[] args) {
		Overload ob = new Overload();
		double result;
		ob.demo(10);
		ob.demo(10, 20);
		result = ob.demo(5.5);
		System.out.println("O/P: "+ result);

	}

}
