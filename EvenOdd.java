package methodAssignment;

public class EvenOdd {
	
	int number;
	int remainder;
	
	public boolean calculateevenodd(int number)
	{
       if(number%2==0)
       {
			System.out.println("Number is even");
			return true;
			}
       
       else
    	   System.out.println("Number is odd");
             return false;
    			  
	}
		
	
		public static void main(String[] args) {
		
		EvenOdd obj1 = new EvenOdd();
		obj1.calculateevenodd(25);
		

	}

}
