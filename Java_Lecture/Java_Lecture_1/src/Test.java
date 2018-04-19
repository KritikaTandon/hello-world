
public class Test {
	
	public static void main (String[] args)
	{
		
		Test M = new Test();
		M.hello();
		M.array();
		
	//	System.out.println(TestMethod(1,'c', "abc", 1.23));
		
		Home H = new Home();
		H.i++;
		
		Home H1 = new Home();
		System.out.println(H1.i);

	}
	
	public static String TestMethod(int a, char b, String c, double d)
	{
		System.out.println("inside Static method");
		return a + b + c+ d;
		 
	}
	
	public void hello()
	{
		System.out.println("inside non-Static method");
		System.out.println(TestMethod(1,'c', "abc", 1.23));
	}
	
	public void array(){
		
		int table[][] = new int[3][3];
		
		//String month[] = {"jan", "feb"};
		
		for (int i=0; i< table.length; i++)
		{
			for (int j=0; j< table.length; j++)
			{
			System.out.println(table[i][j]);
			}
		}
	}
}
