
public class A {
	int a = 20;
	int b = 10;

	public static void main(String[] args) 
	{
		System.out.println("main start");
		System.out.println("branch 1");

		A a = new A();
		a.mul();
		a.add();
	}

	public void add()
	{
		int c = a+b;
		System.out.println("addition is"+c);
	}
	
	public void mul()
	{
		int c = a*b;
		System.out.println("mul is"+c);
	}
	
}
