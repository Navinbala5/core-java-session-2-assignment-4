import java.util.Scanner;

public class EighthAssignment {

	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	System.out.println("enter the marks and age of the student");
	int marks =s.nextInt();
	int age =s.nextInt();
	
		

	if(marks>70&& age>=15)
	{
		System.out.println("A grade");
	
	}
	else if(marks>60&& age<15)
	{
		System.out.println("A grade and age less than 15 "); 

	}
	
	else if(marks>61&& marks<=70&& age>=15)
	{
		System.out.println("B grade");	
	
	}
	
	else if(marks>45&& marks<=60&& age<15)
	{
		System.out.println("B grade and age less than 15 ");
		
	}
	
	else if(marks<61&& age>=15)
	{
		System.out.println("C grade");
		
	
	}
	else if(marks<45 && age<15)
	{
		System.out.println("C grade and age less than 15 ");
		
	}
	
		
	
		
		
 
	}
	
}


	
