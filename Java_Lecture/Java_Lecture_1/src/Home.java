
public class Home {

	int i = 10;
	static int num1 = 10;
	static int num2 = 20;
	
	public static void main(String[] args)
	{
		Home Calc = new Home();
		System.out.println(Calc.Add(num1, num2));
		System.out.println(Calc.Sub(num1, num2));
		System.out.println(Calc.Mul(num1, num2));
		System.out.println(Calc.Div(num2, num1));
		int x = (int)(Math.random()*4);
		System.out.println(x);
	}
	
	public int Add (int a, int b)
	{
		return a+b;
	}
	
	public int Sub (int a, int b)
	{
		return a-b;
	}
	
	public int Mul (int a, int b)
	{
		return a*b;
	}
	
	public int Div (int a, int b)
	{
		return a/b;
	}
}
