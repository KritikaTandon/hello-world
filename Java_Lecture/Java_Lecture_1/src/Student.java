
public class Student {

	String name;
	int roll;
	int age;
	
	public  Student()
	{
		System.out.println("Adding constructor class");
	}
	
	public Student(String N, int R, int A)
	{
		this.name = N;//this.name Refers to the global variable
		this.roll = R;
		this.age = A;
	}
	// scenario we need data for 1000 students , hence we can't create new objects for each
	//CONSTRUCTOR: no return type ; same name as class name; called automatically when object of class is called
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "A";
		s1.roll = 1;
		s1.age = 19;
				
		Student s2 = new Student();
		s2.name = "B";
		s2.roll = 2;
		s2.age = 20;
		
		Student s3 = new Student("C", 3, 20);
		System.out.println("Argumented constructor details:" + s3.name +s3.roll+ s3.age);
		
		
	}

}
