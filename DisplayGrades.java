package methodAssignment;



public class DisplayGrades {
	
	String grades[] = {"AA","AB","BB","BC","CD","DD","FAIL"};
	
	
	public void gradenumbers(int marks)
	{
		if(marks<=40)
		{ 
			System.out.println("FAIL");
		}
		
		else if ((marks > 91) && (marks < 100))
		{
			System.out.println("Grade is AA");
		}
		else if ((marks > 81) && (marks < 90))
		{
			System.out.println("Grade is AB");
		}
		else if ((marks > 71) && (marks < 80))
		{
			System.out.println("Grade is BB");
		}
		else if ((marks > 61) && (marks < 70))
		{
			System.out.println("Grade is BC");
		}
		else if ((marks > 51) && (marks < 60))
		{
			System.out.println("Grade is CD");
		}
		else if ((marks > 41) && (marks < 50))
		{
			System.out.println("Grade is DD");
		}
		
	}
	
			
	
	public static void main(String[] args) {
		DisplayGrades obj = new DisplayGrades();
		obj.gradenumbers(68);

	}

}
