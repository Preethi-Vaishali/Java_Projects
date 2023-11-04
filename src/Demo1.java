interface MyInterface{
	/* compiler will treat them as:
	 * public abstract void method1();
	 * public abstract void method()2;
	 */
	public void method1();
	public void method2();
}

public class Demo1 implements MyInterface {
	public void method1() {
		System.out.println("Implementation of method1");
	}
	public void method2() {
		System.out.println("Implementation of method2");
	}

	public static void main(String[] args) {
		MyInterface obj = new Demo1();
		obj.method1();
		obj.method2();

	}

}
