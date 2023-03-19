package methodAssignment;

public class ReturnProduct {
	double number1 = 12.5;
	double number2 = 34.5;
	 double multiply = number1*number2;
	 
	
	public void product()
	{
		System.out.println(" Product of two double numbers is " + multiply);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturnProduct obj = new ReturnProduct();
		obj.product();

	}

}
