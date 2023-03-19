package methodAssignment;

public class AreaCircumfrence {
	
	
	int radius =5;
	
	public void calculateArea()
	{
		double area = 3.14*5*5;
		System.out.println(" Area of Circle will be " + area);
	}
	public void Circumference()
	{
		double perimeter = 2*3.14*5;
		System.out.println(" Perimeter of Circle will be " + perimeter);
	}

	public static void main(String[] args) {
		
	    AreaCircumfrence obj1 = new AreaCircumfrence();
		obj1.calculateArea();
		AreaCircumfrence obj2 = new AreaCircumfrence();
		obj2.Circumference();
		
			
		}

	}


