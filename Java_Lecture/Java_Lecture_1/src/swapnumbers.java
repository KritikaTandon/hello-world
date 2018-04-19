
// -----JAVA Only supports pass by reference and not pass by value
public class swapnumbers {
	
	int num1;
	int num2;	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapnumbers s = new swapnumbers();
		s.num1 = 1;
		s.num2 = 99;
		
		s.swapbyvalue(s.num1, s.num2);	
		System.out.println("Pass by value num1:" + s.num1);
		System.out.println("Pass by value num2:" + s.num2);
		
		s.swapbyreference(s);
		System.out.println("Pass by reference num1:" + s.num1);
		System.out.println("Pass by reference num2:" + s.num2);
		}
																																																																																																																																												
	public void swapbyvalue (int a, int b){
		int t = a;
		a = b;
		b = t;
	}
	
	public void swapbyreference (swapnumbers r){
		int temp = r.num1;
		r.num1 = r.num2;
		r.num2 = temp;	
	}
	
}
