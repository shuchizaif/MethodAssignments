package methodAssignment;

public class EligibleVoting {

	int age;
	
	public boolean agecheck(int age)
	{
		if (age>=18)
			{
			System.out.println("Eligible for voting : Your age is " + age);
			
		return true;
			}
		else 
			System.out.println("Not eligible to vote : Your age is " + age);
		return false;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
		EligibleVoting obj1 = new EligibleVoting();
		obj1.agecheck(10);
	}

}
